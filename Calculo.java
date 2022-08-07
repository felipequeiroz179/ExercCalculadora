package Calculadora;
import java.util.Scanner;

public class Calculo {

	public static void main(String[] args) {
	Scanner in = new Scanner (System.in);	
		Calculadora Calculo = new Calculadora();
		double numeroA,numeroB;
		
		System.out.println("Digite o primeiro valor:");
		numeroA = in.nextDouble();
		
		System.out.println("Digite o segundo valor1:");
		numeroB = in.nextDouble();
		
		Calculo.numeroA = numeroA;
		Calculo.numeroB = numeroB;
		Calculo.adicao();
		Calculo.subtracao();
		Calculo.multiplicacao();
		Calculo.divisao();
		
		System.out.println(Calculo.numeroA+" + "+Calculo.numeroB+" = "+Calculo.adicao);
		System.out.println(Calculo.numeroA+" - "+Calculo.numeroB+" = "+Calculo.subtracao);
		System.out.println(Calculo.numeroA+" x "+Calculo.numeroB+" = "+Calculo.multiplicacao);
		System.out.println(Calculo.numeroA+" / "+Calculo.numeroB+" = "+Calculo.divisao);

	}

}
