import java.util.Scanner;

public class Potenciacao {

	public void Calcula() {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		double num1, num2, calcula;
		int input;

		System.out.println("****************  POTENCIA��O  ****************\n");
		System.out.println("Digite o valor");
		num1 = s.nextInt();
		System.out.println("Digite a Pot�ncia");
		num2 = s.nextInt();
		calcula = Math.pow(num1, num2);
		System.out.println("O valor da Potencia��o � " + calcula + "\n");
		System.out.println("Digite uma Op��o");
		System.out.println("1 - Realizar nova Potencia��o");
		System.out.println("2 - Voltar ");
		System.out.println("0 - Sair");
		input = s.nextInt();

		switch (input) {
		case 1:
			Potenciacao pot = new Potenciacao();
			pot.Calcula();
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