package com.sprinttwo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sprinttwo.dto.Admin;




@Repository
public interface AdminRepository extends JpaRepository<Admin,Integer>{

}
