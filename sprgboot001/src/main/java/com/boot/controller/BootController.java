package com.boot.controller;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.boot.model.EmpAddress;
import com.boot.model.Employee;

@RestController
public class BootController {

	@RequestMapping(value = "/hi")
	public String sayHi() {

		return "Hello There !";
	}

	@RequestMapping(value = "/empRec")
	public Employee getEmployeeData() {

		Employee employee = new Employee();
		EmpAddress empAddr = new EmpAddress();

		empAddr.setAdharNO("2132452245");
		empAddr.setCity("Patna");
		empAddr.setMobileNo("9024565555");
		empAddr.setState("Bihar");
		empAddr.setPresentAddress("Kolkata");

		employee.setDesignation("Asociate");
		employee.setEmpID(1234);
		employee.setFirstName("Amar");
		employee.setLastName("Kumar");
		employee.setEmpAddress(empAddr);
		return employee;
	}
}
