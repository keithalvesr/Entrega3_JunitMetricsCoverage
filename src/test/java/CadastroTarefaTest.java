import org.example.CadastroTarefa;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CadastroTarefaTest {

    @Test
    public void testGetNome() {
        // Arrange
        String nomeTarefa = "Estudar Java";
        String descricao = "Aprender conceitos básicos de Java";
        int prioridade = 2;
        Date prazo = new Date();
        String meta = "Concluir em uma semana";


        CadastroTarefa cadastroTarefa = new CadastroTarefa(nomeTarefa, descricao, prioridade, prazo, meta);

        assertEquals(nomeTarefa, cadastroTarefa.getNome());
    }

    @Test
    public void testExibirInformacoes() {
        // Arrange
        String nomeTarefa = "Realizar testes A3";
        String descricao = "Testes Junit";
        int prioridade = 1;
        Date prazo = new Date();
        String meta = "Concluir hoje";

        CadastroTarefa cadastroTarefa = new CadastroTarefa(nomeTarefa, descricao, prioridade, prazo, meta);


        cadastroTarefa.exibirInformacoes();

    }

    @Test
    public void testGetDescricao() {
        String nomeTarefa = "Estudar Java";
        String descricao = "Aprender conceitos básicos de Java";
        int prioridade = 2;
        Date prazo = new Date();
        String meta = "Concluir em uma semana";

        CadastroTarefa cadastroTarefa = new CadastroTarefa(nomeTarefa, descricao, prioridade, prazo, meta);

        assertEquals(descricao, cadastroTarefa.getDescricao());
    }

    @Test
    public void testGetPrioridade() {
        String nomeTarefa = "Estudar Java";
        String descricao = "Aprender conceitos básicos de Java";
        int prioridade = 2;
        Date prazo = new Date();
        String meta = "Concluir em uma semana";

        CadastroTarefa cadastroTarefa = new CadastroTarefa(nomeTarefa, descricao, prioridade, prazo, meta);

        assertEquals(prioridade, cadastroTarefa.getPrioridade());
    }

    @Test
    public void testGetPrazo() {
        String nomeTarefa = "Estudar Java";
        String descricao = "Aprender conceitos básicos de Java";
        int prioridade = 2;
        Date prazo = new Date();
        String meta = "Concluir em uma semana";

        CadastroTarefa cadastroTarefa = new CadastroTarefa(nomeTarefa, descricao, prioridade, prazo, meta);

        assertEquals(prazo, cadastroTarefa.getPrazo());
    }

    @Test
    public void testGetMeta() {
        String nomeTarefa = "Estudar Java";
        String descricao = "Aprender conceitos básicos de Java";
        int prioridade = 2;
        Date prazo = new Date();
        String meta = "Concluir em uma semana";

        CadastroTarefa cadastroTarefa = new CadastroTarefa(nomeTarefa, descricao, prioridade, prazo, meta);

        assertEquals(meta, cadastroTarefa.getMeta());
    }



}

