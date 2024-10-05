package networkProgramming.reverseEcho;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

public class client {
        public static void main(String[] args) throws Exception{
            Socket ss = new Socket("192.168.56.1",2000);

            BufferedReader keyB = new BufferedReader(new InputStreamReader(System.in));
            BufferedReader br = new BufferedReader(new InputStreamReader(ss.getInputStream()));
            PrintStream ps = new PrintStream(ss.getOutputStream());

            String msg;
            do {
                msg= keyB.readLine();

                ps.println(msg);
                msg = br.readLine();
                System.out.println("From server: "+ msg);
            }while (!msg.equals("dne"));
            ss.close();

        }
    }

