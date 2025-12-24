package practice.topic01_strings;

/* ТЕМА 1 — ЗАДАЧА 1.1: normalizeName(String s)
 *
         * ЧТО ДЕЛАЕТ:
        * Приводит имя к нормальному виду:
        * - убирает пробелы по краям
 * - первая буква -> заглавная
 * - остальные буквы -> строчные
 */
public class StringTasks {


    public static boolean isPalindrome(String s) {
       if (s == null )return false;

       int left = 0;
       int right = s.length()-1;
       while (left<right){
           char  cl = s.charAt(left);
           char  cr = s.charAt(right);
           if ( !Character.isLetterOrDigit(cl) ){
               left++;
               continue;
           }
           if (!Character.isLetterOrDigit(cr) ){
               right--;
               continue;
           }
           if(Character.toLowerCase(cl) != Character.toLowerCase(cr) ){
                return false;
           }
           left++;
           right--;
       }
       return true;
    }



    public static String normName(String s){
        if(s == null){throw new IllegalArgumentException("Пустое имя");}
        s =  s.toLowerCase().trim();
        if ( s.isEmpty()){throw new IllegalArgumentException("Пустое имя");}
        return s.substring(0,1).toUpperCase() + s.substring(1);
    }
    public static void main(String[] args) {
        System.out.println(StringTasks.isPalindrome("Aboba"));
        System.out.println(StringTasks.normName("DIMA"));
    }

}
