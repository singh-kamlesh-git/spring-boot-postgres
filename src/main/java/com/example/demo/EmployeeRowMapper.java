package com.example.demo;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class EmployeeRowMapper implements RowMapper<Employee> {

	@Override
	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		final Employee employee = new Employee();
		employee.setEmployeeAddress(rs.getString("employeeAddress"));
		employee.setEmployeeEmail(rs.getString("employeeEmail"));
		employee.setEmployeeId(rs.getInt("employeeId"));
		employee.setEmployeeName(rs.getString("employeeName"));
		return employee;
	}

}
