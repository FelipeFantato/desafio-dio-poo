package br.com.dio.desafio.dominio;

public abstract class  Conteudo {
    protected static final double XP_PADRAO = 10d;
    private String titulo;
    private String descricao;
    private Professor docente;

    public Professor getDocente() {
        return docente;
    }

    public void setDocente(Professor docente) {
        this.docente = docente;
    }

    public abstract double calcularXp();

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
}
