package com.DaoI;

import org.springframework.data.repository.CrudRepository;

import com.model.Employee;

public interface DaoI extends CrudRepository<Employee,Integer>{
public Employee findAllByUnAndPw(String un,String pw);
}
