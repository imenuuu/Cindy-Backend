package com.app.cindy.repository;

import com.app.cindy.domain.user.User;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface UserRepository extends JpaRepository<User, Long> {

    @EntityGraph(attributePaths = "authorities")
    Optional<User> findOneWithAuthoritiesByUsername(String username);

//    @EntityGraph(attributePaths = "authorities")
//    Optional<User> findOneWithAuthoritiesById(Long userId);


    User findByUsername(String username);


    boolean existsByUsername(String userId);

    boolean existsByNickname(String nickname);


}
