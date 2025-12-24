package practice.topic01_strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class StringTasks {

    public static String compressRLE(String s) {
        if (validatorNotNull(s))return "Строка null";
        StringBuilder sb = new StringBuilder();
        int counter = 1;
        s = s.trim();
        char current = s.charAt(0);
        for (int i = 1; i<s.length(); i++){
            char ch = s.charAt(i);
            if (current == ch){
                counter++;
            }else {
                sb.append(current).append(counter);
                current = ch;
                counter = 1;
            }
        }
        sb.append(current).append(counter);
        return sb.toString();
    }



    public static boolean validatorNotNull(String s){
        if (s == null)return true;
        s = s.trim();
        if (s.isEmpty())return true;
        return false;
    }


    public static String repeat(String s, int n) {
        if(StringTasks.validatorNotNull(s))throw new IllegalArgumentException("И что мне делать с пустой строкой ?!");
        if( n < 0 ) throw new IllegalArgumentException("N < 0");
        if( n == 0 ) return "";
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n ; i++){
            result.append(s);
        }
        return result.toString();
    }

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

        System.out.println(StringTasks.compressRLE("wertyuiolkjhgfdssghjkhtrewrtyujhgf"));

        // System.out.println(StringTasks.repeat("", 1));
        //  System.out.println(StringTasks.countVowels("DIMA"));
        //System.out.println(StringTasks.isPalindrome("Aboba"));
        //System.out.println(StringTasks.normName("DIMA"));
    }

}
