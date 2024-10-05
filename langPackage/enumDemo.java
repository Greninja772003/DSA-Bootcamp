package langPackage;

import java.util.Arrays;
import java.util.Optional;

enum Dept {
    CS, IT, CIVIL, ECE, ME;
    private Dept(){System.out.println(this.name());
    }
    public void display(){
        System.out.println(this.name()+ " "+ this.ordinal());
    }
}


public class enumDemo {
    public static void main(String[] args) {
        Dept obj  = Dept.ME;
        Dept list[] = Dept.values();
        System.out.println(Arrays.toString(list));
        switch (obj) {
            case CS -> System.out.println("Head -> Dubey \n Block -> A");
            case IT -> System.out.println("Head -> Pandey \n Block -> B");
            case ECE -> System.out.println("Head -> Mishra \n Block -> C");
            case CIVIL -> System.out.println("Head -> Manoj \n Block -> Dw");
        }
        obj.display();
    }
}
