package org.example;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;

public class Tarefa {
    private List<CadastroTarefa> listaTarefas;

    public Tarefa() {
        this.listaTarefas = new ArrayList<>();
    }

    public void adicionarTarefa(String tarefa, String descricao, int prioridade, Date prazo, String meta) {
        CadastroTarefa novaTarefa = new CadastroTarefa(tarefa, descricao, prioridade, prazo, meta);
        listaTarefas.add(novaTarefa);
    }

    public List<CadastroTarefa> obterTarefas() {
        return listaTarefas;
    }

    public void exibirTarefas() {
        System.out.println("Tarefas cadastradas:");
        for (CadastroTarefa tarefa : listaTarefas) {
            tarefa.exibirInformacoes();
            System.out.println();
        }
    }

    // Método getter para obter a lista de tarefas
    public List<CadastroTarefa> getListaTarefas() {
        return listaTarefas;
    }

    // Método setter para definir a lista de tarefas
    public void setListaTarefas(List<CadastroTarefa> listaTarefas) {
        this.listaTarefas = listaTarefas;
    }
}
