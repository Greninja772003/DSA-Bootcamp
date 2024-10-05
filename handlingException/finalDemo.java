package handlingException;

public class finalDemo {
    static  void meth()throws Exception{
        try {
            throw new Exception();
        }
        finally {
            System.out.println("last line..");
        }
    }
    public static void main(String[] args)throws Exception {
        meth();
    }
}
