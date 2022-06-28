package enviando_objetos_na_rede;

import java.io.*;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("192.168.0.1", 3333);
        OutputStream saida = socket.getOutputStream();
        ObjectOutput objectOutput = new ObjectOutputStream(saida);

        Pedido pedido = new Pedido();
        pedido.setCodigo(2L);
        pedido.setQuantidade(2);
        pedido.setDescricao("Pasta de dente");

        objectOutput.writeObject(pedido);

        InputStream entrada = socket.getInputStream();
        DataInputStream dataInputStream = new DataInputStream(entrada);
        System.out.println("Recebeu do servidor: " + dataInputStream.readUTF());

        socket.close();
    }
}
