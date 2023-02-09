package com.fastndsteady.studentmanagementbackend.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.fastndsteady.studentmanagementbackend.entity.Professor;
import com.fastndsteady.studentmanagementbackend.entity.Student;

@Repository
public interface ProfessorRepository extends MongoRepository<Professor, String> {

	List<Professor> findByBranchName(String branchName);
	
}
