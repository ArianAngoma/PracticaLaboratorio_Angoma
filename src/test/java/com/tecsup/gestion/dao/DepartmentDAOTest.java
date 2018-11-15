package com.tecsup.gestion.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.tecsup.gestion.exception.DAOException;
import com.tecsup.gestion.exception.EmptyResultException;
import com.tecsup.gestion.model.Department;

import junit.framework.Assert;

@SuppressWarnings("deprecation")
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml")
@WebAppConfiguration
public class DepartmentDAOTest {
	
	private static final Logger logger = LoggerFactory.getLogger(DepartmentDAOTest.class);
	
	@Autowired
	private DepartmentDAO departmentDAO;
	
	@Test
	public void testAddDepartment() {
		try {
			Department addDep = departmentDAO.addDepartment(200, "Informatica", "Departamento de informatica, creado por Angoma");
			
			logger.info(addDep.toString());
			
		} catch (DAOException e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch (EmptyResultException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	@Test
	public void testEditDepartment() {
		try {
			Department editDep = departmentDAO.editDepartment(200, "Quimica", "Departamento editado por Angoma");
			
			logger.info(editDep.toString());
			
		} catch (DAOException e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch (EmptyResultException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	@Test
	public void testFindDepartment() {
		try {
			Department findDepartment = departmentDAO.findDepartment(200);
			
			logger.info(findDepartment.toString());
			
		} catch (DAOException e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch (EmptyResultException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	@Test
	public void testDeleteDepartment() {
		try {
			Department deleteDepartment = departmentDAO.deleteDepartment(200);
			
			logger.info(deleteDepartment.toString());
			
		} catch (DAOException e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch (EmptyResultException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
