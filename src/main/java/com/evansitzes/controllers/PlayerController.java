package com.evansitzes.controllers;

import com.evansitzes.models.PlayerItemContainer;
import com.evansitzes.models.repositories.PlayerItemsRepository;
import com.evansitzes.models.repositories.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by evan on 10/27/16.
 */
@Controller
@RequestMapping("/player")
public class PlayerController {

    @Autowired
    private PlayerRepository playerRepository;

    @Autowired
    private PlayerItemsRepository playerItemsRepository;

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public String getName() {
        return playerRepository.findById(1L).getName();
    }

    @RequestMapping(value = "/{player_id}/equipment", method = RequestMethod.GET)
    @ResponseBody
    public String getEquipment(@PathVariable(value="player_id") final long playerId) {
        return new PlayerItemContainer(playerItemsRepository.findAllEquippedByPlayerId(playerId)).getPlayerItemEntities();
//        return playerItemsRepository.findAllEquippedByPlayerId(playerId);
    }

}

