package innerClasses;

public class outer {
    int x = 10;
    inner i = new inner();
    class inner{
        int y= 20;
        public void innerDisplay(){
            System.out.println(x + " "+ y);
        }
    }
    public void outerDisplay(){
        i.innerDisplay();
        System.out.println(i.y);
    }
}
class nestedClass{
    public static void main(String[] args) {
        outer obj = new outer();
        obj.outerDisplay();
        outer.inner obj2 = new outer().new inner();
        obj2.innerDisplay();
    }
}
