import model.Chamados;
import model.Menu;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Chamados construtorChamados = new Chamados();
        Scanner input = new Scanner(System.in);
        ArrayList<String> elementos = new ArrayList<>();

        int id = 0;
        boolean sistemaAtivo = true;
        int opcaoSelecionada = 0;

        Menu menuOpcoes = new Menu();
        while(sistemaAtivo){

            menuOpcoes.exibirMenu();
            opcaoSelecionada  = input.nextInt();
            input.nextLine();
            switch (opcaoSelecionada) {
                case 1:

                    System.out.println("Nome da escola: ");
                    construtorChamados.setUnidadeEscolar(input.nextLine());
                    elementos.add(construtorChamados.getUnidadeEscolar());

                    System.out.println("Quem abriu: ");
                    construtorChamados.setNomeSolicitante(input.nextLine());
                    elementos.add(construtorChamados.getNomeSolicitante());

                    System.out.println("Endereço: ");
                    construtorChamados.setEndereco(input.nextLine());
                    elementos.add(construtorChamados.getEndereco());

                    System.out.println("Qual o problema: ");
                    construtorChamados.setDescProblema(input.nextLine());
                    elementos.add(construtorChamados.getDescProblema());

                    System.out.println("Prioridade do chamado: ");
                    construtorChamados.setPrioridade(input.nextLine());
                    elementos.add(construtorChamados.getPrioridade());

                    System.out.println("Qual o horário para o atendimento?: ");
                    construtorChamados.setHorarioAntedimento(input.nextLine());
                    elementos.add(construtorChamados.getHorarioAntedimento());

                    construtorChamados.setStatus("Aberto");
                    elementos.add(construtorChamados.getStatus());

                    construtorChamados.setId(id++);
                    String Id = Integer.toString(id);
                    elementos.add(Id);
                    String nomeArquivo = Id + "-" + construtorChamados.getUnidadeEscolar();

                    construtorChamados.setNomeArquivo(nomeArquivo);
                    elementos.add(construtorChamados.getNomeArquivo());

                    break;

                case 2:
                    System.out.println("=== CHAMADOS ABERTOS ===");
                    if(elementos.isEmpty()){
                        System.out.println("Não tem chamados!");
                    } else {
                        System.out.println(elementos);
                    }
                    break;

                case 3:
                    System.out.println("Saindo do sistema.");
                    sistemaAtivo = false;
                    break;

                default:
                    break;
            }
        }
    }
}