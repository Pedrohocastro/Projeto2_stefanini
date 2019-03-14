package com.stefanini.treinamento.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.stefanini.treinamento.entidades.Cachorro;

/**
 * Servlet implementation class CachorroServlet
 */
@WebServlet("/cachorroservlet")
public class CachorroServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CachorroServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter writer = response.getWriter();
		
		writer.println("<html><body>");
		List<Cachorro> listaCachorro = Cachorro.getListaCachorros();
		writer.println("Bem vindo ao servlet do Cachorro");
		writer.println("<ul>");
		
		for (Cachorro cachorro : listaCachorro) {
			writer.println("<li>" + cachorro.toString());
		}
		writer.println("</ul>");
		writer.println("</body></html>");
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
