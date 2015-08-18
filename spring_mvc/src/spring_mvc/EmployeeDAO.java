package spring_mvc;

import java.util.List;


public interface EmployeeDAO {
 void getDBConnection();
 void closeDBConnection();
 void addEmployee(Employee employee);
 void updateEmployee(Employee em);
 List<Employee> getEmployees();
}
