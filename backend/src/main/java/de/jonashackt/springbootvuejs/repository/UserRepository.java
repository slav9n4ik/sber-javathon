package de.jonashackt.springbootvuejs.repository;

import de.jonashackt.springbootvuejs.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

public interface UserRepository extends MongoRepository<User, String> {
    Optional<User> findById(String id);
}