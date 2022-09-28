package br.com.local.cafeteria;

public class Coffe {
    private String titulo;
    private String descricao;
    private int Imagem;

    public Coffe(String titulo, String descricao, int imagem) {
        this.titulo = titulo;
        this.descricao = descricao;
        Imagem = imagem;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getImagem() {
        return Imagem;
    }

    public void setImagem(int imagem) {
        Imagem = imagem;
    }
}

