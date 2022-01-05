package tech.getarrays.employeemanager;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import tech.getarrays.employeemanager.model.Employee;

import java.util.List;

public interface EmployeeRepository extends MongoRepository<Employee, String> {

    @Query("{Vorname:'?0'}")
    Employee findFirstByName(String Vorname);

    @Query("{Nachname:'?0'}")
    List<Employee> findDistinctBy(String Nachname);

    @Query(value = "{Sprachen:'?0'}", fields = "{'Vorname' : 1, 'Nachname' : 1}")
    List<Employee> findAll(String category);

    public long count();

}
