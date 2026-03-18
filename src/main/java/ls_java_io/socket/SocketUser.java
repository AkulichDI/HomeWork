package ls_java_io.socket;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

public class SocketUser {


    public static void main(String[] args) throws IOException {

        Socket socket = new Socket("127.0.0.1",8081);
        PrintWriter out = new PrintWriter(socket.getOutputStream());

        out.println("dfsdfsd");
        out.println("sdafsdfs");
        out.println("fsdadsas");
        out.flush();
        out.close();
        socket.close();
    }


}
