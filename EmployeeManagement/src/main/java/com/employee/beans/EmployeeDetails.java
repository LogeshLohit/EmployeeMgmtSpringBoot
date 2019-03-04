package com.employee.beans;

public class EmployeeDetails {

	private int employeeNo;
	private int employeeProject;
	private int employeeSalary;
	private int employeeTechnology;

	public EmployeeDetails() {
		// TODO Auto-generated constructor stub
	}

	public EmployeeDetails(int employeeNo, int employeeProject, int employeeSalary, int employeeTechnology) {
		super();
		this.employeeNo = employeeNo;
		this.employeeProject = employeeProject;
		this.employeeSalary = employeeSalary;
		this.employeeTechnology = employeeTechnology;
	}

	public int getEmployeeNo() {
		return employeeNo;
	}

	public void setEmployeeNo(int employeeNo) {
		this.employeeNo = employeeNo;
	}

	public int getEmployeeProject() {
		return employeeProject;
	}

	public void setEmployeeProject(int employeeProject) {
		this.employeeProject = employeeProject;
	}

	public int getEmployeeSalary() {
		return employeeSalary;
	}

	public void setEmployeeSalary(int employeeSalary) {
		this.employeeSalary = employeeSalary;
	}

	public int getEmployeeTechnology() {
		return employeeTechnology;
	}

	public void setEmployeeTechnology(int employeeTechnology) {
		this.employeeTechnology = employeeTechnology;
	}

	@Override
	public String toString() {
		return "EmployeeDetails [employeeNo=" + employeeNo + ", employeeProject=" + employeeProject
				+ ", employeeSalary=" + employeeSalary + ", employeeTechnology=" + employeeTechnology + "]";
	}

}
