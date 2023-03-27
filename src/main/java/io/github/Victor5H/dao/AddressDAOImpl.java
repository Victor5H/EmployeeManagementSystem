package io.github.Victor5H.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import io.github.Victor5H.entities.Address;

@Repository
public class AddressDAOImpl implements AddressDAO {
	@Autowired
	SessionFactory factory;

	@Override
	@Transactional
	public boolean insertAdd(Address a) {
		Session session = factory.openSession();
		session.beginTransaction();
		Long l = (Long) session.save(a);
		session.getTransaction().commit();
		return l > 0 ? true : false;
	}

	@Override
	@Transactional
	public boolean deleteAdd(Long id) {
		Address address = getAdd(id);
		if (address == null)
			return false;
		Session session = factory.openSession();
		session.beginTransaction();
		session.delete(address);
		session.getTransaction().commit();
		return false;
	}

	@Override
	public List<Address> getAllAdd() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional
	public void updateAdd(Address a) {
		Session session = factory.openSession();
		session.beginTransaction();
		session.update(a);
		session.getTransaction().commit();

	}

	@Override
	public Address getAdd(Long id) {
		Session session = factory.openSession();
		return session.get(Address.class, id);

	}

}
