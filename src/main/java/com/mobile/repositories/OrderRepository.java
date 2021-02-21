package com.mobile.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.mobile.model.Orders;

@Repository
@Transactional
public interface OrderRepository extends CrudRepository<Orders, Integer> {

}
