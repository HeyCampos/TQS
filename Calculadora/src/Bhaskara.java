import java.util.Scanner;

public class Bhaskara {

	public void Calcula() {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		double a, b, c, delta, x1, x2;
		int input;

		System.out.println("****************  BHASKARA  ****************\n");
		System.out.println("Digite o valor de A");
		a = s.nextInt();
		System.out.println("Digite o valor de B");
		b = s.nextInt();
		System.out.println("Digite o valor de C");
		c = s.nextInt();
		delta = (Math.pow(b, 2)) - (4 * (a) * (c));
		x1 = ((-b) + (Math.sqrt(delta))) / (2 * a);
		x2 = ((-b) - (Math.sqrt(delta))) / (2 * a);
		System.out.println("Valor de Delta �: " + delta);
		System.out.println("Valor de x' �:" + x1);
		System.out.println("Valor de x'' �: " + x2 + "\n");

		System.out.println("Digite uma Op��o");
		System.out.println("1 - Realizar nova Multiplica��o");
		System.out.println("2 - Voltar ");
		System.out.println("0 - Sair");
		input = s.nextInt();

		switch (input) {
		case 1:
			Bhaskara bhas = new Bhaskara();
			bhas.Calcula();
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
