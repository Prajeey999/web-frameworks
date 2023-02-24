package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.stud;
import com.example.demo.Service.StudentService;

@RestController
public class Controller {
		
 @Autowired
 private StudentService ss;
 
 @PostMapping("/savedata")
 public String savingstudent(@RequestBody stud s) {
	  ss.savedata(s);
	  return "saved";
 }
 
 @GetMapping("/findall")
public List<stud> listing(@RequestBody stud s) {
	 return ss.findall();
	 }
}