package ls_java_io.socket;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {

    public static void main(String[] args) throws IOException {

        StringBuilder sb = new StringBuilder();

        ServerSocket serverSocket = new ServerSocket(8081);
        Socket input = serverSocket.accept();
        Scanner in = new Scanner(input.getInputStream());
        while (in.hasNext()){

            sb.append(in.nextLine());


        }

        in.close();
        input.close();
        serverSocket.close();
        System.out.println("Чтение зак");

        System.out.println(sb.toString());





    }
}
