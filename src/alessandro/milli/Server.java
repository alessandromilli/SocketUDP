package alessandro.milli;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Server {

    DatagramSocket socket;
    byte[] buffer = new byte[1024];

    public Server() {
        try {
            socket = new DatagramSocket(41690);
            DatagramPacket resp = new DatagramPacket(buffer, buffer.length);
            socket.receive(resp);
            System.out.println((String) resp.getAddress().getHostName());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
