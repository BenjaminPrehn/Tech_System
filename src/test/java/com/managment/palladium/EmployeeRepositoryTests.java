package com.managment.palladium;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import com.managment.palladium.dao.EmployeeRepository;
import com.managment.palladium.entities.Employee;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
public class EmployeeRepositoryTests {

    @Autowired
    EmployeeRepository empRepo;

    @Test
    public void testSaveEmployee(){

        Employee employee1 = new Employee("Emil","Emil","emil@email.com");
        empRepo.save(employee1);
        Employee employee2 = empRepo.findByFirstname("Emil");

        assertNotNull(employee1);
        assertEquals(employee2.getFirstname(),employee1.getFirstname());
        assertEquals(employee2.getLastname(),employee1.getLastname());

    }


}
