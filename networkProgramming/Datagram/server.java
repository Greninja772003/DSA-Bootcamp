package networkProgramming.Datagram;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.nio.charset.StandardCharsets;

public class server {
    public static void main(String[] args) throws Exception{
        DatagramSocket ds = new DatagramSocket(2000);
        DatagramPacket dp;
        byte b[] = new byte[1024];
        dp = new DatagramPacket(b,1024);
        ds.receive(dp);
        String msg = new String(dp.getData());
        System.out.println("From Server: "+ msg);
        StringBuilder sb = new StringBuilder(msg);
        sb.reverse();
        msg= sb.toString();
        dp = new DatagramPacket(msg.getBytes(StandardCharsets.UTF_8),msg.length(), InetAddress.getByName("localhost"), 2001);
        ds.send(dp);

        ds.close();
    }
}
