package controller;

//import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

//import data.Student;
import data.User;
import data.Teacher;
import data.Student;
import data.StudentGroup;
import service.StudentGroupService;
//import service.DataService;
import service.UserService;
import view.StudentView;

public class controller {
    private final UserService userService = new UserService();
    private final StudentView studentView = new StudentView();
    private final StudentGroupService studentGroupService = new StudentGroupService();

    public void createUser(String firstName, String lastName, String patronymic) {

        userService.createUser(firstName, lastName, patronymic);

        List<User> students = userService.getAllUser();
        studentView.sendOnConsole(students);
    }

    public void setStudentGroup() {
        List<User> users = this.userService.getAllUser();
        Teacher teacher = null;
        List<Student> students = new ArrayList<>();

        for (User user : users) {
            if (user instanceof Teacher) {
                teacher = (Teacher) user;
            } else if (user instanceof Student) {
                students.add((Student) user);
            }
        }
        this.studentGroupService.setStudentGroup(teacher, students);
        List<StudentGroup> studentGroup = this.studentGroupService.getStudentGroups();
    }
}
