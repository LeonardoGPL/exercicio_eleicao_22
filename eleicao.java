package eleicoes;
//criando classe scanner e random
import java.util.Scanner;
import java.util.Random;

public class eleicao {

	public static void main(String[] args) {
		//declarando Scanner para entrada de dados
		Scanner batman = new Scanner(System.in);
		//declarando random para randomizar os numeros das eleicoes
		Random random = new Random();
		//criando variaveis 
		int PT = 13, PDT = 12, PL = 22, PSDB = 45, VN = 5, VB = 6, PTv = 0, PDTv = 0, PLv = 0, PSDBv = 0, VNv = 0,VBv = 0, V, VTot;
		// exibir na tela
		System.out.println("(13) PT\n(12) PDT\n(22) PL\n(45) PSDB\nVoto nulo-digite 5\nVoto em Branco-digite 6");
		System.out.println("Seu voto para a(o) Candidata(o): ");
		// atribuindo valor digitado pelo usuario
		V = batman.nextInt();
		batman.close();
		//criando switch para armazenamento de dados
		switch (V) {
		case 13:
			System.out.println("Voce votou no PT");
			break;
		case 12:
			System.out.println("Voce votou no PDT");
			break;
		case 22:
			System.out.println("Voce votou no PL");
			break;
		case 45:
			System.out.println("Voce votou no PSDB");
			break;
		case 5:
			System.out.println("Voce votou nulo");
			break;
		case 6:
			System.out.println("Voce votou em branco");
			break;
		}
		// criando um laco de repeticao
		for (V = 0;; V++) {
			V = random.nextInt(46);
			//criando condicao if
			if (V == 13) {
				System.out.println("Voce votou no PT");
				PTv = PTv + 1;
			}
			if (V == 12) {
				System.out.println("Voce votou no PDT");
				PDTv = PDTv + 1;
			}
			if (V == 22) {
				System.out.println("Voce votou no PL");
				PLv = PLv + 1;
			}
			if (V == 45) {
				System.out.println("Voce votou no PSDB");
				PSDBv = PSDBv + 1;
			}
			if (V == 5) {
				System.out.println("Voce votou Nulo");
				VNv = VNv + 1;
			}
			if (V == 6) {
				System.out.println("Voce votou Branco");
				VBv = VBv + 1;
			}
			//expressoes matematicas para realizar o total de votos
			VTot = PTv + PDTv + PLv + PSDBv + VNv + VBv;
			if (VTot == 50)
				break;
		}
		//exibir na tela
		System.out.println("Contagem do Total de Votos:" + VTot);
		System.out.println("Total de Votos no PT:" + PTv);
		System.out.println("Total de Votos no PDT:" + PDTv);
		System.out.println("Total de Votos no PL:" + PLv);
		System.out.println("Total de Votos no PSDB:" + PSDBv);
		System.out.println("Total de Votos Nulos:" + VNv);
		System.out.println("Total de Votos em Branco:" + VBv);

	}
}
