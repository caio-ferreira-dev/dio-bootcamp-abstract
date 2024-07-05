package br.com.dio.desafio;

public class Curso extends Conteudo {
    private int cargaHoraria;

    public Curso(String titulo, String descricao, int cargaHoraria) {
        super(titulo, descricao);
        this.cargaHoraria = cargaHoraria;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    @Override
    public double calcularXp(){
        return XP_PADRAO + 20d;
    }

    @Override
    public String toString() {
        return String.format("Curso {%n titulo do curso: '%s',%n descricao: '%s',%n carga horaria: '%d',%n}", this.getTitulo(), this.getDescricao(), cargaHoraria);
    }

}
