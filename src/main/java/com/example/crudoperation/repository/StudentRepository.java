package com.example.crudoperation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.example.crudoperation.entity.student;

@Repository
public interface StudentRepository extends JpaRepository<student,Integer>{

}



