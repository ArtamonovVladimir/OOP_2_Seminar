package service;

import java.util.ArrayList;
import java.util.List;

import data.Student;
import data.StudentGroup;
import data.Teacher;

public class StudentGroupService {

    private List<StudentGroup> studentGroup;

    public StudentGroupService() {
        this.studentGroup = new ArrayList<>();
    }

    public void setStudentGroup(Teacher teacher, List<Student> studentList) {
        this.studentGroup.add(new StudentGroup(teacher, studentList));
    }

    public List<StudentGroup> getStudentGroups() {
        return this.studentGroup;
    }

}
