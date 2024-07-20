package com.vyku.entity;

import java.io.Serializable;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
@Table(name = "JPA_PHONES_TAB")
public class Phones implements Serializable {
	
	@Id
	@SequenceGenerator(name="gen1",sequenceName = "JPA_PHONES_SEQ",initialValue = 1000,allocationSize = 2)
	@GeneratedValue(generator="gen1",strategy = GenerationType.SEQUENCE)
	private Integer regId;
	
	@NonNull
	@Column
	private Long phoneNumber;
	@NonNull
	@Column(length = 20)
	private String provider;
	@NonNull
	@Column(length=20)
	private String numType;
	
	@ManyToOne(targetEntity = Person.class,cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinColumn(name="CUSTOMER_ID",referencedColumnName = "PERSON_ID")
	private Person personInfo;
	
	public Phones() {
		System.out.println("Phones:::::>>>>>> 0-param Constructor");
	}

	@Override
	public String toString() {
		return "Phones [regId=" + regId + ", phoneNumber=" + phoneNumber + ", provider=" + provider + ", numType="
				+ numType ;
	}
	

	
}
