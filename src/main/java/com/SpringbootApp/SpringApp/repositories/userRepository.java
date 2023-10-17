package com.SpringbootApp.SpringApp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SpringbootApp.SpringApp.userdetails.Users;

@Repository
public interface userRepository extends JpaRepository<Users, Long>{

}
