package alessandro.milli;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class Client {

DatagramSocket socket;
byte[] buffer = new byte[1024];

    public Client() {
        try {
            socket = new DatagramSocket(42069);
            DatagramPacket request = new DatagramPacket(buffer, buffer.length, InetAddress.getByName("127.0.0.1"), 41690);
            socket.send(request);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}