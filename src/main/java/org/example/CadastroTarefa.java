package org.example;
import java.util.Date;


// Classe criação de uma tarefa no sistema

public class CadastroTarefa {
    private String tarefa; // Nome da tarefa
    private String descricao;  // Descrição da tarefa
    private Date dataCriacao; // Data de criação da tarefa
    private int prioridade; // Prioridade da tarefa (1 para baixa, 2 para média, 3 para alta)
    private Date prazo; // Prazo para a conclusão da tarefa
    private String meta; // Meta pessoal associada à tarefa


    // Construtor para inicializar uma nova tarefa com informações básicas
    public CadastroTarefa(String tarefa, String descricao, int prioridade, Date prazo, String meta) {
        this.tarefa = tarefa;
        this.descricao = descricao;
        this.dataCriacao = new Date(); // Define a data de criação como a data atual
        this.prioridade = prioridade;
        this.prazo = prazo;
        this.meta = meta;
    }

    // Métodos de acesso para obter e modificar informações da tarefa
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

    // Método para exibir as informações da tarefa
    public void exibirInformacoes() {
        System.out.println("Tarefa: " + tarefa);
        System.out.println("Descrição: " + descricao);
        System.out.println("Data de Criação: " + dataCriacao);
        System.out.println("Prioridade: " + prioridade);
        System.out.println("Prazo: " + prazo);
        System.out.println("Meta: " + meta);
    }





}
