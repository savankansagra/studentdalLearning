package com.greentree.dev.flightreservation.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.greentree.dev.flightreservation.entites.User;

public interface UserRepository extends JpaRepository<User, Long> {

	@Query(value="select * from USER where EMAIL = :email", nativeQuery=true)
    User findByEmail(@Param("email") String email) ;

}
