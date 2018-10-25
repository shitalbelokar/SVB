package com.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;

import com.DaoI.DaoI;
import com.serviceI.ServiceI;

public class ServiceImpl implements ServiceI{
	@Autowired
	DaoI di;

}
