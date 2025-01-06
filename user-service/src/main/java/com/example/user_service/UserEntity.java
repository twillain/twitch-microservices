package com.example.user_service;

import com.example.user_service.entities.Role;
import com.example.user_service.utils.Buildable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "user")
public class UserEntity {

    @Id
    @Column(nullable = false, unique = true, name = "user_id") //Working with Twitch User Id
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private Role role;

    @Column(nullable = false)
    private Integer numberMessagesSent;

    @Column(nullable = false)
    private Integer counter;

    @Column
    private String chatColor;

    @Column
    private String followedAt;

    @Column
    private Long subId;

    @Column
    private int totalSubGifted;


    private UserEntity(){

    }

    private UserEntity(Builder builder){
        this.id = builder.id;
        this.name = builder.name;
        this.role = builder.role;
        this.numberMessagesSent = builder.numberMessagesSent;
        this.counter = builder.counter;
        this.chatColor = builder.chatColor;
        this.followedAt = builder.followedAt;
        this.subId = builder.subId;
        this.totalSubGifted = builder.totalSubGifted;
    }

    public Long getId(){
        return this.id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public Role getRole(){
        return this.role;
    }

    public void setRole(Role role){
        this.role = role;
    }

    public Integer getNumberMessagesSent(){
        return this.numberMessagesSent;
    }

    public void setNumberMessagesSent(Integer numberMessagesSent){
        this.numberMessagesSent = numberMessagesSent;
    }

    public Integer getCounterValue(){
        return this.counter;
    }

    public void setCounterValue(Integer counter){
        this.counter = counter;
    }

    public String getChatColor(){
        return this.chatColor;
    }

    public void setChatColor(String chatColor){
        this.chatColor = chatColor;
    }

    public String getFollowedAt(){
        return this.followedAt;
    }

    public void setFollowedAt(String followedAt){
        this.followedAt = followedAt;
    }

    public Integer getCounter() {
        return counter;
    }

    public void setCounter(Integer counter) {
        this.counter = counter;
    }

    public Long getSub() {
        return this.subId;
    }

    public void setSub(Long subId) {
        this.subId = subId;
    }

    public int getTotalSubGifted(){
        return this.totalSubGifted;
    }

    public void setTotalSubGifted(int totalSubGifted){
        this.totalSubGifted = totalSubGifted;
    }


    public static class Builder implements Buildable<UserEntity> {

        private Long id;
        private String name;
        private Role role = Role.VIEWER;
        private Integer numberMessagesSent = 0;
        private Integer counter = 0;
        private String chatColor = "";
        private String followedAt = "";
        private Long subId = null;
        private int totalSubGifted = 0;

        public Builder withName(String name){
            this.name = name;
            return this;
        }

        public Builder withId(Long id){
            this.id = id;
            return this;
        }

        public Builder withId(String id){
            this.id = Long.parseLong(id);
            return this;
        }

        public Builder withRole(Role role){
            this.role = role;
            return this;
        }

        public Builder withNumberMessagesSent(Integer numberOfMessengesSent){
            this.numberMessagesSent = numberOfMessengesSent;
            return this;
        }

        public Builder withCounter(Integer counter){
            this.counter = counter;
            return this;
        }

        public Builder withChatColor(String chatColor){
            this.chatColor = chatColor;
            return this;
        }

        public Builder withFollowedAt(String followedAt){
            this.followedAt = followedAt;
            return this;
        }

        public Builder withSubId(Long subId){
            this.subId = subId;
            return this;
        }

        public Builder withTotalSubGifted(int totalSubGifted){
            this.totalSubGifted = totalSubGifted;
            return this;
        }

        @Override
        public UserEntity build() {
            return new UserEntity(this);
        }

    }

    
}
