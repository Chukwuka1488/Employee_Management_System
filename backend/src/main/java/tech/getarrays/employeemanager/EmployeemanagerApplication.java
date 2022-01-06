package tech.getarrays.employeemanager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import tech.getarrays.employeemanager.model.Employee;
import tech.getarrays.employeemanager.repo.EmployeeRepository;

@SpringBootApplication/*(exclude = {DataSourceAutoConfiguration.class})*/
public class EmployeemanagerApplication /*implements CommandLineRunner*/ {

//    @Autowired
//            public EmployeemanagerApplication(EmployeeRepository)
////    EmployeeRepository employeeRepo;

    public static void main(String[] args) {
        SpringApplication.run(EmployeemanagerApplication.class, args);
    }



}
