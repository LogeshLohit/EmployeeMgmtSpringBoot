package com.employee.beans;

public class EmployeeInterests {

	private int employeeNo;
	private String employeeAreaOfInterest;
	private String technologyWorked;
	private int yearsOfExperience;

	public EmployeeInterests() {
		// TODO Auto-generated constructor stub
	}

	public int getEmployeeNo() {
		return employeeNo;
	}

	public void setEmployeeNo(int employeeNo) {
		this.employeeNo = employeeNo;
	}

	public String getEmployeeAreaOfInterest() {
		return employeeAreaOfInterest;
	}

	public void setEmployeeAreaOfInterest(String employeeAreaOfInterest) {
		this.employeeAreaOfInterest = employeeAreaOfInterest;
	}

	public String getTechnologyWorked() {
		return technologyWorked;
	}

	public void setTechnologyWorked(String technologyWorked) {
		this.technologyWorked = technologyWorked;
	}

	public int getYearsOfExperience() {
		return yearsOfExperience;
	}

	public void setYearsOfExperience(int yearsOfExperience) {
		this.yearsOfExperience = yearsOfExperience;
	}

	@Override
	public String toString() {
		return "EmployeeInterests [employeeNo=" + employeeNo + ", employeeAreaOfInterest=" + employeeAreaOfInterest
				+ ", technologyWorked=" + technologyWorked + ", yearsOfExperience=" + yearsOfExperience + "]";
	}

	public EmployeeInterests(int employeeNo, String employeeAreaOfInterest, String technologyWorked,
			int yearsOfExperience) {
		super();
		this.employeeNo = employeeNo;
		this.employeeAreaOfInterest = employeeAreaOfInterest;
		this.technologyWorked = technologyWorked;
		this.yearsOfExperience = yearsOfExperience;
	}

}
