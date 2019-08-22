import java.util.Scanner;

public class Raiz {

	public void Calcula() {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		double num1, calcula;
		int input;

		System.out.println("\n****************  RAIZ  ****************\n");
		System.out.println("Digite o valor que deseja saber a Raiz Quadrada");
		num1 = s.nextInt();
		calcula = Math.sqrt(num1);
		System.out.println("O valor da Potenciação é " + calcula + "\n");
		System.out.println("Digite uma Opção");
		System.out.println("1 - Realizar nova Potenciação");
		System.out.println("2 - Voltar ");
		System.out.println("0 - Sair");
		input = s.nextInt();

		switch (input) {
		case 1:
			Raiz raiz = new Raiz();
			raiz.Calcula();
			break;
		case 2:
			Opcoes.main(null);
			break;
		case 0:
			System.out.println("Tchau!!");
			System.exit(0);
		default:
			System.out.println("Essa não é uma Opção Válida! Tchau");
			break;
		}

	}
}
