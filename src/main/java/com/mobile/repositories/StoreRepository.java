package com.mobile.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.mobile.model.Store;

@Repository
@Transactional
public interface StoreRepository extends CrudRepository<Store, Integer> {

}
