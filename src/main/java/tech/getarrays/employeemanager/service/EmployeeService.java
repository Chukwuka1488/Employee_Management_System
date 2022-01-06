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
        employee.setSAP_Personalnummer(Integer.parseInt(UUID.randomUUID().toString()));
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

//    public void addSampleData() {
//        System.out.println("Adding sample data");
//        employeeRepo.save(new Employee(10,
//                "https://images.unsplash.com/photo-1438761681033-6461ffad8d80?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1740&q=80",
//                "Jack", "Bauer", "RI 1",
//                "12/11/2021", "Hymenolaimus malacorhynchus", "Fuscia", "Cofimvaba", "\"In quis justo. Maecenas rhoncus aliquam lacus. Morbi quis tortor id nulla ultrices aliquet.\n" +
//                "\n" +
//                "Maecenas leo odio, condimentum id, luctus nec, molestie sed, justo. Pellentesque viverra pede ac diam. Cras pellentesque volutpat dui.\"",
//                "Quisque id justo sit amet sapien dignissim vestibulum. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Nulla dapibus dolor vel est. Donec odio justo, sollicitudin ut, suscipit a, feugiat et, eros.",
//                "Portuguese", "", "", "Stringtough", "Tax Accountant",
//                "", "Stokes, Herzog and Metz", "Dental Hygienist", "Otho Redgewell", "Prent Redgewell"));
//        employeeRepo.save(new Employee(1001002,
//                "https://images.unsplash.com/photo-1534751516642-a1af1ef26a56?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=778&q=80",
//                "Mike", "Ross", "RI 2",
//                "12/1/2019", "Tymenol hala", "Ascia", "Don bad", "\"In quis justo. Maecenas rhoncus aliquam lacus. Morbi quis tortor id nulla ultrices aliquet.\n" +
//                "\n" +
//                "Pellentesque viverra pede ac diam. Cras pellentesque volutpat dui.\"",
//                " Nulla dapibus dolor vel est. Donec odio justo, sollicitudin ut, suscipit a, feugiat et, eros.",
//                "Spanish", "", "", "Stringer", "Investment Banker",
//                "Outside", "Taylor Barnse", "Portfolio Manager", "Vlade Divac", "Mike Aldridge"));
//    }


}