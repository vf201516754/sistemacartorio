package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.Senha;
import service.SenhaService;

@WebServlet("/Senha")
public class SenhaServlet extends HttpServlet {
	
	SenhaService senhaService;
	
	private static final long serialVersionUID = 1L;
       
    public SenhaServlet() {
        System.out.println("Construindo Servlet...");
    }
    
    public void init() throws ServletException {
    	senhaService = new SenhaService();
    	System.out.println("Inicializando Servlet");
    	super.init();
    }
    
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	System.out.println("Chamando o service...");
    	super.service(request, response);
    }

    @Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	RequestDispatcher dispatcher = request.getRequestDispatcher("painel.jsp");
		request.setAttribute("lista", senhaService.getTodasSenhas());
		dispatcher.forward(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		String servico = request.getParameter("servico");
		String tipo = request.getParameter("tipoRadios");
		
		String numeroSenha = (String) senhaService.gerarNovaSenha(servico, tipo, "4");
		String horaCadastro = (String) senhaService.horaCadastro();
		Senha senha = new Senha();
		senha.setServico(servico);
		senha.setTipo(tipo);
		senha.setHoraCadastro(horaCadastro);
		senha.setNumeroSenha(numeroSenha);
		
		
		senhaService.incluirNaFila(senha);
		
		RequestDispatcher dispatcher= request.getRequestDispatcher("painel.jsp");
		request.setAttribute("lista", senhaService.getTodasSenhas());
		dispatcher.forward(request, response);
		
		
	}

}
