package network;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class StudentClient {

  public static void main(String[] args) {
    try {
      Socket socket = new Socket("localhost", 8000);

      ObjectOutputStream toServer = new ObjectOutputStream(socket.getOutputStream());

      StudentAddress studentAddress = new StudentAddress("Andrew", "US", "New York", "gsdf",
          "09091");


      toServer.writeObject(studentAddress);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

}
