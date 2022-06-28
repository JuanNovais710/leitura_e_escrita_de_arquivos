package serializacao_de_objetos_e_salvando_e_lendo_objetos_em_arquivo.model;

import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

public class SerializandoObjeto {
    public static void main(String[] args) throws IOException {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Juan");
        pessoa.setIdade(18);
        pessoa.setProfissao("Motoboy");

        try (ObjectOutput out = new ObjectOutputStream(Files.newOutputStream(Paths.get("joao.obj")))){
            out.writeObject(pessoa);
            System.out.println("Objeto salvo com sucesso!");
        } catch (IOException e) {
            System.out.println("Erro salvando o objeto " + e.getMessage());
            throw new RuntimeException(e);
        }
    }
}
