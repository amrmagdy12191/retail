package com.mobile.repositories;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.mobile.model.Employee;

@Repository
@Transactional
public interface EmployeeRepository extends UserRepository<Employee>{


}
