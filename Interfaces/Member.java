package Interfaces;

public interface Member {
    void callBack();
}
class store{
    Member mem[] = new Member[10];
    int count = 0 ;
    void register(Member m){
        mem[count++]=m;
    }
    void inviteSale(){
        for (int i = 0; i < count; i++) {
            mem[i].callBack();
        }
    }
}
class customer implements Member{
    String name;

    public customer(String name) {
        this.name = name;
    }
    public void callBack(){
        System.out.println("Ok, I will check it out: "+ name);
    }
}
class sampleClass2 {
    public static void main(String[] args) {
        store st = new store();
        customer c1 = new customer("Ankur");
        customer c2 = new customer("Aadi");
        st.register(c2);
        st.register(c1);
        st.inviteSale();
    }
}