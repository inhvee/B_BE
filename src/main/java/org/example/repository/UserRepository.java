package org.example.repository;

import org.example.entity.State;
import org.example.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, User> {

    Optional<User> findByEmail(String email);
    List<User> findByState(State state);


}
