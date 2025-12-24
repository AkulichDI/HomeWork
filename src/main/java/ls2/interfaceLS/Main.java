package ls2.interfaceLS;

public class Main {

    public static void main(String[] args) {

        var a = new Salary(100).isPositive() == true;
        var b = new Refund(100).isPositive() == false;
        System.out.println(a + "\n" + b );
    }


}
