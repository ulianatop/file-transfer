import java.net.Socket;
import java.io.IOException;

public class FileSender {
    public static void main(String[] args) throws IOException {
        String ip = args[0];
        int port = Integer.parseInt(args[1]);
        String filename = args[2];

        System.out.println("Connecting...");
        Socket socket = new Socket(ip, port);
        System.out.println("Connected.");

        socket.close();
    }
}
