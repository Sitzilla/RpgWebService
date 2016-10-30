package com.evansitzes.models.repositories;

import com.evansitzes.models.entities.ItemEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by evan on 10/27/16.
 */
public interface ItemsRepository<entity extends ItemEntity> extends JpaRepository<entity, Long> {

}
