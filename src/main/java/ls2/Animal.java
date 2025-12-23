package ls2;

public class Animal {

    private final String name;



    public Animal (String name){

        if (name.isBlank()){
            throw new IllegalArgumentException("Наименование пустое.");
        }
        this.name = name;
    }

    public String sound (){
        return "...";
    }


    public static void main(String[] args) {
        Cat cat = new Cat("Oleg");
        Dog dog = new Dog("Liza");
        System.out.println(cat.sound());
        System.out.println(dog.sound());



    }

}
