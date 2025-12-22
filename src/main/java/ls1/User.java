package ls1;

public class User {
    private String name;
    private String email;
    private int age;

    public User (String name, String email, int age){
       if (User.userDataValidator(name)){
        this.name = name.trim();
       }
        if (User.userDataValidator(email) && !email.contains("@")) {
            this.email = email.trim();
        }
        if (age > 0 && age < 150) {
            this.age = age;
        }
    }

    private static  <T> boolean userDataValidator (T t){

        return t != null  ;
    }

    public int getAge() {return age;}

    public void setAge(int age) {this.age = age;}

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    public String getEmail() {return email;}

    public void setEmail(String email) {this.email = email;}



    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                '}';
    }
}
