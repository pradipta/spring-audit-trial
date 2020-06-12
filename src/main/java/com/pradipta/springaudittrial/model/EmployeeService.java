package com.pradipta.springaudittrial.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepo employeeRepo;

    public Employee saveEmployee(InputDTO<Employee> employeeInputDTO) {
        String currentUser = employeeInputDTO.getUser();
        Employee employee = employeeInputDTO.getEmployee();
        employee.setCreatedBy(currentUser);

        return employeeRepo.save(employee);
    }

    public Employee updateSalary(int id, Double salary, InputDTO<Employee> employeeInputDTO) throws Exception {
        Employee employee = employeeRepo.findById(id).orElseThrow(()->new Exception("User not found"));
        employee.setSalary(salary);
        employee.setModifiedBy(employeeInputDTO.getUser());
        return employeeRepo.save(employee);
    }
}
