package stringMethods.strings;

import java.util.Arrays;
public class Strings {

    public static void main(String[] args) {

        String universalString = "Hello world";

        {   // str1.trim() :--> returns the trimmed string
            // example :        "  my name is chirag  " -to-> "my name is chirag" .
            String untrimmed = "  Hello world . ";
            String trimmed = untrimmed.trim();
            System.out.println( trimmed );
        }

        {   // str1.equals(str1)
            String str1 = new String("Hello");
            String str2 = new String("Hello");
            String str3 = "Hello";
            String str4 = "Hello";
            System.out.println(str1 == str2); // This is false
            System.out.println(str1 == str3); // This is false
            System.out.println(str3 == str4); // This is true
            System.out.println(str1.equals(str2)); // This is true
            System.out.println(str1.equals(str3)); // This is true
            System.out.println(str3.equals(str4)); // This is true
            /*     Note :-->
                       1. in case of Strings == will checks value as well as reference (only when created using new keyword)
                       2. str1.equal(str2) will only check for value. (preferred one).
                       */
        }


        {   // emptyStr.isEmpty() :--> will return true if the string is empty else false (spaces will be counted as elements).
            String emptyStr = " ";
            System.out.println(emptyStr.isEmpty());

            // spaces.isBlank() :--> will return true if the string is only spaces else false.
            String spaces = "";
            System.out.println(spaces.isBlank());
        }

        {   // str1.length() :--> it will return the length of the string.
            System.out.println(universalString.length());
        }

        {   // str1.charAt(0) :--> will return the character at the given index of the given string.
            System.out.println(universalString.charAt(8));
        }

        {   // str1.concat(str1) :--> will return a new strings which is created by adding the given strings, original strings will not be effected
            String str1 = "Hello";
            String str2 = " World";
            String str3 = str1.concat(str2);

            System.out.println(str1);
            System.out.println(str2);
            System.out.println(str3);
        }

        {   // str.split(regex) :--> will return an array made by the string separated at the given regex.
            String alphabets = "a,b,c,d,e,f";
            String[] x = alphabets.split(";");
            System.out.println(Arrays.toString(x));
        }

        {   // str1.startsWith(str1) :--> will return if it starts with the given subString else false . every string starts with ("").
            System.out.println(universalString.startsWith("Hell"));
            // str1.endsWith(str1) :--> will return if it ends with the given subString else false. every string ends with ("").
            System.out.println(universalString.endsWith("rld"));
            System.out.println(universalString.endsWith(""));
        }

        {   // str1.indexOf("abc", 0) :--> returns the index of the given substring. (first index of the repeated subStrings).
            // if no value found it will return -1.
            System.out.println(universalString.indexOf("lo"));
        }

        {   // str1.contains(subString) :--> returns true if the string contains the subString else false.
            System.out.println(universalString.contains("rld"));
        }

        {   // str1.compareTo(str1) :--> will compare given strings lexically and return the difference.
            String str1 = "hello";
            String str2 = "hello";
            System.out.println(str1.compareTo(str2));
                /*  Return values :
                        case 1: str1 < str2 ----> -ve integer
                        case 2: str1 == str2 ----> 0
                        case 3: str1 > str2 ----> +ve integer
                */
        }

        {   // str1.replace(str1, str1) :--> return a String replacing all the occurrence of the given old subString to the new subString.
            String str1 = "hello world world world";
            String str2 = str1.replace("world", "xxx");
            System.out.println(str1);
            System.out.println(str2);

            // universalString.replaceFirst() :--> return a String replacing the first occurrence of the given old subString to the new subString.
            str2 = str1.replaceFirst("world", "xxx");
            System.out.println(str1);
            System.out.println(str2);
        }

        {   // universalString.toLowerCase() :--> return the string to lower case
            String upperCase = "CHIRAG GANDHERVA";
            System.out.println(upperCase.toLowerCase());

            // universalString.toUpperCase() :--> return the string to upper case
            String lowerCase = "chirag gandherva";
            System.out.println(lowerCase.toUpperCase());
        }

        {   // adding two or more strings
            String h = "Hello";
            String space = " ";
            String w = "world";
            String str = h + space + w;

            System.out.println(str);
        }

        {   /*  Substring of a String.
                       string.substring( beginning-index , ending-index );

                        * Ending index is excluded.
                        * if the ending-index is not spacified , by default the ending-index will be the last index.
                        */

            String priyaIdentity = new String("Priya is very good girl");
            String subStr = priyaIdentity.substring(0, 10);
            System.out.println( subStr );
        }

        {   // str.toCharArray() :--> return an Array of characters of the string.
            char[] charArray = universalString.toCharArray();
            System.out.println( Arrays.toString( charArray ));
        }

        //universalString.toCharArray()
    }
}
