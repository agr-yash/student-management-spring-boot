package com.fastndsteady.studentmanagementbackend.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.fastndsteady.studentmanagementbackend.entity.Student;

public interface StudentRepository extends MongoRepository<Student, String> {

	List<Student> findByBranchName(String branchName);

}
