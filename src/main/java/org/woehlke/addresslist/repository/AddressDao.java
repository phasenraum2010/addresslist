package org.woehlke.addresslist.repository;

import java.util.List;

import org.woehlke.addresslist.entities.Address;

public interface AddressDao {

	List<Address> getAll();

}
