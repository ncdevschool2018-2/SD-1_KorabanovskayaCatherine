package com.netcracker.edu.backend.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class FavouriteSubscriptionPK implements Serializable {
    private long subId;
    private long userId;

    @Column(name = "sub_id", nullable = false)
    @Id
    public long getSubId() {
        return subId;
    }

    public void setSubId(long subId) {
        this.subId = subId;
    }

    @Column(name = "user_id", nullable = false)
    @Id
    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

}
