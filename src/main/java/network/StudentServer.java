package network;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class StudentServer {

  ObjectInputStream fromClient;

  public StudentServer() {
    try {
      ServerSocket serverSocket = new ServerSocket(8000);
      System.out.println("Server started ");

      while (true) {
        Socket socket = serverSocket.accept();

        fromClient = new ObjectInputStream(socket.getInputStream());
        Object object = fromClient.readObject();
        System.out.println(object);
      }
    } catch (IOException e) {
      e.printStackTrace();
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    } finally {
      try {
        fromClient.close();
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }

  public static void main(String[] args) {
    new StudentServer();
  }
}
