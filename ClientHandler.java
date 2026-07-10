import java.io.*;
import java.net.*;

class ClientHandler extends Thread
{
    Socket sobj;
    String username;

    ClientHandler(Socket sobj)
    {
        this.sobj = sobj;
    }

    public void run()
    {
        try
        {
            PrintStream pobj = new PrintStream(sobj.getOutputStream());
            BufferedReader bobj1 = new BufferedReader(new InputStreamReader(sobj.getInputStream()));
            BufferedReader bobj2 = new BufferedReader(new InputStreamReader(System.in));

            pobj.println("Enter your username: ");
            username = bobj1.readLine();

            System.out.println(username + " has joined the chat");

            String str1 = null, str2 = null;

            while((str1 = bobj1.readLine()) != null)
            {
                System.out.println(username + ": " + str1);
                System.out.println("Enter msg for " + username + ": ");
                str2 = bobj2.readLine();
                pobj.println(str2);
            }

            System.out.println(username + " has left the chat");
        }
        catch(Exception e)
        {
            System.out.println("Error: " + e);
        }
    }
}