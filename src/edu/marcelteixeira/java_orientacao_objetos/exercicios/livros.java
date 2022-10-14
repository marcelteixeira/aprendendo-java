/*
 * DONE: Levando em consideração uma loja online de livros, modele uma entidade livro
 */
package edu.marcelteixeira.java_orientacao_objetos.exercicios;

public class livros {
    String titulo;
    String autor;
    String assunto;
    String editora;
    String isbn;
    int quantidadePaginas;

    /*
     * Outros atributos podem ser: Editora, ISBN
     */

    public livros(){}

    // Encapsulamento
    public String getTitulo(){
        return titulo;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public String getAutor(){
        return autor;
    }

    public void setAutor(String autor){
        this.autor = autor;
    }

    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

}
