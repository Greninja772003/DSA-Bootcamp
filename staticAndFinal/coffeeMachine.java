package staticAndFinal;

public class coffeeMachine {
    private float coffeeQty;
    private float sugarQty;
    private float milkQty;
    private float waterQty;
    static  private coffeeMachine ref = null;

    public coffeeMachine() {
        coffeeQty= 1;
        sugarQty= 1;
        milkQty= 1;
        waterQty= 1;
    }
    public void fillWater(float qty){
        waterQty= qty;
    }
    public void fillSugar(float qty){
        sugarQty= qty;
    }
    public float getCoffee(){
        return 0.983f;
    }
    static coffeeMachine getInstance(){
        if (ref==null){
            ref = new coffeeMachine();
        }
        return ref;
    }
}
 class test2{
    public static void main(String[] args) {
     coffeeMachine obj = coffeeMachine.getInstance();
     coffeeMachine obj1 =coffeeMachine.getInstance();

        System.out.println(obj + " "+ obj1);
        if (obj == obj1){
            System.out.println("same");
        }
        System.out.println(obj.equals(obj1));
    }
}
