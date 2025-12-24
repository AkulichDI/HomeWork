package ls2.extendsLS1;

public abstract class Person {

    private final String name;

    public Person(String name){
        if(name == null || name.isBlank()){
            throw new IllegalArgumentException("Наименование пустое");
        }
        this.name = name;
    }

   protected String baseInfo(){
        return "name = " + this.name;
   }

    public String getName() {
        return name;
    }
}
