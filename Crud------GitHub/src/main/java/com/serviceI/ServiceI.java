package com.serviceI;



import java.util.List;

import com.model.Employee;

public interface ServiceI {
public Employee registerEmployee(Employee e);
public List<Employee> getAllRecord();
public Employee findAllByUnAndPw(String un,String pw);

}
