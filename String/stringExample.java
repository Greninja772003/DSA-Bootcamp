package String;

public class stringExample {
    public static void main(String[] args) {
        char[] a = {'a', 'n', 'k', 'u', 'r'};
        byte[] b = {65, 66, 67, 68};
        String str = new String(a);
        System.out.println("String str pointed at: " + str);
        String str1 = new String(b, 3, 1);
        System.out.println("String str1 pointed at byte array string after 3 index: " + str1);

        String str2 = "ankur";
        String str3 = "ankur ";
        System.out.println("Does str2 is identical to str3? " + str2.equals(str3));

        String str4 = new String("ankur");
        System.out.println("Does str4 is identical to str3? " + str4.equals(str3));
        System.out.println("Does str4 and str3 have same references?: " + (str4==str3));

        System.out.println("Length of string str3: " + str3.length());
        System.out.println("Transform string str3 to uppercase: " + str3.toUpperCase());
        System.out.println("string str3 after 2 index upto 4th index values is: " + str3.substring(2, 4));
        System.out.println("replace k character with t in string str3: " + str3.replace('k', 't'));

        String Str = "www.ankur.gov.in";
        System.out.println("Does the string Str starts with www? " + Str.startsWith("www"));
        System.out.println("Does the string Str starts with ankur after 4th index? " + Str.startsWith("ankur", 4));
        System.out.println("Does the string Str ends with in? " + Str.endsWith("in"));
        System.out.println("What is the character present at 12th index in Str string? " + Str.charAt(12));
        System.out.println("What is the index of 'ankur' in Str string? " + Str.indexOf("ankur"));
        System.out.println("What is the index of '.' after 4th index in Str string? " + Str.indexOf(".", 4));
        System.out.println("What is last index value of '.' in Str string? " + Str.lastIndexOf("."));
        for (int i = 0; i < Str.length(); i++) {
        System.out.println( "Character at index " + i + " in Str string: " + Str.charAt(i));
        }

        System.out.println("Compare str1 with itself where the second entity have uppercase string: "+ str1.equalsIgnoreCase(str1.toUpperCase()));
        System.out.println("Does the str and Str strings are lexicographically similar or not? "+str.compareTo(Str));
        System.out.println("Does the Str string contain 'gov' or not? " + Str.contains("gov"));
        System.out.println("Concatenate str3 and Str strings so they combine to form a new string: " + str3.concat(Str));

    }
}
