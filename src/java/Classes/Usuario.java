/*
 * Projeto para sistema de gest�o escolar. 
 * Marcos F. Souza de Oliveira  * 
 Inicio - 02/12/2020

CLASSE COM ATRIBUTOS DO USUÁRIO.

 */

package Classes;

/**
 *
 * @author Administrador
 */
public class Usuario {
    
    private int id;
    private String datacadastro;
    private String nome;
    private int nivel;
    private String tipo;
    
    public Usuario(){
    
        this.nome="";
        this.nivel=0;
        this.tipo="";
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDatacadastro() {
        return datacadastro;
    }

    public void setDatacadastro(String datacadastro) {
        this.datacadastro = datacadastro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
    
}
