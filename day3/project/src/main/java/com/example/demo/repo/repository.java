/**
 * 
 */
package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.stud;

public interface repository extends JpaRepository<stud, Integer> {
	
}
