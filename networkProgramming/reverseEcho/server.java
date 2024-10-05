package networkProgramming.reverseEcho;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class server {
        public static void main(String[] args) throws Exception {
            ServerSocket ss = new ServerSocket(2000);
            Socket ssk = ss.accept();
            BufferedReader br = new BufferedReader(new InputStreamReader(ssk.getInputStream()));
            PrintStream ps = new PrintStream(ssk.getOutputStream());
            String msg;
            StringBuilder sb;
            do {
                msg = br.readLine();

                sb = new StringBuilder(msg);
                sb.reverse();
                msg= sb.toString();

                ps.println(msg);
            }while (!msg.equals("dne"));
            ssk.close();
            ss.close();
        }
    }



