package com.leon.blog.springblog.repository;

import com.leon.blog.springblog.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long > {
}
