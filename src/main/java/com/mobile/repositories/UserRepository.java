package com.mobile.repositories;



import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.mobile.model.User;

@Repository
@Transactional
public interface UserRepository<T extends User> extends CrudRepository<User, Integer> {

}
