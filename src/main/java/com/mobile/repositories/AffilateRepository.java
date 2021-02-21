package com.mobile.repositories;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.mobile.model.Affilate;

@Repository
@Transactional
public interface AffilateRepository extends CustomerRepository<Affilate> {

}
