package trackerLs1;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;

/**
 * УРОК 1 — ЗАДАНИЕ 5 (УСЛОЖНЁННОЕ): Мини-трекер "Item" + сервис "Tracker"
 *
 * ЦЕЛЬ:
 * - закрепить инкапсуляцию и инварианты
 * - потренировать equals/hashCode
 * - потренировать коллекции (List/Map) и простые алгоритмы поиска
 * - написать тесты (JUnit 5)
 *
 * ЧАСТЬ A: Класс Item
 * 1) Поля:
 *    - private final long id;
 *    - private String name;
 *    - private String description;
 *    - private final java.time.LocalDateTime created;
 *
 * 2) Конструктор:
 *    - Item(long id, String name, String description, LocalDateTime created)
 *    - Валидация:
 *       * id > 0
 *       * name != null и не blank
 *       * description != null
 *       * created != null
 *    - сохраняй name как name.trim()
 *    - если невалидно -> IllegalArgumentException (сообщение на русском)
 *
 * 3) Сеттеры:
 *    - setName(String) (валидация: не null/не blank, trim)
 *    - setDescription(String) (валидация: не null)
 *
 * 4) equals/hashCode:
 *    - Item считаем равными, если равны id (как сущности в трекере).
 *
 *
 * ЧАСТЬ B: Класс Tracker (без GUI, просто сервис)
 * 5) Хранилище:
 *    - private final java.util.List<Item> items = new java.util.ArrayList<>();
 *
 * 6) Методы (минимум):
 *    - void add(Item item)  // item != null, id не должен повторяться
 *    - Item findById(long id)  // если не найден -> null
 *    - java.util.List<Item> findByName(String name)
 *       * поиск по точному совпадению (после trim)
 *       * вернуть новый список (не внутренний)
 *    - boolean replace(long id, Item newItem)
 *       * заменить существующий Item по id
 *       * newItem != null
 *       * id в newItem должен совпадать с id параметра (иначе исключение)
 *       * вернуть true если заменили, иначе false
 *    - boolean delete(long id)  // удалить по id, вернуть true/false
 *
 *
 * ЧАСТЬ C: JUnit 5 тесты (минимум 6)
 * 7) ItemTest:
 *    - валидное создание проходит
 *    - невалидный name -> IllegalArgumentException
 *    - equals по id работает (два Item с одним id равны)
 *
 * 8) TrackerTest:
 *    - add + findById возвращает добавленный
 *    - findByName находит 2 элемента с одинаковым именем
 *    - replace возвращает true и реально меняет данные
 *    - delete возвращает true и после удаления findById == null
 *
 * ПОДСКАЗКИ:
 * - Для проверки уникальности id при add: сначала найди, есть ли уже такой id.
 * - В тестах на исключения: var ex = assertThrows(...); assertEquals("...", ex.getMessage());
 */

public class Item {
    private  java.time.LocalDateTime created;
    private  long id;
    private String name;
    private String description;

    private static long  idCounter;
    private final static String  nl = "\n";
    private final static String  sp = " ";

    public Item ( long id, String name, String description, LocalDateTime created, boolean generatorID){
        validateOrThrow(id,name, description,created);
        if (generatorID){
            this.id = generatorId();
        }else {
            this.id = id;
            idCounter++;
        }
        this.name = name.trim();
        this.description = description;
        this.created = created;
    }
    // Todo Потом что то придумаю с генератором
    private long generatorId (){return idCounter++;}

    private boolean validatorName (String name){
        if (name != null && !name.isBlank())return true;
        return false;
    }

    private boolean validatorDescription (String description){
        if (description != null )return true;
        return false;
    }
    private boolean validatorDate (LocalDateTime date ){
        if (date != null)return true;
        return false;
    }
    private boolean validatorId (long id){
        if(id > 0) return true;
        return false;
    }
    public LocalDateTime getCreated() {return created;}
    public long getId() {return id;}
    public String getName() {return name;}
    public String getDescription() {return description;}

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


    private static void validateOrThrow(long id, String name, String description, LocalDateTime created) {
        StringBuilder sb = new StringBuilder();

        if (id <= 0) {
            sb.append("id должен быть > 0, пришло: ").append(id).append('\n');
        }
        if (created == null) {
            sb.append("created не должен быть null, пришло: null\n");
        }
        if (name == null || name.isBlank()) {
            sb.append("name не должен быть пустым, пришло: ").append(name).append('\n');
        }
        if (description == null) {
            sb.append("description не должен быть null, пришло: null\n");
        }

        if (sb.length() > 0) {
            throw new IllegalArgumentException("Ошибка создания Item:\n" + sb);
        }
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
