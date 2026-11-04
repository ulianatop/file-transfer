import java.net.Socket;
import java.io.IOException;
import java.io.FileInputStream;

public class FileSender {
    public static void main(String[] args) throws IOException {
        // Get the IP address, port and filename
        String ip = args[0];
        int port = Integer.parseInt(args[1]);
        String filename = args[2];

        // Connect to the receiver
        System.out.println("Connecting...");
        Socket socket = new Socket(ip, port);
        System.out.println("Connected.");

        // Open the file
        FileInputStream file = new FileInputStream(filename);
        System.out.println("Sending: " + filename);

        // Read and send the file
        int byteData;

        while ((byteData = file.read()) != -1) {
            socket.getOutputStream().write(byteData);
        }

        file.close();
        socket.close();

        System.out.println("Transfer complete.");
    }
}
