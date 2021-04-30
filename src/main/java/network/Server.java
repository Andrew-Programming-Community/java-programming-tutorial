package network;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

  public static void main(String[] args) {
    startServer();
  }

  public static void startServer() {
    try {
      ServerSocket serverSocket = new ServerSocket(8000);
      Socket socket = serverSocket.accept();

      DataInputStream inputFromClient = new DataInputStream(socket.getInputStream());
      DataOutputStream outputToClient = new DataOutputStream(socket.getOutputStream());

      while (true) {
        double radius = inputFromClient.readDouble();
        double area = radius * radius * Math.PI;

        outputToClient.writeDouble(area);
        outputToClient.flush();
        System.out.println("Area is :" + area + " and already sent to client!");
      }
    } catch (IOException ex) {
     ex.printStackTrace();
    }
  }
}
