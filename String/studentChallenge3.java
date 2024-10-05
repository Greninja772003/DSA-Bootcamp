package String;

public class studentChallenge3 {
    public static void main(String[] args) {
        String str = "a!M@7#1$2%3";
        str = str.replaceAll("\\W","");
        System.out.println("str string without any special character: "+str);

        String str1 = " a  n  k  u  r  ";
        str1 = str1.replaceAll("\\s+", "");
        System.out.println("str1 string without extra space: "+str1);

        String str2 = "ankur772003";
        str2 = str2.replaceAll("\\d","");
        System.out.println("Number of words in the str2 string: "+ str2.length());
    }
}
