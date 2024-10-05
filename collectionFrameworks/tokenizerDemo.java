package collectionFrameworks;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.StringTokenizer;
@SuppressWarnings("ALL")
public class tokenizerDemo {
    public static void main(String[] args) throws Exception {
//        String data = " name = Ankur; age = 20; address = Indore; country = India";
        FileInputStream fis = new FileInputStream("C:/Users/HP/IdeaProjects/Java Programming/src/collectionFrameworks/num.txt");
        byte[] b = new byte[fis.available()];
        fis.read(b);
        String data = new String(b);
        ArrayList<Integer> als = new ArrayList<>();
        StringTokenizer stk = new StringTokenizer(data,",");
        String s;
        while (stk.hasMoreTokens()){
            s= stk.nextToken();
            als.add(Integer.valueOf(s));
        }
        System.out.println(als);
    }
}
