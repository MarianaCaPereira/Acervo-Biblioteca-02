/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author marip
 */
public class Livro extends Geral{
    
    private int paginas;
    private String ISBN; //13 digitos

    //Construtores
    public Livro() {
    }

    //GET
    public Livro(int paginas, String ISBN) {
        this.paginas = paginas;
        this.ISBN = ISBN;
    }

    public int getPaginas() {
        return paginas;
    }

    public String getISBN() {
        return ISBN;
    }
    
    //SET
    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }
    
    @Override
    public String toString() {
        String ret = "--------------------------------------------------------------------------------------------\n\n";
        ret += "Autores: ";
        for (String autores : autor) {
            ret += autores + "/ ";
        }
        ret += "\n";
        ret += getTitulo() + " - " + getEdicao() + "° Edicao - " + getCidade() + ": " + getEditora() + ", " + getAno() + ".\n";
        ret += paginas + " Pag. : " + getTamanho() + " cm. \n\n"; 
        ret += "ISBN: " + ISBN + "\n";
        ret += "1." + getAssunto() + ". I. " + getPalavra1() + ". II. " + getPalavra2() + "\n\n";
        ret += "                                                                    CDU: " + getCDU() + "\n";
        ret += "--------------------------------------------------------------------------------------------\n\n";

        return ret;
    }
    
}
