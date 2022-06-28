package enviando_objetos_na_rede;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ServerSocket server = new ServerSocket(3333);
        System.out.println("Aguardando conexão...");
        Socket socket = server.accept();
        System.out.println("Conectado a: " + socket.getRemoteSocketAddress());

        InputStream entrada = socket.getInputStream();
        ObjectInputStream objectInputStream = new ObjectInputStream(entrada);

        Pedido pedido = (Pedido) objectInputStream.readObject();
        System.out.println("Código: " + pedido.getCodigo());
        System.out.println("Descrição: " + pedido.getDescricao());
        System.out.println("Quantidade: " + pedido.getQuantidade());

        OutputStream saida = socket.getOutputStream();
        DataOutput dataOutput = new DataOutputStream(saida);
        dataOutput.writeUTF("Recebido com sucesso!");
        server.close();
    }
}
