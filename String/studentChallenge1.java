package String;

public class studentChallenge1 {
    public static void main(String[] args) {
        String str = "programmer@gmail.com";
        String user ;
//        System.out.println("Index of '@' character in the email: "+ str.indexOf("@"));
        user = str.substring(0,10);
        System.out.println("Username of email : "+ user);
        System.out.println("Domain of email: "+ str.substring(11,str.length()));
//        System.out.println("Index of '.' operator in the email: "+ str.indexOf("."));
        String domain = str.substring(11,16);
        System.out.println("Does the domain of email is 'gmail'? "+ domain.equals("gmail"));
    }
}
