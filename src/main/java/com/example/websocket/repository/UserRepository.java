package com.example.websocket.repository;

import com.example.websocket.model.Status;
import com.example.websocket.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface UserRepository extends MongoRepository<User, String> {
    List<User> findAllByStatus(Status status);
}
