package tech.getarrays.employeemanager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import tech.getarrays.employeemanager.model.Employee;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class EmployeemanagerApplication implements CommandLineRunner {

    @Autowired
    EmployeeRepository employeeRepo;

    public static void main(String[] args) {
        SpringApplication.run(EmployeemanagerApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        deleteAll();
        addSampleData();
        listAll();
    }

    public void addSampleData() {
        System.out.println("Adding sample data");
        employeeRepo.save(new Employee(1001001,
                "https://images.unsplash.com/photo-1438761681033-6461ffad8d80?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1740&q=80",
                "Jack", "Bauer", "RI 1",
                "12/11/2021", "Hymenolaimus malacorhynchus", "Fuscia", "Cofimvaba", "\"In quis justo. Maecenas rhoncus aliquam lacus. Morbi quis tortor id nulla ultrices aliquet.\n" +
                "\n" +
                "Maecenas leo odio, condimentum id, luctus nec, molestie sed, justo. Pellentesque viverra pede ac diam. Cras pellentesque volutpat dui.\"",
                "Quisque id justo sit amet sapien dignissim vestibulum. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Nulla dapibus dolor vel est. Donec odio justo, sollicitudin ut, suscipit a, feugiat et, eros.",
                "Portuguese", "", "", "Stringtough", "Tax Accountant",
                "", "Stokes, Herzog and Metz", "Dental Hygienist", "Otho Redgewell", "Prent Redgewell"));
        employeeRepo.save(new Employee(1001002,
                "https://images.unsplash.com/photo-1534751516642-a1af1ef26a56?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=778&q=80",
                "Mike", "Ross", "RI 2",
                "12/1/2019", "Tymenol hala", "Ascia", "Don bad", "\"In quis justo. Maecenas rhoncus aliquam lacus. Morbi quis tortor id nulla ultrices aliquet.\n" +
                "\n" +
                "Pellentesque viverra pede ac diam. Cras pellentesque volutpat dui.\"",
                " Nulla dapibus dolor vel est. Donec odio justo, sollicitudin ut, suscipit a, feugiat et, eros.",
                "Spanish", "", "", "Stringer", "Investment Banker",
                "Outside", "Taylor Barnse", "Portfolio Manager", "Vlade Divac", "Mike Aldridge"));
    }

    public void deleteAll() {
        System.out.println("Deleting all records..");
        employeeRepo.deleteAll();
    }

    public void listAll() {
        System.out.println("Listing sample data");
        employeeRepo.findAll().forEach(System.out::println);
    }

}
