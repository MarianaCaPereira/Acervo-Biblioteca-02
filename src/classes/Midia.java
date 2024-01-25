/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author marip
 */
public class Midia extends Geral{
    
    private String tipo;  //fitas VHS, CDs e DVDs

    //Construtores
    public Midia() {
       
    }

    public Midia(String tipo, String[] autor, String titulo, int edicao, String cidade, String editora, int ano, String CDU, int quantidade, String assunto, String palavra1, String palavra2, String tamanho, int id) {
        super(autor, titulo, edicao, cidade, editora, ano, CDU, quantidade, assunto, palavra1, palavra2, tamanho, id);
        this.tipo = tipo;
    }

    //GET
    public String getTipo() {
        return tipo;
    }

    //SET
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    @Override
    public String toString() {
        String ret = "--------------------------------------------------------------------------------------------\n\n";
        ret += "Tipo: " + getTipo() + "\n";
        ret += "Autores: ";
        for (String autores : autor) {
            ret += autores + "/ ";
        }
        ret += "\n";
        ret += getTitulo() + " - " + getEdicao() + "° Edicao - " + getCidade() + ": " + getEditora() + ", " + getAno() + ".\n";
        ret += getTamanho() + " cm. \n\n"; 
        
        ret += "1." + getAssunto() + ". I. " + getPalavra1() + ". II. " + getPalavra2() + "\n\n";
        ret += "                                                                    CDU: " + getCDU() + "\n";
        ret += "--------------------------------------------------------------------------------------------\n\n";

        return ret;
    }
    
}
