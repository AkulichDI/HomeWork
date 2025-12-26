package practice.topic09_collections.lesson05;

import java.util.List;

public class StackLesson05 {

    /**
     * ЗАДАЧА 5.1: isBracketsBalanced(String s)
     *
     * Проверить, что скобки сбалансированы.
     * Поддержка: (), {}, []
     *
     * Правила:
     * - s == null -> false
     * - любые другие символы игнорировать (буквы, цифры, пробелы)
     * - если скобки закрываются неправильно -> false
     * - если в конце стек не пуст -> false
     *
     * Пример:
     * "a(b[c]{d})" -> true
     * "(]" -> false
     * "(()" -> false
     */
    public static boolean isBracketsBalanced(String s) {
        // TODO
        return false;
    }

    /**
     * ЗАДАЧА 5.2: evalRPN(List<String> tokens)
     *
     * Вычислить выражение в обратной польской нотации.
     * Операции: +, -, *, /
     * Деление — целочисленное как в Java (например 7/2 = 3, -7/2 = -3).
     *
     * Правила:
     * - tokens == null или пусто -> IllegalArgumentException("tokens пустые")
     * - токен может быть числом (например "-12") или оператором
     * - при ошибке формата -> IllegalArgumentException("некорректное выражение")
     *
     * Пример:
     * ["2","1","+","3","*"] -> 9
     * ["4","13","5","/","+"] -> 6
     */
    public static int evalRPN(List<String> tokens) {
        // TODO
        return 0;
    }

    /**
     * ЗАДАЧА 5.3: simplifyPath(String path)
     *
     * Упростить unix-путь:
     * - "/" — корень
     * - "." — текущая папка (игнор)
     * - ".." — подняться на уровень вверх (pop если есть)
     * - несколько "/" подряд считать как один
     *
     * Правила:
     * - path == null или blank -> "/"
     * - результат всегда начинается с "/"
     * - если после упрощения пусто -> "/"
     *
     * Пример:
     * "/a/./b/../../c/" -> "/c"
     * "/../" -> "/"
     */
    public static String simplifyPath(String path) {
        // TODO
        return "/";
    }

    /**
     * ЗАДАЧА 5.4: nextGreaterRight(int[] a)
     *
     * Для каждого элемента найти ближайший справа элемент, который больше.
     * Если справа нет большего -> -1.
     *
     * Правила:
     * - a == null -> пустой массив
     *
     * Пример:
     * [2,1,2,4,3] -> [4,2,4,-1,-1]
     *
     * Подсказка: стек индексов.
     */
    public static int[] nextGreaterRight(int[] a) {
        // TODO
        return new int[0];
    }

    /**
     * ЗАДАЧА 5.5: applyUndoRedo(List<String> commands)
     *
     * Есть текстовый редактор. Команды:
     * - "TYPE x"   (x — строка без пробелов) -> добавляет x в конец текста
     * - "UNDO"     -> отменяет последнее TYPE (если нечего отменять — ничего)
     * - "REDO"     -> возвращает последнее отменённое TYPE (если нечего — ничего)
     *
     * Правила:
     * - commands == null -> ""
     * - после любого нового TYPE стек REDO очищается (как в реальных редакторах)
     * - итог вернуть как строку, склеив все добавленные куски через пробел
     *   (например TYPE A, TYPE B -> "A B")
     *
     * Пример:
     * ["TYPE A","TYPE B","UNDO","REDO","TYPE C"] -> "A B C"
     *
     * Подсказка: два стека: done и undone.
     */
    public static String applyUndoRedo(List<String> commands) {
        // TODO
        return "";
    }




}
