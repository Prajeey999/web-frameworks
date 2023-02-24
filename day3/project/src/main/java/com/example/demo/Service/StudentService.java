package com.example.demo.Service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.stud;
import com.example.demo.repo.repository;
@Service
public class StudentService {
	@Autowired
	private repository stu;
	public stud savedata(stud s) {
		return stu.save(s);
	}
	public List<stud> findall(){
		return stu.findAll();
	}
	public void deleteDepartmentById(int id) {
		stu.deleteById(id);
	}
}