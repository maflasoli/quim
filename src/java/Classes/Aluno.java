/*
 * Projeto para sistema de gest�o escolar. 
 * Marcos F. Souza de Oliveira  * 
 */
package Classes;

import Dados.Conectar;
import java.util.ArrayList;

/**
 *
 * @author Administrador
 */
public class Aluno {
    
    private int id;
    private String rg;
    private String nome;
    private String endereco;
    private String telefone;
    private String foto;
    
    public Aluno() {
        this.rg="";
        this.nome="";
        this.endereco="";
        this.telefone="";
        this.foto="";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }
    
    public void salvar(){
        Conectar conecta = new Conectar();
//        conecta.cadAluno(rg, nome, endereco, telefone, foto);
    }
    public ArrayList<Aluno> listar(){
        
        ArrayList lista=new ArrayList();
        
        //TODO implementação da função encarregada de listar os alunos cadastrados.
        
        return lista;
    }
    
}
