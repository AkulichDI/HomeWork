package ls2.extendsLS1;

public class Student extends Person{
    private final String group;


    public Student(String name, String group) {

        super(name);
        if (group == null || group.isBlank())throw new IllegalArgumentException("Пустая группа");
        this.group = group;
    }

    public String  info(){
        return baseInfo() + ", group = " + this.group;
    }

    public String getGroup() {
        return group;
    }
}
