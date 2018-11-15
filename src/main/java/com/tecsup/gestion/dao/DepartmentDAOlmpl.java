package com.tecsup.gestion.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.tecsup.gestion.exception.DAOException;
import com.tecsup.gestion.exception.EmptyResultException;
import com.tecsup.gestion.mapper.DepartmentMapper;
import com.tecsup.gestion.model.Department;

@Repository
public class DepartmentDAOlmpl implements DepartmentDAO {
	private static final Logger logger = LoggerFactory.getLogger(DepartmentDAOlmpl.class);
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public Department addDepartment(int deparment_id, String department_name, String department_description) throws DAOException, EmptyResultException {

		String query = "INSERT INTO Departments (deparment_id, department_name, department_description) "
				+ " VALUES (?, ?, ?)";

		Object[] params = new Object[] { deparment_id, department_name, department_description };

		try {

			Department dep = (Department) jdbcTemplate.queryForObject(query, params, new DepartmentMapper());
			//
			return dep;
			//return null;

		} catch (EmptyResultDataAccessException e) {
			throw new EmptyResultException();
		} catch (Exception e) {
			logger.info("Error: " + e.getMessage());
			throw new DAOException(e.getMessage());
		}
	}
	
	@Override
	public Department editDepartment(int deparment_id, String department_name, String department_description) throws DAOException, EmptyResultException {

		String query = "UPDATE Departments SET department_name = ?, department_description = ? "
				+ " WHERE deparment_id = ?";

		Object[] params = new Object[] { deparment_id, department_name, department_description };

		try {

			Department dep = (Department) jdbcTemplate.queryForObject(query, params, new DepartmentMapper());
			//
			return dep;
			//return null;

		} catch (EmptyResultDataAccessException e) {
			throw new EmptyResultException();
		} catch (Exception e) {
			logger.info("Error: " + e.getMessage());
			throw new DAOException(e.getMessage());
		}
	}
	
	@Override
	public Department deleteDepartment(int deparment_id) throws DAOException, EmptyResultException {

		String query = "DELETE FROM Departments "
				+ " WHERE deparment_id = ?";

		Object[] params = new Object[] { deparment_id };

		try {

			Department dep = (Department) jdbcTemplate.queryForObject(query, params, new DepartmentMapper());
			//
			return dep;
			//return null;

		} catch (EmptyResultDataAccessException e) {
			throw new EmptyResultException();
		} catch (Exception e) {
			logger.info("Error: " + e.getMessage());
			throw new DAOException(e.getMessage());
		}
	}
	
	@Override
	public Department findDepartment(int deparment_id) throws DAOException, EmptyResultException {

		String query = "SELECT deparment_id, department_name, department_description "
				+ " FROM Departments WHERE deparment_id = ?";

		Object[] params = new Object[] { deparment_id };

		try {

			Department dep = (Department) jdbcTemplate.queryForObject(query, params, new DepartmentMapper());
			//
			return dep;
			//return null;

		} catch (EmptyResultDataAccessException e) {
			throw new EmptyResultException();
		} catch (Exception e) {
			logger.info("Error: " + e.getMessage());
			throw new DAOException(e.getMessage());
		}
	}
	
}
