package com.tecsup.gestion.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.tecsup.gestion.model.Department;

public class DepartmentMapper implements RowMapper<Department> {
	
	public Department mapRow(ResultSet rs, int rowNum) throws SQLException {
		Department dep = new Department();
		dep.setDepartmentId(rs.getInt("department_id"));
		dep.setName(rs.getString("department_name"));
		dep.setDescription(rs.getString("department_description"));
		return dep;
	}
}
