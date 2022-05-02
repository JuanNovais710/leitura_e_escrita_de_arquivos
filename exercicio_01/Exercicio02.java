package com.company;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Exercicio02 {
    public static void main(String[] args) throws IOException {
        List<String> linhas = lerDoArquivo("C:\\Users\\Administrador\\OneDrive\\Área de Trabalho\\tarefas.txt");
        for(int i = 0; i < linhas.size(); i++) {
            String tarefas = linhas.get(i);
            System.out.println("Tarefa: " + i + ": " + tarefas);
        }
    }
    static List<String> lerDoArquivo (String arquivo) throws IOException {
        Path path = Paths.get(arquivo);
        return Files.readAllLines(path);
    }
}
