package io.github.Victor5H.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.github.Victor5H.dao.AddressDAO;
import io.github.Victor5H.entities.Address;

@Service
public class AddressService {

	@Autowired
	AddressDAO dao;

	public AddressDAO getDao() {
		return dao;
	}

	public void setDao(AddressDAO dao) {
		this.dao = dao;
	}

	public Address getAddress(Long id) {
		return dao.getAdd(id);
	}

	public void updateAddress(Address a) {
		dao.updateAdd(a);
	}

	public boolean insertAddress(Address a) {
		return dao.insertAdd(a);
	}

	public boolean deleteAddress(Long id) {
		return dao.deleteAdd(id);
	}

}
