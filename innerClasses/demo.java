package innerClasses;

abstract class demo {
    abstract void display();
}
class outer1{
    int x = 29;
    static int y = 24;
    static class sample{
        public void show(){
            System.out.println(y);
        }
    }
    public void meth(){
        demo obj = new demo() {
            @Override
            void display() {
                System.out.println("hello");
            }
        };
        obj.display();
    }
    public static void main(String[] args) {
        outer1 obj = new outer1();
        obj.meth();

        outer1.sample obj1 = new outer1.sample();
        obj1.show();
    }
}

