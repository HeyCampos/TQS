import java.util.Scanner;

public class Informacoes {

	public void Descricao() {
		// TODO Auto-generated method stub
		int input;

		System.out.println("***************** INFORMA��ES **************\n");
		System.out.println("Aluno: Ivan Cassiano Campos");
		System.out.println("Matr�cula: 1301840");
		System.out.println("Disciplina: Testes e Qualidade de Software");
		System.out.println("\n \n");
		
		Scanner s = new Scanner(System.in);
		System.out.println("Digite uma Op��o");
		System.out.println("1 - Voltar ao menu inicial ");
		System.out.println("0 - Sair");
		input = s.nextInt();

		switch (input) {
		case 1:
			Opcoes.main(null);
			break;
		case 0:
			System.out.println("Tchau!!");
			System.exit(0);
			break;
		default:
			System.out.println("Essa n�o � uma Op��o V�lida! Tchau");
			break;
		}

	}

}
