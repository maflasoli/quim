/*
 * Projeto para sistema de gest�o escolar. 
 * Marcos F. Souza de Oliveira  * 
 */
package Servlets;

import Classes.Aluno;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Dados.conectarAluno;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Administrador
 */
@WebServlet(name = "listaAluno", urlPatterns = {"/listaAluno"})
public class listaAluno extends HttpServlet {

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
            
            conectarAluno conecta = new conectarAluno();
            Aluno aluno = new Aluno();
            int id=0;
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet listaAluno</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet listaAluno at " + request.getContextPath() + "</h1>");
            
            ArrayList<Aluno> lista = new ArrayList<Aluno>();
            lista = (ArrayList<Aluno>) conecta.listarAlunos();

            out.println("<table border=1>");
            out.println("<thead>");
            out.println("<tr>");
            out.println("<th>ID</th>");
            out.println("<th>RG</th>");
            out.println("<th>Nome</th>");
            out.println("<th>Endereço</th>");
            out.println("<th>Telefone</th>");
            out.println("<th>Foto</th>");
            out.println("<th colspan=2>Ações</th>");
            out.println("</tr>");
            out.println("</thead>");
            out.println("<tbody>");
         for(int i=0; i<lista.size();i++){
                                     
                out.println("<tr>");

                    out.println("<td>"+lista.get(i).getId()+"</td>");
                    out.println("<td>"+lista.get(i).getRg()+"</td>");
                    out.println("<td>"+lista.get(i).getNome()+"</td>");
                    out.println("<td>"+lista.get(i).getEndereco()+"</td>");
                    out.println("<td>"+lista.get(i).getTelefone()+"</td>");
                    out.println("<td>"+lista.get(i).getFoto()+"</td>");

                    out.println("<td> <a href='"+conecta.excluirAluno(lista.get(i).getId())+"'>Excluir</a></td>");
                    
//                    out.println("<td><a href="UserController?action=delete&userId=<c:out value="${user.userid}"/>">Delete</a></td>");
                out.println("</tr>");
        }
        out.println("</tbody>");

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
