package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.SenhaService;


public class PainelServlet extends HttpServlet {

	SenhaService senhaService;
	
	private static final long serialVersionUID = 1L;
       
    public PainelServlet() {
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

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		

	}

}
