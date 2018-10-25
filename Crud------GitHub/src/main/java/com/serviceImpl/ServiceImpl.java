package com.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.DaoI.DaoI;
import com.model.Employee;
import com.serviceI.ServiceI;

@Service
public class ServiceImpl implements ServiceI{
	@Autowired
	DaoI di;

	@Override
	public Employee registerEmployee(Employee e) {
		System.out.println("in registeremploee");
		Employee em=di.save(e);
		return em;
	}
	@Override
	public List<Employee> getAllRecord() {
		System.out.println("in getallrecord");
		List<Employee>list=(List<Employee>) di.findAll();
		return list;
	}
	
	@Override
	public Employee findAllByUnAndPw(String un, String pw) {
		System.out.println("in serviceimpl login");
		Employee em=di.findAllByUnAndPw(un, pw);
		return em;
	}


	
}
