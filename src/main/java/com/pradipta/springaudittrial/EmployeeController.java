package com.pradipta.springaudittrial;

import com.pradipta.springaudittrial.model.Employee;
import com.pradipta.springaudittrial.model.EmployeeService;
import com.pradipta.springaudittrial.model.InputDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class EmployeeController<T> {
    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/addEmployee")
    public ResponseEntity<Employee> addEmployee(@RequestBody InputDTO<Employee> request) {
        return ResponseEntity.of(Optional.of(employeeService.saveEmployee(request)));
    }

    @PutMapping("/updateEmployee/{id}/{salary}")
    public ResponseEntity<Employee> addEmployee(@PathVariable Integer id, @PathVariable Double salary, @RequestBody InputDTO<Employee> request) throws Exception {
        return ResponseEntity.of(Optional.of(employeeService.updateSalary(id, salary, request)));
    }
}
