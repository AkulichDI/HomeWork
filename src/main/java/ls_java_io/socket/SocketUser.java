package ls_java_io.socket;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class SocketUser {


    public static void main(String[] args) {

        System.out.println("фр фр фр пхх пп п\nФууух запустились ");

        try(Socket socket = new Socket("localhost", 8081);
            var out = new DataOutputStream(socket.getOutputStream());
            var input = new DataInputStream(socket.getInputStream());
            var scanner = new Scanner(System.in)){

            while (!socket.isClosed()){
                System.out.print("You msg: ");
                String ymsg = scanner.nextLine();
                out.writeUTF(ymsg);
                if( ymsg.equals("bye")){
                    break;
                }
                String msg = input.readUTF();
                System.out.println("Server msg: " + msg);



            }



        }catch (IOException e ){
            e.printStackTrace();
        }



    }


}
