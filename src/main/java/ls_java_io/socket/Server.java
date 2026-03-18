package ls_java_io.socket;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {

    public static void main(String[] args)  {

        try (ServerSocket serverSocket = new ServerSocket(8081);
             Socket socket = serverSocket.accept();
             var outputStream = new DataOutputStream(socket.getOutputStream());
             var inputStream = new DataInputStream(socket.getInputStream());
             var scanner = new Scanner(System.in)
        ){
            while (!socket.isClosed() ){

                System.out.print("You: ");
                outputStream.writeUTF(  scanner.nextLine());
                System.out.println("User message: " + inputStream.readUTF());
                if ( inputStream.readUTF().equals("bye")){
                    outputStream.writeUTF("bye bulka");
                    socket.close();
                    serverSocket.close();
                    break;
                }
            }
        }catch (IOException e) {

            e.printStackTrace();
        }






    }
}
