package com.vyku.entity;

import java.io.Serializable;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@RequiredArgsConstructor
@Table(name = "JPA_PERSON_TAB")
public class Person implements Serializable {
	
	
	
	@Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "person_seq")
    @SequenceGenerator(name = "person_seq", sequenceName = "PERSON_SEQ", allocationSize = 1)
	@Column(name="PERSON_ID")
	private Integer pId;
	
	@NonNull
	@Column(name="PERSON_NAME",length = 20)
	private String pName;
	
	@NonNull
	@Column(name="PERSON_ADDRESS",length = 20)
	private String pAddrs;
	
	@OneToMany(targetEntity = Phones.class,cascade = CascadeType.ALL,fetch = FetchType.LAZY,mappedBy = "personInfo")
	//@JoinColumn(name = "CUSTOMER_ID",referencedColumnName = "PERSON_ID")
	private Set<Phones> contactDetails;
	
	@Override
	public String toString() {
		return "Person [pId= " + pId + ", pName= " + pName + ", pAddrs= " + pAddrs+ "]";
	}

	
	public Person() {
		System.out.println("Person:::::::::::::>>> 0-Constructor");
	}
		
	
}
