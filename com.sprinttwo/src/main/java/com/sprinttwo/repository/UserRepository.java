package com.sprinttwo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sprinttwo.dto.User;


@Repository
public interface UserRepository extends JpaRepository<User,String>{// all the methods present in the JpaRepository can be used by UserRepository

}
