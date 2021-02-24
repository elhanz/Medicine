
import java.util.Scanner;

    public class Main {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            Validator validator = new Validator();


            while(true){
                User user =new User();
                System.out.println("Write your name");
                String name = sc.next();
                user.setName(name);
                System.out.println("Write your surname");
                String surname = sc.next();
                user.setSurname(surname);
                System.out.println("Write your age");
                int age = sc.nextInt();
                user.setAge(age);
                while (validator.checkAge(user)==false){
                    System.out.println("Oh, you are too young!");
                    System.out.println("Write your age");
                    age = sc.nextInt();
                    user.setAge(age);
                }
                System.out.println("Write your gender");
                String gender = sc.next();
                user.setGender(gender);
                System.out.println("Write your password");
                String password = sc.next();
                user.setPassword(password);
                while (validator.checkPassword(user)==false){
                    System.out.println("Incorrect password");
                    System.out.println("Write your password");
                     password = sc.next();
                    user.setPassword(password);
                }
                System.out.println("Write your date of birth");
                String dateOfBirth = sc.next();
                user.setDateOfBirth(dateOfBirth);
                while (validator.checkDate(user)==false){
                    System.out.println("Invalid pattern!");
                    System.out.println("Write your date of birth");
                      dateOfBirth = sc.next();
                    user.setDateOfBirth(dateOfBirth);
                }
                validator.addUser(user);
                for(int i=0;i<validator.getUser().size();i++){
                    System.out.println(validator.getUser().get(i));
                }
            }
        }
    }
