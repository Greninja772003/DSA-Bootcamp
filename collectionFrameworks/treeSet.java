package collectionFrameworks;

import java.util.List;
import java.util.TreeSet;

class point implements Comparable{
    int x, y;
public int compareTo(Object o){
    point j = (point) o;
    if (this.x<j.x)
        return -1;
    else if (this.x>j.x) {
        return 1;
    }
    else {
        if (this.y<j.y)
            return -1;
        else if (this.y<j.y) {
            return 1;
        }else return 0;
    }
}
    public point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "x=" + x + " y=" + y ;
    }

}
public class treeSet {
    public static void main(String[] args) {
        TreeSet<point> ts = new TreeSet<point>();
//        ts.add(50);
//        System.out.println(ts);
//        System.out.println(ts.ceiling(2));
        ts.add(new point(2,5));
        ts.add(new point(1,3));
        ts.add(new point(3,2));
        ts.add(new point(1,5));
        System.out.println(ts);
    }
}
