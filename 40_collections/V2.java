import java.util.HashSet;

class V2 {
    public static void main(String[] args) {
        HashSet<User> users = new HashSet<User>();

        users.add(new User("om", 23));
        users.add(new User("mohan", 12));
        users.add(new User("dinesh", 31));
        users.add(new User("hanmo", 12));
        users.add(new User("raju", 3));
        users.add(new User("vikram", 24));
        users.add(new User("hamno", 12));
        
        System.out.println(users);
    }
}
