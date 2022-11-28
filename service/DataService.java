package service;

import java.util.List;

import data.User;

public interface DataService {

    void deleteUser(Long studentID);

    void createUser(String firstName, String lastName, String patronymic);

    List<User> getAllUser();

}
