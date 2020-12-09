package com.managment.palladium.dao;


import com.managment.palladium.entities.Employee;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface EmployeeRepository extends PagingAndSortingRepository<Employee, Long> {

    public Employee findByEmail(String value);

    public Employee findByEmployeeId(long theId);

}
