package com.vyku.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vyku.entity.Phones;

public interface IPhoneNumberRepository extends JpaRepository<Phones, Integer> {

}
