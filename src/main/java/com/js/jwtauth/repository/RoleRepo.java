package com.js.jwtauth.repository;

import com.js.jwtauth.entity.EnumRole;
import com.js.jwtauth.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepo extends JpaRepository<Role, Long> {
    Optional<Role> findByName(EnumRole name);
}
