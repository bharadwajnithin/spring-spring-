package com.example.security.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.security.model.EModel;

public interface ERepo extends MongoRepository<EModel, Integer> {

}
