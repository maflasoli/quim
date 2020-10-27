/*
 * Projeto para sistema de gest�o escolar. 
 * Marcos F. Souza de Oliveira  * 
 *
 *SERVLET PARA O CADASTRO DO ALUNO.
 *
 */
package Servlets;

import Classes.Aluno;
import Dados.conectarAluno;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Administrador
 */



@WebServlet(name = "CadAluno", urlPatterns = {"/CadAluno"})
public class CadAluno extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            
            Aluno aluno = new Aluno();
            conectarAluno conectaaluno= new conectarAluno();
            
            aluno.setRg(request.getParameter("txtRgAluno"));
            aluno.setNome(request.getParameter("txtNomAluno"));
            aluno.setEndereco(request.getParameter("txtEndAluno"));
            aluno.setTelefone(request.getParameter("txtTelAluno"));
            aluno.setFoto(request.getParameter("txt"));
           
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet CadAluno</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet CadAluno at " + request.getContextPath() + "</h1>");
            
            conectaaluno.cadAluno(aluno);
            
            out.println(aluno.getRg()+"<br>");
            out.println(aluno.getNome()+"<br>");
            out.println(aluno.getEndereco()+"<br>");
            out.println(aluno.getTelefone()+"<br>");
            out.println(aluno.getFoto());
            
            out.println("<a href='listaAluno'> Listar </a>");
                        
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
