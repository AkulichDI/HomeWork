package ls2.extendsLS1;

public class Main {

    public static void main(String[] args) {
        var a = new Student("Oleg", "A1");
        try {
            var b = new Student("", "");
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println(a.getGroup()+ " " + a.getName());


    }
}
