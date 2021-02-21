package com.mobile.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.mobile.model.Discount;

@Repository
@Transactional
public interface DiscountRepository extends CrudRepository<Discount, Integer> {

}
