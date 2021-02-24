
import java.util.ArrayList;

public class Validator {
    private ArrayList<User> array;
    Validator() {
        array= new ArrayList<User>();
    }

    public boolean checkAge(User user) {
        return user.getAge() >= 18;

    }
    public void addUser(User user) {
        array.add(user);
    }
    public ArrayList<User> getUser() {
        return array;
    }
    public boolean checkPassword(User user) {
        int uppercase_Counter=0,lowercase_Counter = 0, digits = 0, special_Symbols = 0;
        for (int i = 0; i < user.getPassword().length(); i++) {
            if (user.getPassword().toCharArray()[i] > 64 && user.getPassword().toCharArray()[i] < 91) {
                uppercase_Counter++;
            }
            if (user.getPassword().toCharArray()[i] > 96 && user.getPassword().toCharArray()[i] < 123) {
                lowercase_Counter++;
            }
            if (user.getPassword().toCharArray()[i] > 47 && user.getPassword().toCharArray()[i] < 58) {
                digits++;
            }
            if (user.getPassword().toCharArray()[i] == 35 || user.getPassword().toCharArray()[i] ==94 || user.getPassword().toCharArray()[i] == 36 ||user.getPassword().toCharArray()[i] == 33) {
                special_Symbols++;
            }
//1 uppercase_counter letter,1 lowercase letter, 1 digit, 1 special symbol(@,$,!,^)
        }
if(uppercase_Counter==0|| lowercase_Counter==0|| digits==0||special_Symbols==0 || user.getPassword().length()<8){
    return false;
}
 return true;
    }
    public boolean checkDate(User user) {
        return user.getDateOfBirth().matches("([0-9]{2})/([0-9]{2})/([0-9]{4})");
    }

}