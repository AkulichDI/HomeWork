package trackerLs1;

import java.util.ArrayList;
import java.util.List;

public final class Tracker {

    private final List<Item> tasks = new ArrayList<>();
    private final List<String> menu = new ArrayList<>();


    private Tracker() {initMenu();}

    private static class Holder {
        private static final Tracker INSTANCE = new Tracker();
    }

    public static Tracker getInstance() {return Holder.INSTANCE;}

    private void initMenu() {
        menu.add("1. Показать список");
        menu.add("2. Создать задачу");
        menu.add("3. Поиск задач");
        menu.add("4. Удалить задачу");
        menu.add("10. Завершить работу");
    }

    public void showMenu() {menu.forEach(System.out::println);}

    public void showItems (){

    }
}
