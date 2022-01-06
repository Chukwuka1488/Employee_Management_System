package tech.getarrays.employeemanager.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Service;
import tech.getarrays.employeemanager.exception.UserNotFoundException;
import tech.getarrays.employeemanager.model.Employee;
import tech.getarrays.employeemanager.repo.EmployeeRepository;

import java.util.List;

import java.util.UUID;

@Service
public class EmployeeService {
    private final EmployeeRepository employeeRepo;

    @Autowired
    public EmployeeService(EmployeeRepository employeeRepo) {
        this.employeeRepo = employeeRepo;
    }

    // add employee
    public Employee addEmployee(Employee employee) {
        System.out.println(employee.getSAP_Personalnummer());
        return employeeRepo.save(employee);

    }

    // delete employee
    public void deleteEmployee(String id) {
        System.out.println("Deleting all records..");
        employeeRepo.deleteEmployeeById(id);
    }

    // return all employees
    public List<Employee> findAllEmployees() {
        return employeeRepo.findAll();
    }

    // update employee
    public Employee updateEmployee(Employee employee) {
        return employeeRepo.save(employee);
    }

    @Query("{ 'name' : ?0 }")
    public Employee findEmployeeByName(String Vorname) {
        return employeeRepo.findEmployeeByVorname(Vorname);
    }


    public Employee findEmployeeById(String id) {
        return employeeRepo.findEmployeeById(id).orElseThrow(
                () -> new UserNotFoundException("User by id " + id + " was not found"));
    }

}