package src;

public class UserTest {

    public static void main(String[] args) {

      //  User user = new User();
        User user = new User("Imie", "hello");


      //  user.username = "Justyna";
      //  user.password = "abc";

        System.out.println(user.username);
        System.out.println(user.password);

        user.sayHello();

    }
}
