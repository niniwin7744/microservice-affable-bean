package com.example.apisecurity.dao;

import com.example.apisecurity.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserDao extends CrudRepository<User, Long> {
}
