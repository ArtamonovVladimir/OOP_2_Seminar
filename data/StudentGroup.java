package data;

import java.util.List;

public class StudentGroup {
    private Long studentGroupID;
    private Teacher teacher;
    private List<Student> studentList;

    public StudentGroup(Teacher teacher, List<Student> studentList) {
        this.teacher = teacher;
        this.studentList = studentList;
        this.studentGroupID = studentGroupID;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public Long getStudentGroupID() {
        return studentGroupID;
    }

    public void setStudentGroupID(Long studentGroupID) {
        this.studentGroupID = studentGroupID;
    }

    @Override
    public String toString() {
        return "StudentGroup [studentGroupID=" + studentGroupID + ", teacher=" + teacher + ", studentList="
                + studentList + "]";
    }

}
