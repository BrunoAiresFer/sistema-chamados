package model;


import java.time.LocalDateTime;

public class Chamados{

    int id = 0;
    String nomeSolicitante;
    String unidadeEscolar;
    String endereco;
    String descProblema;
    String prioridade;
    String horarioAntedimento;
    LocalDateTime horario;
    String status;

    public Chamados(){
        //adicionar os valores depois
    };

    public Chamados(int id, String nomeSolicitante, String unidadeEscolar, String endereco, String descProblema, String prioridade, String horarioAntedimento, LocalDateTime horario, String status){
        this.id = id;
        this.nomeSolicitante = nomeSolicitante;
        this.unidadeEscolar = unidadeEscolar;
        this.endereco = endereco;
        this.descProblema = descProblema;
        this.prioridade = prioridade;
        this.horarioAntedimento = horarioAntedimento;

        this.status = "Aberto";
        this.horario = LocalDateTime.now();

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeSolicitante() {
        return nomeSolicitante;
    }

    public void setNomeSolicitante(String nomeSolicitante) {
        this.nomeSolicitante = nomeSolicitante;
    }

    public String getUnidadeEscolar() {
        return unidadeEscolar;
    }

    public void setUnidadeEscolar(String unidadeEscolar) {
        this.unidadeEscolar = unidadeEscolar;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getDescProblema() {
        return descProblema;
    }

    public void setDescProblema(String descProblema) {
        this.descProblema = descProblema;
    }

    public String getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(String prioridade) {
        this.prioridade = prioridade;
    }

    public String getHorarioAntedimento() {
        return horarioAntedimento;
    }

    public void setHorarioAntedimento(String horarioAntedimento) {
        this.horarioAntedimento = horarioAntedimento;
    }

    public LocalDateTime getHorario() {
        return horario;
    }

    public void setHorario(LocalDateTime horario) {
        this.horario = horario;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

