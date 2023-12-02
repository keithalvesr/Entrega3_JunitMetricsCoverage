package org.example;
import java.util.Date;
    

public class CadastroTarefa {
    private String tarefa;
    private String descricao;
    private Date dataCriacao;
    private int prioridade;
    private Date prazo;
    private String meta;


    public CadastroTarefa(String tarefa, String descricao, int prioridade, Date prazo, String meta) {
        this.tarefa = tarefa;
        this.descricao = descricao;
        this.dataCriacao = new Date();
        this.prioridade = prioridade;
        this.prazo = prazo;
        this.meta = meta;
    }

    public String getNome() {
        return tarefa;
    }

    public void setNome(String nome) {
        this.tarefa = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(Date dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public int getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(int prioridade) {
        this.prioridade = prioridade;
    }

    public Date getPrazo() {
        return prazo;
    }

    public void setPrazo(Date prazo) {
        this.prazo = prazo;
    }

    public String getMeta() {
        return meta;
    }

    public void setMeta(String meta) {
        this.meta = meta;
    }

    public void exibirInformacoes() {
        System.out.println("Tarefa: " + tarefa);
        System.out.println("Descrição: " + descricao);
        System.out.println("Data de Criação: " + dataCriacao);
        System.out.println("Prioridade: " + prioridade);
        System.out.println("Prazo: " + prazo);
        System.out.println("Meta: " + meta);
    }





}
