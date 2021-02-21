package com.mobile.repositories;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.mobile.model.Customer;

@Repository
@Transactional
public interface CustomerRepository<T extends Customer> extends UserRepository<Customer> {

}
