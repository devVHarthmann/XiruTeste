package atv9;

import java.util.Scanner;

public class Atv9 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Livro livro1 = new Livro();
        System.out.println("Insira o título: ");
        livro1.setTitulo(ler.nextLine());
        System.out.println("Insira o autor: ");
        livro1.setAutor(ler.nextLine());
        System.out.println("Insira o total de páginas: ");
        livro1.setTotalPaginas(ler.nextInt());
        System.out.println("Insira o número de páginas lidas: ");
        livro1.setPaginasLidas(ler.nextInt());
        while(livro1.getPaginasLidas()< 0 || livro1.getPaginasLidas() > livro1.getTotalPaginas()){
            System.out.println("Insira um número de páginas válido: ");
            livro1.setPaginasLidas(ler.nextInt());
        }
        livro1.mostrarInfo();
        
        
    }
    
}
