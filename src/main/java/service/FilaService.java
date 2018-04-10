package service;

import entity.Fila;
import entity.Senha;

public class FilaService {
	
	public Fila filaPreferencial;
	public Fila filaNormal;
	public Fila filaEspecial;
	
	// método para criar a fila de cada servico
	public void criarFilas(String tipoDeServico) {
		
		filaPreferencial = new Fila(tipoDeServico);
		filaNormal = new Fila(tipoDeServico);
		filaEspecial = new Fila(tipoDeServico);
		
	}
	
	//método pega a senha gerada e coloca na fila de acordo com o tipo. Os servicos são subdivididos em tipos de filas (preferencial, normal, especial)
	public void colocaSenhaNaFila(String servico, String tipo, String senhaAnterior) {
		SenhaService novaSenha = new SenhaService();
		Senha senha = new Senha();
		senha = novaSenha.gerarNovaSenha(servico, tipo, senhaAnterior);

		if (tipo.equals("preferencial")) {
			System.out.println("Fila Preferencial");
			filaPreferencial.enfileirar(senha);
			filaPreferencial.exibeFila();
		} 
		else if (tipo.equals("normal")) {
			System.out.println("Fila Normal");
			filaNormal.enfileirar(senha);
			filaNormal.exibeFila();
		} else {
			System.out.println("Fila Especial");
			filaEspecial.enfileirar(senha);
			filaEspecial.exibeFila();
		}
	}
	
	public void removeSenhaDaFila(Fila fila, String tipoDaFila) {
		
		if(fila.getTipo().equals(tipoDaFila)) {
			Senha senha = new Senha();
			if(filaPreferencial.cheia() == false) {
				System.out.println("Fila Preferencial");
				senha = filaPreferencial.desenfileirar();
				filaPreferencial.exibeFila();
			}
			
			else if (filaEspecial.cheia() == false) {
				System.out.println("Fila Especiail");
				filaEspecial.enfileirar(senha);
				filaEspecial.exibeFila();
			}
			
			else {
				System.out.println("Fila Normal");
				filaNormal.enfileirar(senha);
				filaNormal.exibeFila();
			}
		}

	}
}
