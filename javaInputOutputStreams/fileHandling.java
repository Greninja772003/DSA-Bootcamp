package javaInputOutputStreams;

import java.io.File;
import java.util.Arrays;

public class fileHandling {
    public static void main(String[] args)throws Exception {
        File f = new File("C:/Users/HP/IdeaProjects/Java Programming/src");
//        System.out.println(Arrays.toString(f.list()));
        String [] str = f.list();
        for (String x:str) {
            System.out.println(x);
        }
        File [] fi = f.listFiles();
        for (File x:fi) {
            System.out.print(x.getName() + " " );
            System.out.println(x.getPath());
        }
    }
}
