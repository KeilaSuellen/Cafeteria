package br.com.local.cafeteria;

public class Produtos {
    //Criando as variáveis globais
    private String titulo;
    private String tipo;
    private String ano;

    //Criando o método construtor sem parâmetros - ALT+INSERT

    public Produtos() {
    }

    //Criando o método construtor com parâmetros - ALT+INSERT

    public Produtos(String titulo, String tipo) {
        this.titulo = titulo;
        this.tipo = tipo;
    }
    //Criando os métodos GET e SET - ALT+INSERT

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setGenero(String genero) {
        this.tipo = genero;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }
}
