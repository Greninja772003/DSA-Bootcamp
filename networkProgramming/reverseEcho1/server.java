package networkProgramming.reverseEcho1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class server extends Thread {
    Socket sk;
    public server(Socket stk){
        sk= stk;
    }
    public void run(){
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(sk.getInputStream()));
            PrintStream ps = new PrintStream(sk.getOutputStream());
            String msg;
            StringBuilder sb;
            do {
                msg = br.readLine();

                sb= new StringBuilder(msg);
                sb.reverse();
                msg= sb.toString();

                ps.println(msg);
            }while (!msg.equals("dne"));
            sk.close();
        }catch (Exception e){}

    }
    public static void main(String[] args) throws Exception{
        ServerSocket ss = new ServerSocket(1000);
        Socket sk;
        server obj;
        int count= 1;
        do {
           sk =ss.accept();
            System.out.println("Client connected: "+ count++ );
           obj = new server(sk);
           obj.start();
        }while (true);
    }
}
