package com.example.backendSimplonGU.repository;

import com.example.backendSimplonGU.model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface AdminRepository extends JpaRepository<Admin, Long> {

    @Query("SELECT a FROM Admin a WHERE a.login=:login and a.motDePasse=:password")
    Admin findAdminByLoginAndPassword(@Param(value = "login") String login, @Param(value = "password") String password);
}
