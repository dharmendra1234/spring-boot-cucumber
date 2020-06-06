package com.cucumber.springboot.poc.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cucumber.springboot.poc.entity.EmployeeEntity;

@Repository
public interface EmployeeDao extends CrudRepository<EmployeeEntity, Long> {}
