package com.vyku.service;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vyku.entity.Person;
import com.vyku.entity.Phones;
import com.vyku.repository.IPersonRepository;
import com.vyku.repository.IPhoneNumberRepository;

@Service("OtoMService")
public class OtoMAssociationMappingServiceImpl implements IOToMAssociationMgmtSerice {
	@Autowired
	private IPersonRepository personRepo;
	@Autowired
	private IPhoneNumberRepository phoneRepo;


	@Override
	public void saveDataUsingParent() {
		Person per=new Person("raja","Hyd");
		
		Phones ph1=new Phones(999999L,"airtel","Personal");
		Phones ph2=new Phones(888888L,"jio","Office");
		
		ph1.setPersonInfo(per);
		ph2.setPersonInfo(per);
		
		Set<Phones> set=new HashSet<Phones>();
		set.add(ph1);
		set.add(ph2);
		
		per.setContactDetails(set);
		personRepo.save(per);
		System.out.println("Details Saved By Parent Object");
		
	}


	@Override
	public void saveDataUSingChild() {
		Person per=new Person();
		per.setPName("Vyku");
		per.setPAddrs("Chennai");
		
		Phones ph1=new Phones(111111L,"Vi","Home");
		Phones ph2=new Phones(212222L,"BSNL","Office");
		
		ph1.setPersonInfo(per);
		ph2.setPersonInfo(per);
		
		Set<Phones> set=new HashSet<Phones>();
		set.add(ph2);
		set.add(ph1);
		
		per.setContactDetails(set);
		
		phoneRepo.save(ph1);
		phoneRepo.save(ph2);
		
		System.out.println("Person is saved with the By Using child");
		
	}


	@Override
	public void loadDataUsingParent() {
		Iterable<Person> it=personRepo.findAll();
		it.forEach(per->System.out.println(per));
		
		Person per1=new Person();
		
		Set<Phones> set=per1.getContactDetails();
		set.forEach(ph->ph.getPhoneNumber());
		
	}

}
