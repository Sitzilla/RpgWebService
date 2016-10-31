package com.evansitzes.models;

import com.evansitzes.models.entities.PlayerItemEntity;

import java.util.ArrayList;

/**
 * Created by evan on 10/27/16.
 */
public class PlayerItemContainer {
    private ArrayList<PlayerItemEntity> playerItemEntities = new ArrayList<>();

    public PlayerItemContainer(final ArrayList<PlayerItemEntity> playerItemEntities) {
        this.playerItemEntities = playerItemEntities;
    }

    public String getPlayerItemEntities() {
        return "{entity:" + playerItemEntities + "}";
    }
}
