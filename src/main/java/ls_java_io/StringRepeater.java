package ls_java_io;

import java.util.Scanner;

public class StringRepeater {


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        /*
        System.out.println("Hello");
        Scanner in = new Scanner(System.in);
        String infoUser = in.nextLine();
        System.out.println("Вы ввели: " + infoUser);

        Scanner in = new Scanner(System.in);
        System.out.print("Введи имя: ");
        String name = in.next();
        System.out.print("Введи возраст: " );
        byte age = in.nextByte();
        System.out.printf("Привет %s, ваш возраст %d", name , age);

        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое число:");
        int a = in.nextInt();
        System.out.print("Введите второе число:");
        int b = in.nextInt();
        System.out.printf("Сумма: %1d", a * b);


        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        double result = (a + b + c) / 3.0;
        System.out.println(result);



        String data = in.nextLine();
        System.out.println(data.length());


        String data = in.nextLine();
        if (data != null || !data.trim().isBlank()){
            System.out.printf("Первая буква: %s \nВторая буква: %s ", data.toCharArray()[0], data.toCharArray()[data.length()-1]);
        }
*/

        String name;
        String lastName;
        byte age;
        String city;
        String favLang;

        System.out.println("Заполняем анкету");
        System.out.print("Имя: ");
        name = in.nextLine();
        System.out.print("Фамилия: ");
        lastName = in.nextLine();
        System.out.print("Возраст: ");
        age = in.nextByte();
        System.out.print("Город: ");
        city = in.nextLine();
        System.out.print("Любимый язык: ");
        favLang = in.nextLine();

        System.out.printf("===Анкета===\nИмя: %s\nФамилия: %s\nВозраст: %d\nГород: %s\nЛюбимый язык: %s\n", name, lastName, age, city, favLang);



    }





}
