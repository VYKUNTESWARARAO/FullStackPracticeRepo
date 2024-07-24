package com.vyku.entity;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Version;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
public class BankAccount {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer AccNo;
	@NonNull
	@Column(name="Holder_Name")
	private String Name;
	@Version
	@Column(name="Opened_No_Of_Times")
	private Integer updateCount;
	@Column(name="Created_on")
	@CreationTimestamp
	private LocalDateTime OpenedOn;
	@Column(name="Opened_On")
	@UpdateTimestamp
	private LocalDateTime UpatedOn;
}
