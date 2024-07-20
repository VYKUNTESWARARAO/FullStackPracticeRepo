package com.vyku.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vyku.entity.Person;

public interface IPersonRepository extends JpaRepository<Person, Integer> {

}
