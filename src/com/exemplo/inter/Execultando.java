package com.exemplo.inter;

public class Execultando {
	// criando o metodo principal
	public static void main(String[] args) {

		// instanciar a classe Televisao()
		Eletrodomestico tv = new Televisao();

		// fazer o uso do objeto
		tv.ligar();
		tv.acionarTimer(4);

	}
}
/*
 * Eletrodomestico aparelho;
 * 
 * aparelho = new Geladeira(); aparelho.ligar();
 * 
 * aparelho = new Televisao(); aparelho.ligar();
 * 
 * aparelho = new Microondas(); aparelho.ligar();
 * 
 * }
 */

/*
 * //definir variaveis Eletrodomestico a, b, c, d, e, f, g;
 * 
 * //instanciando classes a = new Geladeira(); b = new Televisao(); c = new
 * Televisao(); d = new Geladeira(); e = new Microondas(); f = new Televisao();
 * g = new Microondas();
 * 
 * //chamar o metodo ligarTudo() Eletrodomestico.ligarTudo(a, b, c, d, e, f, g);
 * 
 * }
 */