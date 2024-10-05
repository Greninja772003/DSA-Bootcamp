package networkProgramming.Datagram;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.nio.charset.StandardCharsets;

public class client {
    public static void main(String[] args) throws Exception{
        DatagramSocket ds = new DatagramSocket(2001);
        String msg = "Hello World";
        DatagramPacket dp = new DatagramPacket(msg.getBytes(StandardCharsets.UTF_8),msg.length(), InetAddress.getByName("localhost"), 2000);
        ds.send(dp);
        byte b[] = new byte[1024];
        dp = new DatagramPacket(b,1024);
        ds.receive(dp);
        msg = new String(dp.getData());
        System.out.println("From Server: "+ msg);
        ds.close();
    }
}
