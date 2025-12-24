package ls2;

public class Animal {

    private final String name;



    public Animal (String name){

        if (name == null || name.isBlank()){
            throw new IllegalArgumentException("Наименование пустое.");
        }
        this.name = name.trim();
    }

    public String sound (){
        return "...";
    }

    public String getName() {
        return name;
    }
}
