package com.satishlabs.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.satishlabs.models.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
