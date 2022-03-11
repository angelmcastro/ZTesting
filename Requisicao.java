package br.com.ZTesting;

public class Requisicao extends Pergunta {	
	
	void rodaOuNao() {
		Requisicao p = new Requisicao();
		
		p.escolhaMarcaProcessador();
		p.escolhaPlacaDeVideo();
		p.escolhaMemoriaRam();
		
		//Funciona
		if(p.getE() >= 2 && p.getV() >= 2 && p.getM() >= 4) {
			System.out.println("                      Hora de jogar!!!! :)                        ");
			System.out.println("          Seu computador comporta o jogo Valorant!!!              ");
		}
		//N�o funciona por causa do processador
		else if(p.getE() < 2 && p.getV() >= 2 && p.getM() >= 4) {
			System.out.println("                       Game Over :(                               ");
			System.out.println("Sua placa de v�deo e memoria Ram s�o suficientes, "
					+ "mas seu processador est� abaixo do m�nimo exigido pelo Valorant.");			
		}
		//N�o funciona por causa da Placa de V�deo
		else if(p.getE() >= 2 && p.getV() < 2 && p.getM() >= 4) {
			System.out.println("Game Over :(");
			System.out.println("Seu processador e memoria Ram s�o suficientes, "
					+ "mas sua placa de v�deo est� abaixo do m�nimo exigido pelo Valorant.");
		}
		//N�o funciona por causa da memoria RAM
		else if(p.getE() >= 2 && p.getV() >= 2 && p.getM() < 4) {
			System.out.println("Game Over :(");
			System.out.println("Seu processador e placa de v�deo s�o suficientes, "
					+ "mas sua memoria Ram est� abaixo do m�nimo exigido pelo Valorant.");		
		}
		//N�o funcina por causa do processador e placa de video
		else if(p.getE() < 2 && p.getV() < 2 && p.getM() >= 4) {
			System.out.println("Game Over :(");
			System.out.println("Sua memoria Ram � suficiente, "
					+ "mas seu processador e placa de v�deo est�o abaixo do m�nimo exigido pelo Valorant.");			
		}
		//N�o funcina por causa do processador e memoria RAM
		else if(p.getE() < 2 && p.getV() >= 2 && p.getM() < 4) {
			System.out.println("Game Over :(");
			System.out.println("Sua placa de v�deo � suficiente, "
					+ "mas seu processador e memoria Ram est�o abaixo do m�nimo exigido pelo Valorant.");			
		}
		//N�o funcina por causa da placa de video e memoria RAM
		else if(p.getE() >= 2 && p.getV() < 2 && p.getM() < 4) {
			System.out.println("Game Over :(");
			System.out.println("Sua placa de v�deo � suficiente, "
					+ "mas seu processador e memoria Ram est�o abaixo do m�nimo exigido pelo Valorant.");			
		}
		else {
			System.out.println("Game Over :(");
			System.out.println("Seu computador n�o cumpre nenhum dos requisitos de Valorant");
		}
	}
}
