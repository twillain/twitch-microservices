package com.example.user_service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.user_service.entities.Role;

@Service
public class UserService {

    private final UserRepository userRepository;
    
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UserEntity getUserByTwitchId(String twitchId){
        return userRepository.findById(Long.parseLong(twitchId)).orElse(null);
    }

    public UserEntity getUserByTwitchId(Long twitchId){
        return userRepository.findById(twitchId).orElse(null);
    }

    public UserEntity getUserByName(String username){
        return userRepository.findByName(username).orElse(null);
    }

    public UserEntity createUser(UserEntity user){
        return userRepository.save(user);
    }

    public UserEntity getUserByIdOrCreateEntity(String id, String username){
        UserEntity userEntity = this.getUserByTwitchId(id);

        if (userEntity == null) {
            userEntity = new UserEntity.Builder()
                .withId(id)
                .withName(username)
                .withRole(Role.VIEWER)
                .withNumberMessagesSent(0)
                .withCounter(0)
                .build();

            userEntity = this.createUser(userEntity);
        }
        return userEntity;
    }


    public List<UserEntity> getAllUsers() {
        return userRepository.findAll();
    }

    public UserEntity updateUser(Long id, UserEntity user){
        return userRepository.update(id, user);
    }

    public void deleteUser(Long id){
        userRepository.delete(id);
    }


}

