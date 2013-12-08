package org.woehlke.addresslist.services;

import java.util.List;

import org.woehlke.addresslist.entities.Address;

public interface AddressService {

	List<Address> getAllAddresses();

	void delete(long id);

	void addNewAddress(Address address);

}
