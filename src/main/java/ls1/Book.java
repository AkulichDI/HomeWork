package ls1;


/**
 * Урок 1 — Задание 4: Рефакторинг “плохого класса”
 * Короткое напоминание:
 * public поля — это почти всегда плохо: кто угодно может положить туда мусор и сломать объект. Делаем private + проверяем правила в конструкторе/сеттерах.
 * Дано (плохой стиль)
 * public class Book {
 *     public int count;
 *     public String title;
 * }
 * Твоя задача
 * Переписать в нормальный вид:
 * Обязательное:
 * поля private
 * конструктор Book(String title, int count)
 * валидация:
 * title не null и не blank
 * count >= 0
 * геттеры
 * Опционально (по желанию):
 * toString()
 * сеттеры (если добавишь — с такой же валидацией)
 * Критерий готовности:
 * new Book(" ", 10) → исключение
 * new Book("Java", -1) → исключение
 * new Book("Java", 10) → создаётся нормально
 */
public class Book {
    private int count;
    private String title;


    public Book (int count, String title){
        validatorCount(count);
        validatorTitle(title);
        this.count = count;
        this.title = title;
    }

    private static void validatorCount (int count){
        if (count < 0 ){
            throw new IllegalArgumentException("Количество меньше 0");
        }
    }
    private static void validatorTitle (String title){
        if (title == null || title.isBlank()){
            throw new IllegalArgumentException("Пустое наименование");
        }
    }

    @Override
    public String toString() {
        return "Book{" +
                "count=" + count +
                ", title='" + title + '\'' +
                '}';
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        validatorTitle(title);
        this.count = count;
    }

    public void setTitle(String title) {
        validatorTitle(title);
        this.title = title;
    }

}

class tain {
    public static void main(String[] args) {
        var a = new Book(20, "Tot");
        var ab = new Book(-3, "");

        System.out.println(a);
    }
}
