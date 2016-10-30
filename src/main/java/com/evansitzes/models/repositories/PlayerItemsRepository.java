package com.evansitzes.models.repositories;

import com.evansitzes.models.entities.PlayerItemEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.ArrayList;

/**
 * Created by evan on 10/27/16.
 */
public interface PlayerItemsRepository <entity extends PlayerItemEntity> extends JpaRepository<entity, Long> {

    @Query("select e from #{#entityName} e where e.equipped = true and e.playerId = (:playerId)")
    ArrayList<entity> findAllEquippedByPlayerId(@Param("playerId") long playerId);

}

