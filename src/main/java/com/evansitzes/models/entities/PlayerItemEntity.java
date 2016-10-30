package com.evansitzes.models.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by evan on 10/27/16.
 */
@Entity
@Table(name = "player_items")
public class PlayerItemEntity {
    @Id
    @Column(name="id")
    private long id;

    @Column(name="player_id")
    private long playerId;

    @Column(name="item_name")
    private String itemName;

    @Column(name="equipped")
    private boolean equipped;

    public long getId() {
        return id;
    }

    public void setId(final long id) {
        this.id = id;
    }

    public long getPlayerId() {
        return playerId;
    }

    public void setPlayerId(final long playerId) {
        this.playerId = playerId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(final String itemName) {
        this.itemName = itemName;
    }

    public boolean isEquipped() {
        return equipped;
    }

    public void setEquipped(final boolean equipped) {
        this.equipped = equipped;
    }

    @Override
    public String toString() {
        return "PlayerItemEntity{" +
                "id=" + id +
                ", playerId=" + playerId +
                ", itemName='" + itemName + '\'' +
                ", equipped=" + equipped +
                '}';
    }
}
