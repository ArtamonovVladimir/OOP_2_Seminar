package view;

import java.util.List;
import java.util.logging.Logger;

import data.Student;
import data.User;

public class StudentView {

    public void sendOnConsole(List<User> users) {
        Logger logger = Logger.getAnonymousLogger();
        for (User user : users) {
            logger.info(user.toString());
        }
    }
}
