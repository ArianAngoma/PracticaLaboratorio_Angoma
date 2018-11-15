package com.tecsup.gestion.dao;

import com.tecsup.gestion.exception.DAOException;
import com.tecsup.gestion.exception.EmptyResultException;
import com.tecsup.gestion.model.Department;

public interface DepartmentDAO {

	Department addDepartment(int deparment_id, String department_name, String department_description)
			throws DAOException, EmptyResultException;

	Department deleteDepartment(int deparment_id) throws DAOException, EmptyResultException;

	Department editDepartment(int deparment_id, String department_name, String department_description)
			throws DAOException, EmptyResultException;

	Department findDepartment(int deparment_id) throws DAOException, EmptyResultException;


}
