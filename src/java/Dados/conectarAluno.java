/*
 * Projeto para sistema de gest�o escolar. 
 * Marcos F. Souza de Oliveira  * 
    
CLASSE RESPONSÁVEL PELAS AÇÕES DENTRO DO BANCO DE DADOS.

 */
package Dados;

import Classes.Aluno;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Administrador
 */
public class conectarAluno {

    private Connection conexao = null;

    public conectarAluno() {
        conexao = Conectar.conectar();
    }

    //CLASSE-FUNÇÃO RESPONSÁVEL PELO CADASTRO(INSERÇÃO) DO ALUNO.
    public void cadAluno(Aluno aluno) {
        try {
            PreparedStatement ps = conexao.prepareStatement("insert into aluno(rgaluno,nomaluno,endaluno,telaluno,fotaluno) values('" + aluno.getRg() + "','" + aluno.getNome() + "','" + aluno.getEndereco() + "','" + aluno.getTelefone() + "','" + aluno.getFoto() + "');");
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Erro no cadastro do aluno. CLASSE.: conectarAluno.cadAluno()" + e.getMessage());
        }
    }

    //CLASSE-FUNÇÃO RESPONSÁVEL PELA EXCLUSÃO DO ALUNO
    public void excluirAluno(int idAluno) {
        try {
            PreparedStatement pS = conexao.prepareStatement("delete from aluno where userid=" + idAluno);
            pS.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Erro na exclusão do aluno. CLASSE.: conectarAluno.excluirAluno()" + e.getMessage());
        }
    }

    //CLASSE-FUNÇÃO RESPONSÁVEL POR LISTAR TODOS OS ALUNOS.
    public List<Aluno> listarAlunos() {
        ArrayList<Aluno> listaDeAluno = new ArrayList<>();
        try {
            Statement stmt = conexao.createStatement();
            ResultSet rs = stmt.executeQuery("select * from aluno");
            while (rs.next()) {
                Aluno aluno = new Aluno();
                aluno.setId(rs.getInt("idaluno"));
                aluno.setRg(rs.getString("rgaluno"));
                aluno.setNome(rs.getString("nomaluno"));
                aluno.setEndereco(rs.getString("endaluno"));
                aluno.setTelefone(rs.getString("telaluno"));
                aluno.setFoto(rs.getString("fotaluno"));
                listaDeAluno.add(aluno);
            }
        } catch (SQLException e) {
            System.out.println("Erro na listagem dos alunos. CLASSE.: conectarAluno.listarAlunos()" + e.getMessage());
        }
        return listaDeAluno;
    }

    //CLASSE-FUNÇÃO RESPONSÁVEL EM EXIBIR O ALUNO A PARTIR DO ID.
    public List<Aluno> exibeAluno(int id) {
        ArrayList<Aluno> listaAluno = new ArrayList<>();
        try {
            Statement stmt = conexao.createStatement();
            ResultSet rs = stmt.executeQuery("select * from aluno where idaluno=" + id);
            while (rs.next()) {
                Aluno aluno = new Aluno();
                aluno.setId(rs.getInt("idaluno"));
                aluno.setRg(rs.getString("rgaluno"));
                aluno.setNome(rs.getString("nomaluno"));
                aluno.setEndereco(rs.getString("endaluno"));
                aluno.setTelefone(rs.getString("telaluno"));
                aluno.setFoto(rs.getString("fotaluno"));
                listaAluno.add(aluno);
            }
        } catch (SQLException e) {
            System.out.println("Erro na listagem dos alunos. CLASSE.: conectarAluno.exibeAluno()" + e.getMessage());
        }
        return listaAluno;
    }
}
