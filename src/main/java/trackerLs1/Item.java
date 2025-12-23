package trackerLs1;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;


public class Item {
    private  java.time.LocalDateTime created;
    private  long id;
    private String name;
    private String description;
    private int priority;



    private static long  idCounter;
    private final static String  nl = "\n";
    private final static String  sp = " ";



    public Item ( long id, String name, String description, LocalDateTime created,int priority,boolean generatorID){
        validateOrThrow(id,name, description,created,priority);
        if (generatorID){
            this.id = generatorId();
        }else {
            this.id = id;
            idCounter++;
        }
        this.name = name.trim();
        this.description = description;
        this.priority = priority;
        this.created = created;
    }

    private long generatorId (){return idCounter++;}

    private boolean validatorName (String name){
        if (name != null && !name.isBlank())return true;
        return false;
    }

    private boolean validatorDescription (String description){
        if (description != null )return true;
        return false;
    }

    private boolean validatorPriority (int priority){
        if (priority > 10 || priority < 0 )return false;
        return true;
    }

    public LocalDateTime getCreated() {return created;}
    public long getId() {return id;}
    public String getName() {return name;}
    public String getDescription() {return description;}


    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public void setName(String name) {
        if(validatorName(name)){
            this.name = name;
            return;
        }else {
            System.out.println("Данное наименование некорректно");
            return;
        }
    }

    public void setDescription(String description) {
        if (validatorDescription(description)){
            this.description = description;
            return;
        }else {
            System.out.println("Данное описание пустое");
            return;
        }
    }


    private static void validateOrThrow(long id, String name, String description, LocalDateTime created, int priority) {
        StringBuilder sb = new StringBuilder();

        if (id <= 0) {
            sb.append("id должен быть > 0, пришло: ").append(id).append(nl);
        }
        if (created == null) {
            sb.append("created не должен быть null, пришло: null").append(nl);
        }
        if (name == null || name.isBlank()) {
            sb.append("name не должен быть пустым, пришло: ").append(name).append(nl);
        }
        if (description == null) {
            sb.append("description не должен быть null, пришло: null").append(nl);
        }
        if (priority > 10 || priority < 0 ){
            sb.append("priority должен быть в диапазоне от 0 до 10, пришло: ").append(priority).append(nl);
        }
        if (sb.length() > 0) {
            throw new IllegalArgumentException("Ошибка создания Item: " + nl + sb);
        }


    }

    public void showInfo() {
        System.out.println();
        System.out.printf("%-14s %s%n", "Id:", id);
        System.out.printf("%-14s %s%n", "Наименование:", name);
        System.out.printf("%-14s %s%n", "Описание:", description);
        System.out.printf("%-14s %s%n", "Приоритет:", priority);
        System.out.printf("%-14s %s%n", "Дата создания:", created);
        System.out.println();
    }





    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;
        Item item = (Item) object;
        return id == item.id && Objects.equals(created, item.created) && Objects.equals(name, item.name) && Objects.equals(description, item.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(created, id, name, description);
    }

    @Override
    public String toString() {
        return "Item{" +
                "created=" + created +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
