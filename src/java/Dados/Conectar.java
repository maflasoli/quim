/*
 * Projeto para sistema de gest�o escolar. 
 * Marcos F. Souza de Oliveira  * 
 */
package Dados;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Administrador
 */
public class Conectar {

    private Connection conecta;
    private PreparedStatement ps;
    private ResultSet rs;

    public Conectar() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException cnfe) {
            System.out.println("Classe não encontrada -> Conectar."+cnfe.getMessage());
        }
        try {
            conecta = (Connection) DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/quim", "root", "19twostars");
            System.out.println("Conexão estabelecida");
        } catch (SQLException sqle) {
            System.out.println("Driver não encontrado/funcionando -> Conectar."+sqle.getMessage());
        }finally{
            if(conecta !=null){
                try{
                    conecta.close();
                    System.out.println("Conexão terminada");
                }catch(SQLException e){
                    System.out.println("Conexão não conseguiu terminar");
                }
            }
        }
    }

    public void cadAluno(String rgaluno, String nomaluno, String endaluno, String telaluno ,String fotaluno) {
        try {
            ps = (PreparedStatement) conecta.prepareStatement("INSERT INTO aluno(rgaluno,nomaluno,endaluno,,telaluno,fotaluno) VALUES (" + rgaluno + ",'" + nomaluno + "','" + endaluno + "','"+telaluno+"','" + fotaluno + "')");
            ps.executeUpdate();
            ps.close();
        } catch (SQLException sqle) {
            System.out.println("Erro ao inserir na tabela de aluno -> conexao.cadAluno"+sqle.getMessage());
        }
    }
//
//    public ResultSet listaAluno() {
//        //conexao con = new conexao();
//        ResultSet lista = null;
//        try {
//            PreparedStatement ps = conecta.prepareStatement("select * from testealuno");
//            lista = ps.executeQuery();
//            //lista.close();
//            //conecta.close();
//        } catch (SQLException sqle) {
//            System.out.println("Deu pau... listaAluno");
//        }
//        return lista;
//    }
}
