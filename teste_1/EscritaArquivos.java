package com.company.teste_1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class EscritaArquivos {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> linhas = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            System.out.print("Jogador " + (i + 1) + ": ");
            String nomeJogador = scanner.nextLine();
            linhas.add(nomeJogador);
        }
        Path arquivo = Paths.get("C:\\Users\\user\\Desktop\\arquivo2.txt");
        Files.write(arquivo, linhas);
        scanner.close();
        System.out.println("Fim.");
    }
}
