package com.tdso.hrworker.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tdso.hrworker.models.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {

}
