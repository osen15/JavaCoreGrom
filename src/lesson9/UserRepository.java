package lesson9;

/**
 * Created by Oleg on 21.06.2017.
 */
public class UserRepository {

    private User[] users = new User[10];


    public User save(User user) {
        checkUser(user);
        checkUserById(user);
        checkArray_IsFullOrNot(users);
        int index = 0;
        for (User us : users) {
            if (us == null) {
                users[index] = user;
                break;
            }
            index++;
        }
        return user;
    }

    private User checkUser(User user) {
        if (user == null)
            return null;
        else
            return user;
    }


    private User checkUserById(User user) {
        for (User us : users) {
            if (us != null && us.equals(user))
                return null;
            else ;
        }
        return user;
    }

    private User[] checkArray_IsFullOrNot(User[] users) {
        int countPlaced = 0;
        for (User us : users) {
            if (us != null)
                countPlaced++;

        }
        if (countPlaced == users.length - 1)
            return null;
        else

            return users;


    }

    public User update(User user) {
        int index = 0;
        for (User us : users) {
            if (us != null && us.equals(user)) {
                users[index] = user;
                return user;
            }
            index++;
        }
        return null;
    }

    public void delete(long id) {

        int index = 0;
        for (User user : users) {
            if (user != null && findById(id) == findById(user.getId())) {
                users[index] = null;
                break;
            }
            index++;
        }
    }

    private User findById(long id) {
        for (User user : users) {
            if (user != null && id == user.getId())
                return user;
        }
        return null;
    }

}

