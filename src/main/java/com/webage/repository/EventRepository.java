package com.webage.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.webage.domain.Event;

public interface EventRepository extends MongoRepository<Event, Long> {

}
