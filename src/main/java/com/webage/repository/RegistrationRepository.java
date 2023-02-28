package com.webage.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.webage.domain.Registration;

public interface RegistrationRepository extends MongoRepository<Registration, Long>{

}
