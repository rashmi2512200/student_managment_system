package com.example.crudoperation.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.crudoperation.entity.student;
import com.example.crudoperation.repository.StudentRepository;

@RestController
public class Homecontroller {
	
	@Autowired
	private StudentRepository studentRepository;
	
    @GetMapping("/")	
	public String index() {
		return "Welcome to spring boot crud application!!!";
	}
    //handler for creating new record in db
    @PostMapping("/savestudent")
    public student savedata(@RequestBody student Student) {
    	studentRepository.save(Student);
    	return Student;
    
    }  
    //for fetch all data
    @GetMapping("/getAllstudent")
    public List<student> getAll(){
    	 List<student>StudentList=studentRepository.findAll();
    	 return StudentList;
    	}
    
    @PutMapping("/updatestudentData/{rollno}")
    public student updatestudentData(@RequestBody student Student) {
	studentRepository.save(Student);
    	return Student;	
	  
  }
    
    //for delete a perticular record
    @DeleteMapping("/deletestudent/{rollno}")
    public String deletestudent(@PathVariable int rollno) {
    	student Student =studentRepository.findById(rollno).get();
    	if (Student!=null)
    		studentRepository.delete(Student);
    	return "Deleted Successfully!..";
    }
    
    @DeleteMapping("/deletestudentAll")
    public String deleteAllStudent() {
        List<student> Student = studentRepository.findAll();
        
        if (!Student.isEmpty()) {
            studentRepository.deleteAll(Student);
            return "Deleted all students successfully!";
        } else {
            return "No students to delete.";
        }
    }  
    

}
