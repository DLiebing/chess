import android.os.Bundle;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by Liebing on 15.01.2017.
 */

public class ReceiveData
{
    static ServerSocket ss = null;
    static String receivedData = null;
    public ReceiveData()
    {

            try
            {
                ss = new ServerSocket(5555);
                Socket s = ss.accept();
                BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
                while(receivedData = null)
                {
                    receivedData = in.readLine();
                }

                in.close();
                s.close();
                ss.close();
            }
            catch (Exception e)
            {
            }

    }
}

