package com.evansitzes.models.repositories;

import com.evansitzes.models.entities.PlayerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

/**
 * Created by evan on 10/27/16.
 */
public interface PlayerRepository <entity extends PlayerEntity> extends JpaRepository<entity, Long> {

    entity findById(@Param("id") long id);

}
