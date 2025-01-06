package com.example.user_service.entities;

import com.example.user_service.UserEntity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class SubEntity {
    @Id
    private Long id;
    private UserEntity user;
    private String createdAt;
    private String endedAt;
    private String tier;
    private boolean isGift;
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public UserEntity getUser() {
        return user;
    }
    public void setUser(UserEntity user) {
        this.user = user;
    }
    public String getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }
    public String getEndedAt() {
        return endedAt;
    }
    public void setEndedAt(String endedAt) {
        this.endedAt = endedAt;
    }
    public String getTier() {
        return tier;
    }
    public void setTier(String tier) {
        this.tier = tier;
    }
    public boolean isGift() {
        return isGift;
    }
    public void setGift(boolean isGift) {
        this.isGift = isGift;
    }

    
}
