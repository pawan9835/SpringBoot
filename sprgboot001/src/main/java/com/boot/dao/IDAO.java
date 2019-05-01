package com.boot.dao;

import com.boot.model.Employee;

public interface IDAO {
	
	public int saveEmpData(Employee emp);
	public Employee getEmployee(int empID);

}
