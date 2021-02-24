public class User {
    private int id;
    private static int idGen;
    private String name;
    private String surname;
    private int age;
    private String gender;
    private String password;
    private String dateOfBirth;

    public User() {

    }

    public void setName(String name) {
        id = ++idGen;
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getId() {
        return id;
    }

    public String getSurname() {
        return surname;
    }

    public String getGender() {
        return gender;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "{" +
                "Name is " + name + "\n" +
                "Surname is " + surname + "\n" +
                "Id is " + id + "\n" +
                "Age is " + age + "\n" +
                "Gender is " + gender + "\n" +
                "Password is " + password + "\n" +
                "Date of birth is " + dateOfBirth + "}" + "\n";

    }
}

