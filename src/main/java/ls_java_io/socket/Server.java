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
                String msg = inputStream.readUTF();

                System.out.println("User message: " + msg);
                if (msg.equals("bye")){
                    outputStream.writeUTF("Ты пока");
                    socket.close();
                    break;
                }
                System.out.print("You: ");
                outputStream.writeUTF(  scanner.nextLine());




            }
        }catch (IOException e) {

            e.printStackTrace();
        }






    }
}
