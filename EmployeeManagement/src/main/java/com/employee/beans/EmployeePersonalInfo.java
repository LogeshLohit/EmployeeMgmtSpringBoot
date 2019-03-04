package com.employee.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "EMPLOYEE_PERSONAL_INFO")
public class EmployeePersonalInfo {
	@Id
	@Column(name = "EMPLOYEE_NO")
	private int employeeNo;
	private String employeeName;
	private String employeeAddress;
	@Column(name = "EMPLOYEE_EMAILID")
	private String employeeEmailId;

	public EmployeePersonalInfo() {
	}

	public int getEmployeeNo() {
		return employeeNo;
	}

	public void setEmployeeNo(int employeeNo) {
		this.employeeNo = employeeNo;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeAddress() {
		return employeeAddress;
	}

	public void setEmployeeAddress(String employeeAddress) {
		this.employeeAddress = employeeAddress;
	}

	public String getEmployeeEmailId() {
		return employeeEmailId;
	}

	public void setEmployeeEmailId(String employeeEmailId) {
		this.employeeEmailId = employeeEmailId;
	}

	@Override
	public String toString() {
		return "EmployeePersonalInfo [employeeNo=" + employeeNo + ", employeeName=" + employeeName
				+ ", employeeAddress=" + employeeAddress + ", employeeEmailId=" + employeeEmailId + "]";
	}

	public EmployeePersonalInfo(int employeeNo, String employeeName, String employeeAddress, String employeeEmailId) {
		super();
		this.employeeNo = employeeNo;
		this.employeeName = employeeName;
		this.employeeAddress = employeeAddress;
		this.employeeEmailId = employeeEmailId;
	}

}
