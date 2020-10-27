/*
 * Projeto para sistema de gest�o escolar. 
 * Marcos F. Souza de Oliveira  * 
 * CLASSE RESPONSÁVEL PELA CONEXÃO AO BANCO DE DADOS.
 */
package Dados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Administrador
 */
public class Conectar {

    private static Connection conecta=null;

    public static Connection conectar() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException cnfe) {
            System.out.println("Erro de classe não encontrada. CLASSE.: Conectar.conectar()"+cnfe.getMessage());
        }
        try {
            conecta = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/quim", "root", "19twostars");
            System.out.println("Conexão estabelecida");
        } catch (SQLException sqle) {
            System.out.println("Driver não encontrado/funcionando -> Conectar.conectar()"+sqle.getMessage());
        }
        return conecta;
    }
}
