package com.algomesti.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.algomesti.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {

}
