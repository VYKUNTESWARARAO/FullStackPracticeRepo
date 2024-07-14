package com.vyku.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;


@Data
@Entity
@Table(name="Employee1")
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
public class Employee 
{
	@Id
	@Column(name="EMP_ID")
	@SequenceGenerator(name="gen1",sequenceName = "EMP_SEQ",initialValue = 1001,allocationSize = 10)
	@GeneratedValue(generator="gen1",strategy = GenerationType.SEQUENCE)
	private Integer empId;
	@NonNull
	@Column(name="EMP_NAME")
	private String empName;
	@NonNull
	@Column(name="EMP_CONTACT")
	private Long empContactNum;
	@NonNull
	@Column(name="EMP_DESG")
	private String empDesignation;
	@NonNull
	@Column(name="EMP_ADDR")
	private String empAddress;
	@NonNull
	@Column(name="EMP_SAL")
	private Double empSalary;
	
	

}
