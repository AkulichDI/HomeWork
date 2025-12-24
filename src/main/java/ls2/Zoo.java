package ls2;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private static List<Animal> animals = new ArrayList<>();
    public static void makeAllSounds(List<Animal> animals){
          if (animals == null || animals.isEmpty()){
              System.out.println("Список пуст");
                return;
          }
            for (Animal animal : animals){
                if (animal== null){
                    System.out.println("Null animal");
                    continue;
                }
                System.out.println(animal.getName() + ": " + animal.sound());
            }
    }




    public static void main(String[] args) {
           animals.add(new Cat("Zina"));
        animals.add(new Dog("Oleg"));

        Zoo.makeAllSounds(animals);



    }


}
