package tech.getarrays.employeemanager.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import tech.getarrays.employeemanager.model.Employee;

import java.util.Optional;

public interface EmployeeRepository extends MongoRepository<Employee, String> {



    void deleteEmployeeById(String id);


   Optional<Employee> findEmployeeById(String id);

    Employee findEmployeeByVorname(String vorname);
}
