package io.github.Victor5H.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import io.github.Victor5H.entities.Employee;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {
	@Autowired
	SessionFactory factory;

	public SessionFactory getFactory() {
		return factory;
	}

	public void setFactory(SessionFactory factory) {
		this.factory = factory;
	}

	@Override
	@Transactional
	public boolean insertEmp(Employee e) {
		Session session = factory.openSession();
		session.beginTransaction();
		Long r = (Long) session.save(e);
		session.getTransaction().commit();
		return r > 0 ? true : false;
	}

	@Override
	@Transactional
	public boolean deleteEmp(int id) {
		Employee employee = getEmp(id);
		if (employee == null) {
			return false;
		}
		Session session = factory.openSession();
		session.beginTransaction();
		session.delete(employee);
		session.getTransaction().commit();
		return true;
	}

	@Override
	public Employee getEmp(int id) {
		Session session = factory.openSession();
		return session.get(Employee.class, id);

	}

	@Override
	public List<Employee> getAllEmp() {
		Session session = factory.openSession();
		return session.createQuery("from employee", Employee.class).list();
	}

	@Override
	@Transactional
	public void updateEmp(Employee e) {
		Session session = factory.openSession();
		session.beginTransaction();
		session.saveOrUpdate(e);
		session.getTransaction().commit();

	}

}
