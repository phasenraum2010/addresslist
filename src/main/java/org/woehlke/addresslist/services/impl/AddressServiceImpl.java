package org.woehlke.addresslist.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.woehlke.addresslist.entities.Address;
import org.woehlke.addresslist.services.AddressService;

@Service
public class AddressServiceImpl implements AddressService {

	@Override
	public List<Address> getAllAddresses() {
		List<Address> allAddresses = new ArrayList<Address>();
		Address a1 = new Address();
		a1.setName("Alfons Wupdidupp");
		a1.setStreet("Essener Str.");
		a1.setHouseNumber("41");
		a1.setZip("12345");
		a1.setCity("Berlin");
		Address a2 = new Address();
		a2.setName("Anette Gluecklich");
		a2.setStreet("Wuppertaler Str.");
		a2.setHouseNumber("42");
		a2.setZip("12345");
		a2.setCity("Berlin");
		Address a3 = new Address();
		a3.setName("Egon Wuehlerich");
		a3.setStreet("Elbchaussee");
		a3.setHouseNumber("43");
		a3.setZip("12345");
		a3.setCity("Hamburg");
		allAddresses.add(a1);
		allAddresses.add(a2);
		allAddresses.add(a3);
		return allAddresses;
	}

}
