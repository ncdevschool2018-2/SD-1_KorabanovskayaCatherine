package com.netcracker.edu.backend.entity;

import javax.persistence.*;

@Entity
@Table(name = "favourite-subscription", schema = "eduproject")
@IdClass(FavouriteSubscriptionPK.class)
public class FavouriteSubscription {
    private long subId;
    private long userId;

    @Id
    @Column(name = "sub_id", nullable = false)
    public long getSubId() {
        return subId;
    }

    public void setSubId(long subId) {
        this.subId = subId;
    }

    @Id
    @Column(name = "user_id", nullable = false)
    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

}
