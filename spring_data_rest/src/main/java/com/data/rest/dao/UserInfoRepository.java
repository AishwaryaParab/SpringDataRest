package com.data.rest.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.data.rest.entities.UserInfo;

public interface UserInfoRepository extends JpaRepository<UserInfo, Integer> {
	Optional<UserInfo> findByUsername(String username);
}
