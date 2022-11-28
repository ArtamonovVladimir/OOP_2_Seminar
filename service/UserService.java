package service;

import java.util.ArrayList;
import java.util.List;

import data.Student;
import data.User;

public class UserService implements DataService {

    private final List<User> users;

    public UserService() {
        this.users = new ArrayList<>();
    }

    @Override
    public void deleteUser(Long id) {

        for (User item : this.users) {
            if (item instanceof Student) {
                if (id.equals(((Student) item).getStudentID())) {
                    this.users.remove(item);
                }
            }

        }
        // TODO Auto-generated method stub

    }

    @Override
    public void createUser(String firstName, String lastName, String patronymic) {
        // TODO Auto-generated method stub
        Long id = 0L;
        for (User item : this.users) {
            if (item instanceof Student) {
                if (id < ((Student) item).getStudentID()) {

                    id = ((Student) item).getStudentID();
                }
            }
        }

        this.users.add(new Student(firstName, lastName, patronymic, ++id));

    }

    @Override
    public List<User> getAllUser() {
        // TODO Auto-generated method stub
        return this.users;
    }

}
