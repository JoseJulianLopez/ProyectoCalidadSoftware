package proyectoprogra;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketServidor {

    public static void main(String[] args) {

        ServerSocket servidor = null;
        Socket sc = null;
        DataInputStream in;
        DataOutputStream out;

        final int PUERTO = 5000;
        try {

            servidor = new ServerSocket(PUERTO);
            System.out.println("Servidor Iniciado");

            while (true) {

                sc = servidor.accept();

                in = new DataInputStream(sc.getInputStream());
                out = new DataOutputStream(sc.getOutputStream());

                String mensaje = in.readUTF();
                System.out.println(mensaje);
//                out.writeUTF("Hola mundo desde el servidor");

                sc.close();

            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
