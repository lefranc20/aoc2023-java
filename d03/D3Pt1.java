import java.io.File;
import java.io.FileNotFoundException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.util.Scanner;

import java.util.regex.*;

public class D3Pt1 {
    public static void main(String[] args) {
        String nomeArquivo = "input.txt";
		try {
            processaArquivoEntrada(nomeArquivo);
        } catch (IOException e) {
            e.printStackTrace();
        }
		
		for ()
		
	}
	
	public static String processaArquivoEntrada(String nomeArquivo) throws IOException {
		String linha;
		int i = 0;
		String[] strAr = new String[140];
		// O BufferedReader em conjunto com o FileReader previne o nosso leitor de sair caso ele veja uma linha vazia (não sendo o fim do arquivo)
		try (BufferedReader reader = new BufferedReader(new FileReader(nomeArquivo))) {
            while ((linha = reader.readLine()) != null) { // executa linha por linha até chegar no fim do arquivo
                strAr[i] = linha;
				i++;
            }
        }
		
		
	}
}