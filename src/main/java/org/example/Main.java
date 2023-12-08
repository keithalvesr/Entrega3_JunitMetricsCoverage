package org.example;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import static org.example.Validaremail.validarFormatoEmail;

public class Main {

    public static void main(String[] args) {

        // Boas-vindas ao programa
        System.out.println("Bem vindo ao Kumu!");
        System.out.println("Queremos poder te ajudar nas suas tarefas");
        System.out.println("Realize o seu cadastro");


        //Cadastro usuário
        System.out.print("Digite seu nome: ");
        Scanner scanner = new Scanner(System.in);

        String nome = scanner.nextLine();

        //Solicitação e validação do email
        String email;
        do {
            System.out.print("Digite seu email: ");
            email = scanner.nextLine();
            if (!validarFormatoEmail(email)) {
                System.out.println("Formato de e-mail inválido. Por favor, tente novamente.");
            }
        } while (!validarFormatoEmail(email));


        //Solicitação senha usuário
        System.out.print("Digite sua senha: ");
        String senha = scanner.nextLine();


        // Criação de um objeto CadastroUsuario com os dados fornecidos
        CadastroUsuario cadastroUsuario = new CadastroUsuario(nome, email,senha);

        // Exibição das informações do usuário cadastrado
        System.out.println("\nUsuário cadastrado com sucesso!");
        System.out.println("Nome: " + cadastroUsuario.getNome());
        System.out.println("Email: " + cadastroUsuario.getEmail());

        //Validação de senha cadastrada
        System.out.print("\nDigite a senha para verificação: ");
        String senhaVerificacao = scanner.nextLine();
        if (cadastroUsuario.verificarSenha(senhaVerificacao)) {
            System.out.println("Senha correta!");
        } else {
            System.out.println("Senha incorreta!");

        }

        // Criação de um objeto Tarefa para armazenar as tarefas do usuário
        Tarefa tarefasUsuario = new Tarefa();

        // Loop para cadastrar novas tarefas
        char cadastrarNovaTarefa;
        do {
            // Criação de uma nova tarefa
            System.out.print("Agora vamos criar uma tarefa!");
            System.out.print("Digite o nome da tarefa: ");
            String nomeTarefa = scanner.nextLine();

            System.out.print("Digite a descrição da tarefa: ");
            String descricaoTarefa = scanner.nextLine();

            System.out.print("Digite a prioridade da tarefa (1 para baixa, 2 para média, 3 para alta): ");
            int prioridade = scanner.nextInt();

            System.out.print("Digite a data de prazo da tarefa (formato dd/MM/yyyy): ");
            scanner.nextLine();
            String dataPrazoStr = scanner.nextLine();

            // Conversão da string da data para um objeto Date
            Date prazo = null;
            try {
                prazo = new SimpleDateFormat("dd/MM/yyyy").parse(dataPrazoStr);
            } catch (ParseException e) {
                System.out.println("Formato de data inválido. Utilize o formato dd/MM/yyyy.");
                System.exit(1);
            }

            scanner.nextLine();

            System.out.print("Digite a meta pessoal para a tarefa: ");
            String meta = scanner.nextLine();

            // Adição da nova tarefa ao objeto Tarefa
            tarefasUsuario.adicionarTarefa(nomeTarefa, descricaoTarefa, prioridade, prazo, meta);

            // Verificação se o usuário deseja cadastrar outra tarefa
            System.out.print("\nDeseja cadastrar outra tarefa? (S para Sim, N para Não): ");
            cadastrarNovaTarefa = scanner.next().charAt(0);
            scanner.nextLine();

        } while (Character.toUpperCase(cadastrarNovaTarefa) == 'S');


        // Exibição de todas as tarefas cadastradas pelo usuário

        tarefasUsuario.exibirTarefas();

        // Fechamento do scanner
        scanner.close();
    }
}
