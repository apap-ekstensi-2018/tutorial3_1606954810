package com.example.tutorial3.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.example.tutorial3.model.StudentModel;

public class InMemoryStudentService implements StudentService{
	private static List<StudentModel> studentList = new ArrayList<>();

	@Override
	public StudentModel selectStudent(String npm) {
		// TODO Auto-generated method stub
		for (StudentModel sm : studentList) {
			if (sm.getNpm().equals(npm)) return sm;
		}
		return null;
	}

	@Override
	public List<StudentModel> selectAllStudents() {
		// TODO Auto-generated method stub
		return studentList;
	}

	@Override
	public void addStudent(StudentModel student) {
		// TODO Auto-generated method stub
		studentList.add(student);
	}

	@Override
	public StudentModel deleteStudent(String npm) {
		// TODO Auto-generated method stub
		int i = 0;
		for (StudentModel sm : studentList) {
			if (sm.getNpm().equals(npm))
				return studentList.remove(i);
			i++;
		}
		return null;
	}
}
	