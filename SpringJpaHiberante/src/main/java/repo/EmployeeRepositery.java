package repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Employee;

public interface EmployeeRepositery extends JpaRepository<Employee, Integer> {

 }
