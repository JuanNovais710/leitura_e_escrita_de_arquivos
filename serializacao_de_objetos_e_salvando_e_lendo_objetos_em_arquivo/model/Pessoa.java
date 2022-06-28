package serializacao_de_objetos_e_salvando_e_lendo_objetos_em_arquivo.model;

import java.io.Serializable;

public class Pessoa implements Serializable {
    private static final long serialVersionID = 1L;
    private String nome;
    private int idade;
    private String profissao;

    public static long getSerialVersionID() {
        return serialVersionID;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }
}
