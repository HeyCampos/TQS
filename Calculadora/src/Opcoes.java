/*import java.util.Scanner;

public class Opcoes {

	public static  void main(String[] Args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		int input;
		System.out.println("****************  MENU  ****************\n");
		System.out.println("Selecione Uma das Op��es");
		System.out.println("1 - Realizar Soma");
		System.out.println("2 - Realizar Subtra��o");
		System.out.println("3 - Realizar Multiplica��o");
		System.out.println("4 - Realizar Divis�o");
		System.out.println("5 - Realizar Potencia��o");
		System.out.println("6 - Realizar Raiz");
		System.out.println("7 - Realizar Bhaskara");
		System.out.println("8 - Informa��es");
		System.out.println("0 - Sair");

		input = s.nextInt();

		switch (input) {
		case 1:
			Soma sum = new Soma();
			sum.Calcula(input, input);
			break;
		case 2:
			Subtracao sub = new Subtracao();
			sub.Calcula();
			break;
		case 3:
			Multiplicacao mult = new Multiplicacao();
			mult.Calcula();
			break;
		case 4:
			Divisao div = new Divisao();
			div.Calcula();
			break;
		case 5:
			Potenciacao pot = new Potenciacao();
			pot.Calcula();
			break;
		case 6:
			Raiz raiz = new Raiz();
			raiz.Calcula();
			break;
		case 7:
			Bhaskara bhas = new Bhaskara();
			bhas.Calcula();
			break;
		case 8:
			Informacoes inf = new Informacoes();
			inf.Descricao();
			break;
		case 0:
			System.out.println("Voc� Saiu");
			System.exit(0);
		default:
			System.out.println("Essa n�o � uma Op��o V�lida!");
			Opcoes.main(null);
			break;
		}
		
	}

}
*/