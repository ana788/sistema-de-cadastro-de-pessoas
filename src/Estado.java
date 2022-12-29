
import java.io.Serializable;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author cg3004376
 */
public class Estado implements Serializable {
    private String nome;
    private String sigla;
    
    public Estado(String n, String s){
        this.nome = n;
        this.sigla = s;
    }

    public String getNome() {
        return nome;
    }
    
     public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }
    
}
