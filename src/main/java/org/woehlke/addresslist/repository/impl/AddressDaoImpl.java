package org.woehlke.addresslist.repository.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.woehlke.addresslist.entities.Address;
import org.woehlke.addresslist.repository.AddressDao;

@Repository
public class AddressDaoImpl implements AddressDao {

	@PersistenceContext
	private EntityManager em;
	
	@Override
	public List<Address> getAll() {
		Query q = em.createQuery("select a from Address a");
		@SuppressWarnings("unchecked")
		List<Address> list =  q.getResultList();
		return list;
	}

	@Override
	public void delete(long id) {
		Address address = em.find(Address.class, id);
		em.remove(address);
	}

	@Override
	public Address addNewAddress(Address address) {
		em.persist(address);
		return address;
	}
	
	

}
