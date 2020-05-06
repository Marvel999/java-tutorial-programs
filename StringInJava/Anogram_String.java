package StringInJava;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

/**
 * Anagram of string is basically to string satify the condition
 * 1. Both string of same length.
 * 2. the frequncy of char repetation should be same.
 */
public class Anogram_String {
    public static void main(String[] args){
        String a1="aab";
        String a2="aba";
        char[] chara1=a1.toCharArray();
        char[] chara2=a2.toCharArray();
        Arrays.sort(chara1);
        Arrays.sort(chara2);
//        System.out.println(Arrays.toString(chara2)+"         "+Arrays.toString(chara2));

        if(a1.length()==a2.length()){
            if(Arrays.toString(chara2).equals(Arrays.toString(chara2))){
                System.out.println("String is anagram");
            }
            else
                System.out.println("Strings are not anagram");

        }
        else
        System.out.println("Strings are not anagram");

    }
}
