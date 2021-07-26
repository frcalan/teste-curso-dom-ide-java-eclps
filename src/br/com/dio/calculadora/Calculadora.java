package br.com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Double a, b;
		System.out.println("Calculadora\n---------- ");
		System.out.println("Primeiro valor: ");
		a = scan.nextDouble();
		System.out.println("Segundo valor: ");
		b = scan.nextDouble();

		Double soma = soma(a, b);
		Double sub = subtracao(a, b);
		Double mult = multiplicacao(a, b);
		Double div = divisao(a, b);

		System.out.println("Resultados\n---------- ");
		System.out.println("Soma: " + soma);
		System.out.println("Subtração: " + sub);
		System.out.println("Multiplicação: " + mult);
		System.out.println("Divisão: " + div);
	}

	public static Double soma(Double a, Double b) {
		return a + b;
	}

	public static Double subtracao(Double a, Double b) {
		return a - b;
	}

	public static Double multiplicacao(Double a, Double b) {
		return a * b;

	}

	public static Double divisao(Double a, Double b) {
		return a / b;
	}
}
