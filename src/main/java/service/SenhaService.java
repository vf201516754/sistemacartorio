package service;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import entity.Senha;

public class SenhaService {
	
	public Senha senha;
	static List<Senha> lista = new ArrayList<>();
	
	public void incluirNaFila(Senha senha) {
		lista.add(senha);
	}
	
	public List<Senha> getTodasSenhas(){
		return lista;
	}
	
	public Senha retiraDaFila(int indice) {
		lista.remove(indice);
		return senha;
	}
	
    public String gerarNovaSenha(String servico, String tipo, String senhaAnterior) {
    	    	
    	//numero senha
        int numero = Integer.parseInt(senhaAnterior);
        numero++;
        String novoNumero = Integer.toString(numero);
        String siglaTipoServico = servico.substring(0, 3);
        String numeroSenha = siglaTipoServico + novoNumero;
   
        return numeroSenha;
        
    }
    
    public static String prevIniAtendimento(Senha senha) {
    	String tempo = senha.getPrevIniAtendimento();
    	
    	
    	return null;
    }
    
    public String horaCadastro() {
    	//hora cadastro
        SimpleDateFormat horaformatada = new SimpleDateFormat("HH:mm:ss");
        Calendar cal = new GregorianCalendar(); 
        String horaCadastro = horaformatada.format(cal.getTime());
        return horaCadastro;
    }
    
    

}

