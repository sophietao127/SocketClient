import java.net.*;
import java.io.*;

public class SocketClient {
  public static void main(String[] args) throws Exception {
    String host = args[0];
    int port = Integer.valueOf(args[1]);

    try {
    	Socket sock = new Socket(host, port);
	InputStream in = sock.getInputStream();
	int readChar = 0;

	while ((readChar = in.read()) != -1) {
		System.out.write(readChar);
	}
	sock.close();
	} catch(IOException ex) {
		System.err.println(ex);
	}
  }
}
