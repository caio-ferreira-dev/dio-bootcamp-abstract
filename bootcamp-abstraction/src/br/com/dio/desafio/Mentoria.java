package br.com.dio.desafio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {
    private LocalDate data;

    public Mentoria(String titulo, String descricao, LocalDate data) {
        super(titulo, descricao);
        this.data = data;
    }

    public LocalDate getData() {
        return data;
    }

    @Override
    public double calcularXp(){
        return XP_PADRAO + 20d;
    }

    @Override
    public String toString() {
        return String.format("Curso {%n titulo do curso: '%s',%n descricao: '%s',%n data: '%s',%n}", this.getTitulo(), this.getDescricao(), data);
    }
}
