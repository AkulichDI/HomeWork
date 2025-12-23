package ls1;

public class User {
    private String name;
    private String email;
    private int age;

    public User (String name, String email, int age) throws IllegalArgumentException {
       if (!User.validatorUserEmail(email) || !User.validatorUserName(name) || !User.validatorUserAge(age) ){
           var nameEx = User.validatorUserName(name) ? " V" : " X";
           var emailEx = User.validatorUserEmail(email) ? " V" : " X";
           var ageEx = User.validatorUserAge(age) ? " V" : " X";
           throw new IllegalArgumentException("Введите корректные данные для пользователя. \n" + "Имя: " + name  + nameEx + ".\n" + "Email: " + email + emailEx + ".\n" + "Возраст: " + age + ageEx +".\n" );
       }
        this.name = name.trim();
        this.email = email.trim();
        this.age = age;
    }


    public String getName() {return name;}
    public int getAge() {return age;}
    public String getEmail() {return email;}


    public void setAge(int age) {
           if(User.validatorUserAge(age)){
               this.age = age;
           }else {
               throw new IllegalArgumentException("Возраст должен быть от 0 до 150" + " Ваше значение: " + age);
           }
        }

    public void setName(String name) {
        if (User.validatorUserName(name)){
            this.name = name.trim();
        }else {
            throw new IllegalArgumentException("Имя должно быть заполнено");
        }
    }

    public void setEmail(String email) {
        if (User.validatorUserEmail(email)){
            this.email = email.trim();
        }else {
            throw new IllegalArgumentException("Введите корректный Email.\n Тек. значение: " + email);
        }
    }



    private static boolean validatorUserName (String name ){
        boolean rsl = false;
        if (name != null && !name.isBlank()){
            rsl = true;
        }
        return rsl;
    }

    private static boolean validatorUserEmail (String email ){
        boolean rsl = false;
        if (email != null && email.contains("@")  &&  !email.isBlank()){
            rsl = true;
        }
        return rsl;
    }
    private static boolean validatorUserAge (int age ){
        boolean rsl = false;
        if (age >= 0 && age <= 150){
            rsl = true;
        }
        return rsl;
    }



    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                '}';
    }
}
class Main {
    public static void main(String[] args) {
        User user = new User("Дима", "akulichdi", 22);
        user.toString();
    }
}