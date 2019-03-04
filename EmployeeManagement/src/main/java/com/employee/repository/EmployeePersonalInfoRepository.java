package com.employee.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.employee.beans.EmployeePersonalInfo;

@Repository
public interface EmployeePersonalInfoRepository extends CrudRepository<EmployeePersonalInfo, Integer> {

	public List<EmployeePersonalInfo> findAllByEmployeeNameContaining(String employeeName);
}
