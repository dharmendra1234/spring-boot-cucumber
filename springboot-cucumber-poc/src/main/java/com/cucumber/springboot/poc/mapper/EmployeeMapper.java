package com.cucumber.springboot.poc.mapper;

import org.mapstruct.Mapper;

import com.cucumber.springboot.poc.entity.Employee;
import com.cucumber.springboot.poc.entity.EmployeeEntity;
import com.cucumber.springboot.poc.entity.Phone;
import com.cucumber.springboot.poc.entity.PhoneEntity;

@Mapper(componentModel = "spring")
public interface EmployeeMapper {

  EmployeeEntity toEmployeeEntity(Employee employee);

  Employee toEmployee(EmployeeEntity employeeEntity);

  PhoneEntity toPhoneEntity(Phone phone);

  Phone toPhone(PhoneEntity phoneEntity);
}
