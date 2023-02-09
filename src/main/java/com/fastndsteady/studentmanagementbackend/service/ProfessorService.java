package com.fastndsteady.studentmanagementbackend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fastndsteady.studentmanagementbackend.entity.Professor;
import com.fastndsteady.studentmanagementbackend.entity.Student;
import com.fastndsteady.studentmanagementbackend.repository.ProfessorRepository;

@Service
public class ProfessorService {

	@Autowired
	ProfessorRepository professorRepo;

	public List<Professor> getProfessors() {
		return professorRepo.findAll();
	}

	public Professor addProfessor(Professor Professor) {
		return professorRepo.save(Professor);
	}

	public Professor getProfessor(String id) {
		return professorRepo.findById(id).get();
	}

	public String deleteProfessor(String id) {
		professorRepo.deleteById(id);
		return "Professor deleted successfully";
	}

	public List<Professor> getByName(String branchName) {
		return professorRepo.findByBranchName(branchName);
		
	}
}
