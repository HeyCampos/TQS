import java.util.Scanner;

public class Subtracao {

	public void Calcula() {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int num1, num2, calcula, input;

		System.out.println("****************  SUBTRAÇÃO  ****************\n");
		System.out.println("Digite o primeiro valor");
		num1 = s.nextInt();
		System.out.println("Digite o segundo valor");
		num2 = s.nextInt();
		calcula = num1 - num2;
		System.out.println("O valor da Subtração é " + calcula + "\n");
		System.out.println("Digite uma Opção");
		System.out.println("1 - Realizar nova Subtração");
		System.out.println("2 - Voltar ");
		System.out.println("0 - Sair");
		input = s.nextInt();

		switch (input) {
		case 1:
			Subtracao sub = new Subtracao();
			sub.Calcula();
			break;
		case 2:
			Opcoes.main(null);
			break;
		case 0:
			System.out.println("Tchau!!");
			System.exit(0);
			break;
		}
	}
}
