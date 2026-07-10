import java.io.*;
import java.net.*;

class ChatServer
{
    public static void main(String[] args) throws Exception
    {
        System.out.println("Server Applicaion is running");

        ServerSocket ssobj = new ServerSocket(2100);

        System.out.println("server is waiting at port 2100");

        System.out.println("---------------------------------------------------");
        System.out.println("-----------Marvellous Chat Server-----------");
        System.out.println("---------------------------------------------------");

        while(true)
        {
            Socket sobj = ssobj.accept();
            System.out.println("Client request gets accepted successfully");

            ClientHandler chobj = new ClientHandler(sobj);
            chobj.start();
        }
    }
}