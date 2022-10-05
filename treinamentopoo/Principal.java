package br.com.voeairlines.treinamentopoo;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Professor digite de 1 a 26 da lista 01");
		int op = sc.nextInt();

		switch (op) {
		case 1:
			System.out.println(new Algoritmo01().imprimirMensagem());
			break;
		case 2:
			sc.nextLine();
			System.out.println("digite seu nome: ");
			String nome = sc.nextLine();
			System.out.println("Você digitou: " + new Algoritmo02().nome(nome));
			break;
		case 3:
			System.out.println(new Algoritmo03().produto());
			break;
		case 4:
			System.out.println(new Algoritmo04().media());
			break;
		case 5:
			sc.nextLine();
			System.out.println("digite um número inteiro: ");
			int r = sc.nextInt();
			System.out.println("Você digitou: " + new Algoritmo05().numero(r));
			break;
		case 6:
			sc.nextLine();
			System.out.println("digite um número inteiro: ");
			int seisa = sc.nextInt();
			System.out.println("digite outro número inteiro: ");
			int seisb = sc.nextInt();
			Algoritmo06 result06 = new Algoritmo06(seisa, seisb);
			System.out.println(result06);
			break;
		case 7:
			sc.nextLine();
			System.out.println("digite um número inteiro: ");
			int a = sc.nextInt();
			System.out.println("Você digitou: " + new Algoritmo07().num(a));
			System.out.println("O sucessor é:  " + new Algoritmo07().num(a + 1));
			System.out.println("O antecessor é: " + new Algoritmo07().num(a - 1));
			break;
		case 8:
			sc.nextLine();
			System.out.println("digite seu nome: ");
			String nom = sc.nextLine();
			System.out.println("digite seu endereco: ");
			String end = sc.nextLine();
			System.out.println("digite seu telefone: ");
			String tel = sc.nextLine();
			Algoritmo08 result = new Algoritmo08(nom, end, tel);
			System.out.println(result);
			break;
		case 9:
			sc.nextLine();
			System.out.println("digite um número inteiro: ");
			int novea = sc.nextInt();
			System.out.println("digite outro número inteiro: ");
			int noveb = sc.nextInt();
			System.out.println("Soma: " + new Algoritmo09().somaDoisNumeros(novea, noveb));

			break;
		case 10:
			sc.nextLine();
			System.out.println("digite um número inteiro: ");
			int dez = sc.nextInt();
			System.out.println("digite outro número inteiro: ");
			int deza = sc.nextInt();
			System.out.println("O produto é: " + new Algoritmo10().produtoDoisNumeros(dez, deza));
			break;
		case 11:
			sc.nextLine();
			System.out.println("digite um número : ");
			double onze = sc.nextDouble();
			System.out.println("a terça parte de " + onze + " é: " + new Algoritmo11().terco(onze));
			break;
		case 12:
			sc.nextLine();
			System.out.println("digite um número: ");
			double dozea = sc.nextDouble();
			System.out.println("digite outro número: ");
			double dozeb = sc.nextDouble();
			System.out.println("A media é: " + new Algoritmo12().media(dozea, dozeb));
			break;
		case 13:
			sc.nextLine();
			System.out.println("------- Média ponderada de 4 números -------");
			System.out.println("digite um número: ");
			double trezea = sc.nextDouble();
			System.out.println("digite um número: ");
			double trezeb = sc.nextDouble();
			System.out.println("digite um número: ");
			double trezec = sc.nextDouble();
			System.out.println("digite um número: ");
			double trezed = sc.nextDouble();
			System.out.println("A media ponderada é: " + new Algoritmo13().mediap(trezea, trezeb, trezec, trezed));
			break;
		case 14:
			sc.nextLine();
			System.out.println("Entre com o saldo: ");
			double quatorze = sc.nextDouble();
			System.out.println("O saldo reajustado é de: " + new Algoritmo14().saldo(quatorze));
			break;
		case 15:
			sc.nextLine();
			System.out.println("Entre com o salário mínimo: ");
			double quinzea = sc.nextDouble();
			System.out.println("Entre com a qtde de Kw: ");
			double quinzeb = sc.nextDouble();
			Algoritmo15 algo = new Algoritmo15();
			System.out.println("Valor em reais de cada quilowatt: " + algo.calculaKw(quinzea, quinzeb));
			System.out.println("Valor em reais a ser pago: " + algo.valorAPagar(quinzea, quinzeb));
			
			break;
		case 16:
			sc.nextLine();
			System.out.println("Entre com um nome com mais de 5 letras: ");
			String palavra = sc.nextLine();
			Algoritmo16 letra = new Algoritmo16();
			System.out.println("O nome digitado foi: " + letra.nome(palavra));
			System.out.println("primeiro caracter: " + letra.primeiraLetra(palavra));
			System.out.println("Último caracter: " + letra.ultimaLetra(palavra));
			System.out.println("Do primeiro ao terceiro caracter: " + letra.primeiroTerceiro(palavra));
			System.out.println("Quarto caracter: " + letra.quartaLetra(palavra));
			System.out.println("Menos o primeiro caracter: " + letra.menosPrimeira(palavra));
			System.out.println("os dois últimos caracters: " + letra.doisUltimos(palavra));
			break;
		case 17:
			sc.nextLine();
			System.out.println("Entre com a base do retângulo: ");
			double base = sc.nextDouble();
			System.out.println("Entre com a altura do retângulo: ");
			double altura = sc.nextDouble();
			Algoritmo17 retangulo = new Algoritmo17();
			System.out.println("Perímetro: " + retangulo.perimetro(base, altura));
			System.out.println("Área: " + retangulo.area(base, altura));
			System.out.println("Diagonal: " + retangulo.diagonal(base, altura));
			break;
		case 18:
			sc.nextLine();
			System.out.println("Entre com o raio do círculo: ");
			double raio = sc.nextDouble();
			Algoritmo18 circulo = new Algoritmo18();
			System.out.println("Perímetro: " + circulo.perimetro(raio));
			System.out.println("Área: " + circulo.area(raio));
			break;
		case 19:
			sc.nextLine();
			System.out.println("Entre com o lado do quadrado: ");
			double lado = sc.nextDouble();
			Algoritmo19 quadrado = new Algoritmo19();
			System.out.println("Perímetro: " + quadrado.perimetro(lado));
			System.out.println("Área: " + quadrado.area(lado));
			System.out.println("Diagonal: " + quadrado.diagonal(lado));
			break;
		case 20:
			sc.nextLine();
			System.out.println("Entre com o 1º valor do paralelepipedo: ");
			double lado1 = sc.nextDouble();
			System.out.println("Entre com o 2º valor do paralelepipedo: ");
			double lado2 = sc.nextDouble();
			System.out.println("Entre com o 3º valor do paralelepipedo: ");
			double lado3 = sc.nextDouble();
			Algoritmo20 paralelepipedo = new Algoritmo20();
			System.out.println("A diagonal do paralelepipedo é: " + paralelepipedo.diagonal(lado1, lado2, lado3));
			break;
		case 21:
			sc.nextLine();
			System.out.println("Entre com o valor da base do triângulo: ");
			double basetri = sc.nextDouble();
			System.out.println("Entre com o valor da altura do triângulo: ");
			double alturatri = sc.nextDouble();
			Algoritmo21 triangulo = new Algoritmo21();
			System.out.println("A área do triangulo é: " + triangulo.area(basetri, alturatri));
			break;
		case 22:
			sc.nextLine();
			System.out.println("Entre com o valor da base do losango: ");
			double baselosangulo = sc.nextDouble();
			System.out.println("Entre com o valor da altura do losango: ");
			double alturalosangulo = sc.nextDouble();
			Algoritmo21 losango = new Algoritmo21();
			System.out.println("A área do losango é: " + losango.area(baselosangulo, alturalosangulo));
			break;
		case 23:
			sc.nextLine();
			System.out.println("Digite o nome: ");
			String n = sc.nextLine();
			System.out.println("Digite a idade: ");
			int i = sc.nextInt();
			Algoritmo23 nomes = new Algoritmo23();
			System.out.println("Nome: " + nomes.nome(n));
			System.out.println("Idade: " + nomes.idade(i));
			
			break;
		case 24:
			sc.nextLine();
			System.out.println("Entre com a temperatura em Celsius: ");
			double celsius = sc.nextDouble();
			Algoritmo24 converte = new Algoritmo24();
			System.out.println(converte.celsius(celsius)+" graus Celsius é igual a " + converte.fahrenheit(celsius) + " Fahrenheit");
			break;
		case 25:
			sc.nextLine();
			System.out.println("Entre com o raio da lata: ");
			double raioLata = sc.nextDouble();
			System.out.println("Entre com o altura da lata: ");
			double alturaLata = sc.nextDouble();
			Algoritmo25 lata = new Algoritmo25();
			System.out.println("O volume da lata de óleo é: " + lata.volume(raioLata, alturaLata));
			break;
		case 26:
			sc.nextLine();
			System.out.println("Entre com o valor da prestação: ");
			double valor = sc.nextDouble();
			System.out.println("Entre com a taxa de juros: ");
			double taxa = sc.nextDouble();
			System.out.println("Entre com com a Qtde de dias em atraso: ");
			double dias = sc.nextDouble();
			Algoritmo26 prestacao = new Algoritmo26();
			System.out.println("O valor da prestação em atraso é de: " + prestacao.calculo(valor, taxa, dias));
			break;
		default:
			break;
		}
		sc.close();

	}

}
