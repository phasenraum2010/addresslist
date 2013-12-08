package org.woehlke.addresslist.services.impl;

//import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.woehlke.addresslist.entities.Address;
import org.woehlke.addresslist.repository.AddressDao;
import org.woehlke.addresslist.services.AddressService;

@Service
@Transactional(propagation=Propagation.REQUIRED,readOnly=true)
public class AddressServiceImpl implements AddressService {

	@Inject
	private AddressDao addressDao;
	
	@Override
	public List<Address> getAllAddresses() {
		List<Address> allAddresses = addressDao.getAll();
		return allAddresses;
	}

	@Override
	@Transactional(propagation=Propagation.REQUIRES_NEW,readOnly=false)
	public void delete(long id) {
		addressDao.delete(id);
	}

	@Override
	@Transactional(propagation=Propagation.REQUIRES_NEW,readOnly=false)
	public void addNewAddress(Address address) {
		address=addressDao.addNewAddress(address);
		
	}
	
}
