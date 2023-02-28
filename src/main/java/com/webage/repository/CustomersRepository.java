package com.webage.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.webage.domain.Customer;

public interface CustomersRepository extends MongoRepository<Customer, Long> {

}
