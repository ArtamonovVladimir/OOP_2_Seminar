package data;

public class Student extends User {
    private Long studentID;

    public Student(String firstName, String lastName, String patronymic, Long studentIDLong) {
        super(firstName, lastName, patronymic);
        this.studentID = studentIDLong;
    }

    public Long getStudentID() {
        return studentID;
    }

    public void setStudentID(Long studentID) {
        this.studentID = studentID;
    }

}
