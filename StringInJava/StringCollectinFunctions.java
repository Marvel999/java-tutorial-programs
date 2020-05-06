package StringInJava;

/**
 * charAt(Index)= it return charecter at given index(0 to size-1).
 * length()=give length of string.
 *substring(beIn,EndIN)= give substring biggen fron beIN and end befor th EndIn.
 * Contains(String)=the string contains substring or not just shoe that think return true false.
 * equals()=it is use for comparing two string return boolean.
 *isEmpty()=it tell string is empty or not return boolean.
 * concat(String)=it concat the string with original string and return an string.
 * replace(char,char)=it replace the corrector from string and return replace charecter string.
 *split(string)=it trturn an string array which is splited acrros the given string.
 * indexof(char)=it give index of the char inside the string it return in -1 for if char is not found.
 *toUpperCase()=it covert string of uppercase.
 * toLowerCase()=it convert string of lowercase.
 * trim()=it use for triming the space(extra space) in th front and back of string
 */
public class StringCollectinFunctions {
    public static void main(String[] args){
        String a1="HiiManish";
        String a2="Manish,Raju,Ankit,Udit";
        System.out.println(a1.charAt(0));
        System.out.println(a1.length());
        System.out.println(a1.substring(1));
        System.out.println(a1.contains("ii"));
        System.out.println(a1.equals("HiiManish"));
        System.out.println(a1.isEmpty());
        System.out.println(a1.concat("_kumar"));
        System.out.println(a1.replace('M','N'));
        String[] friensd=a2.split(",");
        for(String frins:friensd)
            System.out.println(frins);
        System.out.println(a1.indexOf('M'));
        System.out.println(a1.toUpperCase());
        System.out.println(a1.toLowerCase());
        System.out.println(a1.trim());


    }
}
