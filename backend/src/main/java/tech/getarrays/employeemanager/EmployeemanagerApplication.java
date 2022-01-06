package tech.getarrays.employeemanager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication/*(exclude = {DataSourceAutoConfiguration.class})*/
public class EmployeemanagerApplication /*implements CommandLineRunner*/ {



    public static void main(String[] args) {
        SpringApplication.run(EmployeemanagerApplication.class, args);
    }



}
