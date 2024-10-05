package Methods;

public class Practice1 {
    static int max(int a,int b){
        return a>b?a:b;
    }
    static float max(float a,float b){
        return a>b?a:b;
    }
    public static void main(String[] args) {
        System.out.println(max(894,7439));
        System.out.println(max(45.7f,4545.75f));
    }
}
