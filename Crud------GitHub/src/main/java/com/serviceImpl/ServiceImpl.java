package com.serviceImpl;

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
	

}
