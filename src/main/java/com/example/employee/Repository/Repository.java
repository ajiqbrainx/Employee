package com.example.employee.Repository;

import com.example.employee.entity.Model;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Repository extends JpaRepository<Model,Integer> {
}
