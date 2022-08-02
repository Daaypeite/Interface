package com.exemplo.inter;

public interface Eletrodomestico {
	//descrever dois metodos void
	void ligar();
	void desligar();
	
	//descrever um novo metodo
	default void acionarTimer(int minutos) {
		//um tempo para aguardar a qtde de minutos informados
		try{
			Thread.sleep(minutos * 1000);
		}catch(Exception e) {}
		
		//chamar o metodo desligar();
		desligar();
	}

}

/*static void ligarTudo(Eletrodomestico...  eletroArray){
	//for para percorrer os elementos
	for (Eletrodomestico eletro : eletroArray){
		eletro.ligar(); */