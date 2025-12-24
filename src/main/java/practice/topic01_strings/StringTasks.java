package practice.topic01_strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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


    public static int countVowels(String s) {
        if (s == null)return 0;
        List<Character> charsRUEN = new ArrayList<>();
        String chars = "аеёиоуыэюя" + "aeiouy";
        List<Character> resultChars = new ArrayList<>();
        int counter = 0;
        for (var lit : chars.toCharArray()){
            charsRUEN.add(lit);
        }

        for (var lit : s.toCharArray()){
            for (var arrLit : charsRUEN) {
                if (Character.toLowerCase(lit) == Character.toLowerCase(arrLit)){
                    counter++;
                    resultChars.add(lit);
                }
            }


        }


     return counter;
    }








    public static String normName(String s){
        if(s == null){throw new IllegalArgumentException("Пустое имя");}
        s =  s.toLowerCase().trim();
        if ( s.isEmpty()){throw new IllegalArgumentException("Пустое имя");}
        return s.substring(0,1).toUpperCase() + s.substring(1);
    }
    public static void main(String[] args) {


        System.out.println(StringTasks.countVowels("DIMA"));
        //System.out.println(StringTasks.isPalindrome("Aboba"));
        //System.out.println(StringTasks.normName("DIMA"));
    }

}
