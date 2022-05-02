package com.company.exercicio_01;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

// Crie uma lista de tarefas e salve a lista em um arquivo
public class Exercicio01Arquivos {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> linhas = new ArrayList<>();
        String tarefas;
        int i = 1;

        while(true) {
            System.out.print("Tarefa " + i + ": ");
            tarefas = scanner.nextLine();

            if (tarefas.equals("x")) {
                break;
            }
            linhas.add(tarefas);
            i++;
        }
        escreverTarefas("C:\\Users\\user\\Desktop\\tarefas.txt", linhas);
    }
    static void escreverTarefas(String arquivo, ArrayList<String> linhas) throws IOException {
        Path path = Paths.get(arquivo);
        Files.write(path, linhas);
    }
}
