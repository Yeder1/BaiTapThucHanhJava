package com.example.BaiTapThucHanhJava.repository;

import com.example.BaiTapThucHanhJava.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepository extends JpaRepository<User, Long> {
    @Query("SELECT u FROM User WHERE u.username = ?1 ")
    User findByUsername(String username);
}
