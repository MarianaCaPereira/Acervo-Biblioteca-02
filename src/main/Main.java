/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import classes.Cartaz;
import classes.Geral;
import classes.Livro;
import classes.Mapa;
import classes.Midia;
import classes.Periodico;
import classes.Relatorio;
import classes.TCC;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author marip
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    private static void emprestarItens(ArrayList<Geral> listaItem, int id){
        
        for (Geral geral : listaItem) {
            
            if(geral.getId() == id){ //Procurando o ID do item para emprestar        
               
                if(geral.getQuantidade() > 0){  //Verificando se esta disponivel
                    
                    geral.setQuantidade(geral.getQuantidade()-1);  //Emprestando
                    System.out.println("Emprestimo realizado!");
                }else{
                System.out.println("Item nao disponivel!");
                }
            }
        }
    }
    private static void devolverItens(ArrayList<Geral> listaItem, int id){
        
        for (Geral geral : listaItem) {
            
            if(geral.getId() == id){ //Procurando o ID do item para emprestar        
       
                geral.setQuantidade(geral.getQuantidade()+1);  //Devolvendo
                System.out.println("Devolucao realizada!");
            }
        }
        
    }
    private static void pesquisarItens(ArrayList<Geral> listaItem, int id) {  //Procurar o item no acervo
       
        for (Geral geral : listaItem) {
            
            if(geral.getId() == id){ //Imprimir o id e Titulo        
               System.out.println("ID: " + id + ", Titulo: " + geral.getTitulo() + ", Quantidade disponivel: " + geral.getQuantidade());
            }
        }    
    }
    private static void fichaItens(ArrayList<Geral> listaItem, int id) {  //Procurar a ficha do item para exibir
       
        for (Geral geral : listaItem) {
            
            if(geral.getId() == id){         
               System.out.println(geral);
            }
        }    
    }
    private static void listarItens(ArrayList<Geral> listaItem) {  //Listar todos os itens
        System.out.println("----------------------------");
        for (Geral geral : listaItem) {
        System.out.println("ID: " + geral.getId() + ", Titulo: " + geral.getTitulo() + ", Quantidade disponivel: " + geral.getQuantidade());
        }
        System.out.println("----------------------------");
    }
    
    private static void removerItens(ArrayList<Geral> listaItem, int id) {  //Remover um item
        
        for (Geral geral : listaItem) {
            
            if(geral.getId() == id){ //Procurar o item       
            listaItem.remove((geral.getId()-1));  //Removendo o item
            System.out.println("Item Removido");
            }
        }
    }
    private static void atualizarItens(ArrayList<Geral> listaItem, int id){
        
        for (Geral geral : listaItem) {
            
            if(geral.getId() == id){ //Procurar o item pelo ID
                System.out.println("\n            Atualizacao de item      \n");  
                
                if (geral instanceof Livro livro){  //Verificando o tipo do item
                
                    cadastroLivro(livro, (geral.getId()-1));
                    listaItem.set(id-1, geral); //Atualizando o item
                }else if(geral instanceof Periodico periodico){
                    cadastroPeriodico(periodico, (geral.getId()-1));
                    listaItem.set(id-1, geral); //Atualizando o item
                }
                else if(geral instanceof TCC tcc){
                    cadastroTCC(tcc, (geral.getId()-1));
                    listaItem.set(id-1, geral); //Atualizando o item
                }
                else if(geral instanceof Relatorio relatorio){
                    cadastroRelatorio(relatorio, (geral.getId()-1));
                    listaItem.set(id-1, geral); //Atualizando o item
                }
                else if(geral instanceof Midia midia){
                    cadastroMidia(midia, (geral.getId()-1));
                    listaItem.set(id-1, geral); //Atualizando o item
                }
                else if(geral instanceof Cartaz cartaz){
                    cadastroCartaz(cartaz, (geral.getId()-1));
                    listaItem.set(id-1, geral); //Atualizando o item
                }
                else if(geral instanceof Mapa mapa){
                    cadastroMapa(mapa, (geral.getId()-1));
                    listaItem.set(id-1, geral); //Atualizando o item
                }
            }
        }
    }
    private static void cadastroGeral(Geral geral, int quantItem) {  //Cadastrar as informações gerais
        int numA;
        
        Scanner scan = new Scanner(System.in);
        
        do{
            System.out.print("Entre com o numero de autores: ");
            numA = scan.nextInt();
            scan = new Scanner(System.in);
        }while(numA <= 0);
        
        
        String [] autor = new String[numA];
        
            for(int i = 0; i < numA; i++){
                System.out.print("Entre com o autor " + (i+1) + ": ");
                autor[i] = scan.nextLine();
                scan = new Scanner(System.in);
            }
            geral.setAutor(autor);
            
        System.out.print("Entre com o titulo: ");
        geral.setTitulo(scan.nextLine());
        scan = new Scanner(System.in);
        
        System.out.print("Entre com a edicao: ");
        geral.setEdicao(scan.nextInt());
        scan = new Scanner(System.in);
        
        System.out.print("Entre com a cidade: ");
        geral.setCidade(scan.nextLine());
        scan = new Scanner(System.in);
        
        System.out.print("Entre com a editora: ");
        geral.setEditora(scan.nextLine());
        scan = new Scanner(System.in);
        
        System.out.print("Entre com o ano: ");
        geral.setAno(scan.nextInt());
        scan = new Scanner(System.in);
        
        System.out.print("Entre com o CDU: ");
        geral.setCDU(scan.nextLine());
        scan = new Scanner(System.in);
        
        do{
            System.out.print("Entre com a quantidade: ");
            geral.setQuantidade(scan.nextInt());
            scan = new Scanner(System.in);
        }while(geral.getQuantidade() <= 0);  //Repetir ate a quantidade ser maior que 0
        
        System.out.print("Entre com o assunto: ");
        geral.setAssunto(scan.nextLine());
        scan = new Scanner(System.in);
        
        System.out.print("Entre com a palavra chave 1: ");
        geral.setPalavra1(scan.nextLine());
        scan = new Scanner(System.in);
        
        System.out.print("Entre com a palavra chave 2: ");
        geral.setPalavra2(scan.nextLine());
        scan = new Scanner(System.in);
        
        System.out.print("Entre com o tamanho: ");
        geral.setTamanho(scan.nextLine());
        
        geral.setId(quantItem+1); //ID do item
       
    }
    
    private static void cadastroLivro(Livro livro, int quantItem){  //Cadastrar livros
         
         System.out.println("\n             LIVRO      \n");
         
         Scanner scan = new Scanner(System.in);
         
         cadastroGeral(livro, quantItem);
         
         System.out.print("Entre com a quantidade de paginas: ");
         livro.setPaginas(scan.nextInt());
         scan = new Scanner(System.in);
         
         System.out.print("Entre com o ISBN: ");
         livro.setISBN(scan.nextLine());
         
     }
     private static void cadastroPeriodico(Periodico periodico, int quantItem){  //Cadastrar Periodicos
         
         System.out.println("\n             PERIODICO      \n");
         
         Scanner scan = new Scanner(System.in);
         
         cadastroGeral(periodico, quantItem);
         
         System.out.print("Entre com a quantidade de paginas: ");
         periodico.setPaginas(scan.nextInt());
         scan = new Scanner(System.in);
         
         System.out.print("Entre com o ISSN: ");
         periodico.setISSN(scan.nextLine());
         scan = new Scanner(System.in);
         
         int op;  //Escolher o tipo de periodico
         do{
            System.out.println("1 - Revista");
            System.out.println("2 - Jornal");
            System.out.print("Entre com a opcao: ");
            op = scan.nextInt();
         }while (op < 1 || op > 2);
         
            if(op == 1){
            periodico.setTipo("Revista");
            }else if (op == 2){
            periodico.setTipo("Jornal");
            }
           
     }
     private static void cadastroTCC(TCC tcc, int quantItem){  //Cadastrar TCCs
         
         System.out.println("\n             TCC      \n");
         
         Scanner scan = new Scanner(System.in);
         
         cadastroGeral(tcc, quantItem);
         
         System.out.print("Entre com a quantidade de paginas: ");
         tcc.setPaginas(scan.nextInt());
        
         int op;  //Escolher o tipo de periodico
         do{
            System.out.println("1 - Monografia");
            System.out.println("2 - Dissertacao");
            System.out.println("3 - Tese");
            System.out.print("Entre com a opção: ");
            op = scan.nextInt();
         }while (op < 1 || op > 3);
         
        switch (op) {
            case 1 -> tcc.setTipo("Monografia");
            case 2 -> tcc.setTipo("Dissertacao");
            case 3 -> tcc.setTipo("Tese");
            default -> {
            }
        }
           
     }
    private static void cadastroRelatorio(Relatorio relatorio, int quantItem){  //Cadastrar Relatorios
         
         System.out.println("\n            RELATORIOS      \n");
         
         Scanner scan = new Scanner(System.in);
         
         cadastroGeral(relatorio, quantItem);
         
         System.out.print("Entre com a quantidade de paginas: ");
         relatorio.setPaginas(scan.nextInt());
         
     }
    private static void cadastroMidia(Midia midia, int quantItem){  //Cadastrar Midias
         
         System.out.println("\n             MIDIAS      \n");
         
         Scanner scan = new Scanner(System.in);
         
         cadastroGeral(midia, quantItem);
        
         int op;  //Escolher o tipo de Midia
         do{
            System.out.println("1 - Fita VHS");
            System.out.println("2 - CD");
            System.out.println("3 - DVD");
            System.out.print("Entre com a opção: ");
            op = scan.nextInt();
         }while (op < 1 || op > 3);
         
        switch (op) {
            case 1 -> midia.setTipo("Fita VHS");
            case 2 -> midia.setTipo("CD");
            case 3 -> midia.setTipo("DVD");
            default -> {
            }
        }
           
     }
    
    private static void cadastroCartaz(Cartaz cartaz, int quantItem){  //Cadastrar Cartazes
         
         System.out.println("\n             CARTAZ     \n");
         
         Scanner scan = new Scanner(System.in);
         
         cadastroGeral(cartaz, quantItem);
         
         System.out.print("Entre com a quantidade de paginas: ");
         cartaz.setPaginas(scan.nextInt());
        
     }
     private static void cadastroMapa(Mapa mapa, int quantItem){  //Cadastrar Mapas
         
         System.out.println("\n             MAPA      \n");
         
         Scanner scan = new Scanner(System.in);
         
         cadastroGeral(mapa, quantItem);
         
         System.out.print("Entre com a quantidade de paginas: ");
         mapa.setPaginas(scan.nextInt());
        
     }
    private static int menuCadastrarItens(ArrayList<Geral> listaItem, int quantItem){
        
        Scanner scan = new Scanner(System.in);
        int op;

        do {
            do {
                System.out.println("\n\n            Cadastro de itens       \n");
                System.out.println("1 - Livro");
                System.out.println("2 - Periodico");
                System.out.println("3 - TCC");
                System.out.println("4 - Relatorio");
                System.out.println("5 - Midia");
                System.out.println("6 - Cartaz");
                System.out.println("7 - Mapa");
                System.out.println("8 - Voltar ao menu anterior");
                System.out.print("Entre com a opcao: ");
                op = scan.nextInt();
            } while (op < 1 || op > 8);

            Geral geral;

            switch (op) {  //Cadastrando itens
            
                case 1 -> {
                    geral = new Livro();
                    cadastroLivro((Livro) geral, quantItem);
                    listaItem.add(geral);  //Adicionando na lista
                    quantItem++;  //Quantidade de itens do acervo aumentou
                }

                case 2 -> {
                    geral = new Periodico();
                    cadastroPeriodico((Periodico) geral, quantItem);
                    listaItem.add(geral);  //Adicionando na lista
                    quantItem++;  //Quantidade de itens do acervo aumentou
                }
                case 3 -> {
                    geral = new TCC();
                    cadastroTCC((TCC) geral, quantItem);
                    listaItem.add(geral);  //Adicionando na lista
                    quantItem++;  //Quantidade de itens do acervo aumentou
                }
                case 4 -> {
                    geral = new Relatorio();
                    cadastroRelatorio((Relatorio) geral, quantItem);
                    listaItem.add(geral);
                    quantItem++;  //Quantidade de itens do acervo aumentou
                }
                case 5 -> {
                    geral = new Midia();
                    cadastroMidia((Midia) geral, quantItem);
                    listaItem.add(geral);
                    quantItem++;  //Quantidade de itens do acervo aumentou
                }
                case 6 -> {
                    geral = new Cartaz();
                    cadastroCartaz((Cartaz) geral, quantItem);
                    listaItem.add(geral);
                    quantItem++;  //Quantidade de itens do acervo aumentou
                }
                case 7 -> {
                    geral = new Mapa();
                    cadastroMapa((Mapa) geral, quantItem);
                    listaItem.add(geral);
                    quantItem++;  //Quantidade de itens do acervo aumentou
                }
            }
            //Cadastrando itens
                    
        } while (op != 8);
        
        return quantItem;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Geral> listaItem;
        listaItem = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        
        int op;  //Opções
        int quantItem = 0;  // Quantidade de itens no acervo
        int id; //Identificador de item
        
        do {

            do {

                System.out.println("\n            Biblioteca Universitaria       \n");
                System.out.println("1 - Emprestar item de acervo");
                System.out.println("2 - Devolver item de acervo");
                System.out.println("3 - Pesquisar de item de acervo");
                System.out.println("4 - Listar itens do acervo");
                System.out.println("5 - Fornecer ficha catalografica de item de acervo");
                System.out.println("6 - Cadastrar item de acervo");
                System.out.println("7 - Editar item de acervo");
                System.out.println("8 - Excluir item de acervo");
                System.out.println("9 - Sair");
                System.out.print("Entre com a opcao: ");
                op = scan.nextInt();
                
            } while (op < 1 || op > 9);

            switch (op) {

                case 1:  //Emprestar itens
                    System.out.println("");
                    System.out.print("Digite o ID do item: ");
                    id = scan.nextInt();
                    emprestarItens(listaItem, id);
                    break;

                case 2:  //Devolver itens
                    
                    System.out.println("");
                    System.out.print("Digite o ID do item: ");
                    id = scan.nextInt();
                    devolverItens(listaItem, id);
                    break;
                case 3:  //Pesquisa de item de acervo
                    
                    System.out.println("");
                    System.out.print("Digite o ID do item: ");
                    id = scan.nextInt();
                    pesquisarItens(listaItem, id);
                    break;
                case 4:  //Listar item do acervo
                    
                    listarItens(listaItem);
                    break;
                case 5:  //Fornecer ficha catalografica de item de acervo
                    
                    System.out.println("");
                    System.out.print("Digite o ID do item: ");
                    id = scan.nextInt();
                    fichaItens(listaItem,id);  //Procurar o ID dos itens
                    break;
                case 6:
                    
                    quantItem = menuCadastrarItens(listaItem, quantItem);
                    break;
                case 7:  //Atualizar item do acervo
                    
                    System.out.println("");
                    System.out.print("Digite o ID do item: ");
                    id = scan.nextInt();
                    atualizarItens(listaItem,id);
                    break;
                case 8:
                    
                    System.out.println("");
                    System.out.print("Digite o ID do item: ");
                    id = scan.nextInt();
                    removerItens(listaItem, id);
                    break;
                case 9:
                    System.out.println("\n\n\nObrigado por utilizar o sistema!");
                    break;
                    
            }

        } while (op != 9);
    }
    
}
