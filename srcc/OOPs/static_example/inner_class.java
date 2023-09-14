package OOPs.static_example;

public class inner_class {
    public static void main(String[] args) {
        a first = new a("ankur");
        a second = new a("anks");
        System.out.println(first.name);
    }
}
class a {
    String name;
    public a (String name){
        this.name = name;
    }
}

