import java.util.HashSet;

class V {
    public static void main(String[] args) {
        HashSet<User> users = new HashSet<User>();

        users.add(new User("om", 23));
        users.add(new User("mohan", 12));
        users.add(new User("dinesh", 31));
        users.add(new User("raju", 3));
        users.add(new User("vikram", 24));
        
        System.out.println(users);
    }
}
