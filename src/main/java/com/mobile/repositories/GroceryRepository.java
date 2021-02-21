package com.mobile.repositories;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.mobile.model.Grocery;

@Repository
@Transactional
public interface GroceryRepository extends CustomerRepository<Grocery>{

}
