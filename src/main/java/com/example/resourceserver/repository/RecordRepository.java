package com.example.resourceserver.repository;

import com.example.resourceserver.domain.Record;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecordRepository extends ReactiveCrudRepository<Record, Long> {
}
