package com.example.Rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Rest.model.Employee;

@Repository
public interface EmployeesRepository extends JpaRepository<Employee,Long> {

}
