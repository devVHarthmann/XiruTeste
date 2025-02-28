package atv9;

public class Livro {
    private String titulo;
    private String autor;
    private int totalPaginas;
    private int paginasLidas;
    private boolean leituraCompleta;
    
    public Livro(){ 
        this.titulo = "";
        this.autor = "";
        this.totalPaginas = 0;
        this.paginasLidas = 0;
        this.leituraCompleta = false;
    }
    public String getTitulo(){
        return titulo;
    }
    public String getAutor(){
        return autor;
    }
    public int getTotalPaginas(){
        return totalPaginas;
    }
    public int getPaginasLidas(){
        return paginasLidas;
    }
    public boolean getLeituraCompleta(){
        return leituraCompleta;
    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public void setAutor(String autor){
        this.autor = autor;
    }
    public void setTotalPaginas(int totalPaginas){
        this.totalPaginas = totalPaginas;
    }
    public void setPaginasLidas(int paginasLidas){
        this.paginasLidas = paginasLidas;
    }
    public void setLeituraCompleta(boolean leituraCompleta){
        this.leituraCompleta= leituraCompleta;
    }
    public double calcularPorcentagem(){
        int porcent = (getPaginasLidas() / getTotalPaginas()) * 100;
        if(porcent == 100){
            setLeituraCompleta(true);
        }
        return porcent;
    }
    public void exibirProgresso(){
        if(getLeituraCompleta()){
            System.out.println("Leitura comleta");
        } else{
            System.out.println(calcularPorcentagem() + "%");
        }
    }
    
}

