import java.util.Scanner;

public class Soma {

	public void Calcula() {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int num1, num2, calcula, input;

		System.out.println("****************  SOMA  ****************\n");
		System.out.println("Digite o primeiro valor");
		num1 = s.nextInt();
		System.out.println("Digite o segundo valor");
		num2 = s.nextInt();
		calcula = num1 + num2;
		System.out.println("A Soma � " + calcula + "\n");
		System.out.println("Digite uma Op��o");
		System.out.println("1 - Realizar nova Soma");
		System.out.println("2 - Voltar ");
		System.out.println("0 - Sair");
		input = s.nextInt();

		switch (input) {
		case 1:
			Soma sum = new Soma();
			sum.Calcula();
			break;
		case 2:
			Opcoes.main(null);
			break;
		case 0:
			System.out.println("Tchau!!");
			System.exit(0);
		default:
			System.out.println("Essa n�o � uma Op��o V�lida! Tchau");
			break;
		}
	}
}