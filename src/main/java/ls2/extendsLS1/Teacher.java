package ls2.extendsLS1;

public class Teacher extends Person{
    private final String subject;

    public Teacher(String name, String subject) {
        super(name);
        if (subject==null || subject.isBlank()){
            throw new IllegalArgumentException("Пустое поле subject");
        }
        this.subject = subject.trim();

    }
    public String info() {
        return baseInfo() + ", subject = " + subject;
    }


}
