package com.managment.palladium;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import com.managment.palladium.entities.Employee;
import com.managment.palladium.services.EmployeeService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
public class EmployeeRepositoryTests {

    @Autowired
    EmployeeService empService;

    @Test
    public void testSaveEmployee(){

        Employee employee = new Employee("Emil","Emil","emil@email.com");
        empService.save(employee);
        Employee employee2 = empService.findByFirstname("Emil");

        assertNotNull(employee);
        assertEquals(employee2.getFirstname(),employee.getFirstname());
        assertEquals(employee2.getLastname(),employee.getLastname());

    }

    @Test
    public void testGetEmployee(){

        Employee employee = new Employee("Emil","Emil","emil@email.com");
        empService.save(employee);
        Employee employee2 = empService.findByFirstname("Emil");

        assertNotNull(employee);
        assertEquals(employee2.getFirstname(),employee.getFirstname());
        assertEquals(employee2.getLastname(),employee.getLastname());
    }

    @Test
    public void testDeleteEmployee(){

        Employee employee = new Employee("Emil","Emil","emil@email.com");
        empService.save(employee);
        empService.delete(employee);

    }

    @Test
    public void findAllEmployees(){
        Employee employee = new Employee("Emil","Emil","emil@email.com");
        empService.save(employee);
        assertNotNull(empService.getAll());
    }

    @Test
    public void deleteByEmployeeIdTest(){
        Employee employee = new Employee("Emil","Emil","emil@email.com");
        Employee emp = empService.save(employee);
        empService.deleteById(emp.getEmployeeId());
    }


}
