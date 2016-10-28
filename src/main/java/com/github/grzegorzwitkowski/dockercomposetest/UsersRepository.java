package com.github.grzegorzwitkowski.dockercomposetest;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface UsersRepository extends MongoRepository<User, Integer> {

}
