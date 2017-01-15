import android.os.Bundle;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.net.Socket;


/**
 * Created by Liebing on 15.01.2017.
 */

public class SendData
{
    public String ip = "";
    Socket s = null;
    static String outMove = ""; //Zug muss noch von Engine übergeben werden
    public SendData()
    {
          try
          {
              s = new Socket(ip, 5555);

              BufferedWriter out = null;
              out = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
              out.write(outMove);
              out.flush();
              out.close();
          }
          catch (Exception e)
          {
          }

    }

}
