package com.swiggy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.swiggy.dto.UserRegister;
import com.swiggy.entity.UserEntity;

@Repository
public interface UserRepository extends CrudRepository<UserEntity, String>{

	UserEntity findByEmailIdAndPassword(String emailId, String password);

}
