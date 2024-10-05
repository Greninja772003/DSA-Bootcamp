package collectionFrameworks;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

@SuppressWarnings("ALL")
public class propertyDemo {
    public static void main(String[] args) throws Exception {
        Properties p = new Properties();
       /* p.setProperty("Brand", " Asus");
        p.setProperty("processor", " Ryzen 7");
        p.setProperty("OS", " Linux");
        p.setProperty("model", " Zenbook");
        p.storeToXML(new FileOutputStream("C:/Users/HP/IdeaProjects/Java Programming/src/collectionFrameworks/data.xml"), "Laptop");
        */
        p.loadFromXML(new FileInputStream("C:/Users/HP/IdeaProjects/Java Programming/src/collectionFrameworks/data.xml"));
        System.out.println(p.getProperty("Brand"));
    }
}
