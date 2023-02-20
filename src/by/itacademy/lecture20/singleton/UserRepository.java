package by.itacademy.lecture20.singleton;

public class UserRepository {

    private static UserRepository instance;

    private UserRepository() {
        //....
    }

    public static UserRepository getInstance() {
        if(instance == null) {
            instance = new UserRepository();
        }
        return instance;
    }
}
