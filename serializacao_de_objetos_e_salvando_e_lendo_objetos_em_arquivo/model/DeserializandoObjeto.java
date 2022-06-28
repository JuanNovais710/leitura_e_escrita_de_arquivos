package serializacao_de_objetos_e_salvando_e_lendo_objetos_em_arquivo.model;

import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

public class DeserializandoObjeto {
    public static void main(String[] args) throws IOException {
        try (ObjectInput in = new ObjectInputStream(Files.newInputStream(Paths.get("joao.obj")))){
            Pessoa p = (Pessoa) in.readObject();
            System.out.println("Nome: " + p.getNome() + "\nProfissão: " + p.getProfissao() + "\nIdade: " + p.getIdade());
        }catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            System.out.println("Erro convertendo para a classe pessoa");
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
}
