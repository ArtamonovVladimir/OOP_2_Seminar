import controller.controller;

public class App {

    public static void main(String[] args) {
        controller contr = new controller();
        contr.createUser("Name", "LastName", "Patronymic");
    }

}
