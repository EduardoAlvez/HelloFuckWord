package HelloZe;

public class EduardoAlves {
	public static void main(String[] args) {
		//variaveis;
		EduardoAlves pessoa = new EduardoAlves();
		int num1,num2,num3;
		
		num1 = 10;
		num2 = 20;		
		num3 = pessoa.soma(num1, num2);
	}

	private  int soma(int num1, int num2) {
		int numSoma = num1 + num2;
		return numSoma;
		
	}

}
