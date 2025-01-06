package com.example.user_service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends PagingAndSortingRepository<UserEntity, Long> {

    Optional<UserEntity> findByName(String name);

    @NonNull Optional<UserEntity> findById(@NonNull Long id);

    UserEntity save(UserEntity user);

    UserEntity update(Long id, UserEntity user);

    List<UserEntity> findAll();

    void delete(Long id);
}
