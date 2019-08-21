package br.com.digitalhouse;

public class Livro {
    private String titulo, autor, isbn;
    private int anoLancamento, estoque, codigo;
    private float preco;
    private Livro Codigo;

    public Livro(int codigo, String titulo, String autor,
                 String isbn, int anoLancamento, int estoque, float preco) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.anoLancamento = anoLancamento;
        this.estoque = estoque;
        this.preco = preco;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Livro\n" +
                "titulo: " + this.titulo + "\nAutor: " + this.autor +
                "\nIsbn: " + this.isbn + "\nAnoLancamento: " + this.anoLancamento +
                "\nEstoque: " + this.estoque + "\nCodigo: " + this.codigo +
                "\nPreco: " + this.preco;
    }

    public void venda(int novoCodigoDeVenda) {


        if (novoCodigoDeVenda == getCodigo()) {
            setEstoque(getEstoque() - 1);
            System.out.println("Venda Realizada! \n" + "Estoque:  " + getEstoque());
        }
    }
}
