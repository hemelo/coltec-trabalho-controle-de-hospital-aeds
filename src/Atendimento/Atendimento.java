package Atendimento;
import Atendimento.Codigos.PrioridadeAtendimento;
import Data.DataStructures.FilaPacientes;
import Atendimento.Exceptions.PacienteMorreu;
import Atendimento.UI.OutputAux.Head;
import Data.*;
import Data.Paciente.Dados;

public class Atendimento{
    public Tempo tempo_atual;

    public static final int quantidade_filas_de_espera = 5;
    public static PrioridadeAtendimento[] codigos_de_fila = PrioridadeAtendimento.values();

    public static FilaPacientes[] pacientes_em_espera = new FilaPacientes[quantidade_filas_de_espera];
    public FilaPacientes fila_em_prioridade;

    public Stats stats;

    public Atendimento(){
        // Inicializa as filas de espera
        int posicao_fila = 0;
        for ( PrioridadeAtendimento codigo : codigos_de_fila) {
            pacientes_em_espera[posicao_fila++] = new FilaPacientes(codigo);
        }

        // Inicializa a referência para a fila de espera em prioridade
        this.fila_em_prioridade = null;

        // Inicializa as estatísticas do atendimento atual
        this.stats = new Stats();
    }

    /**
     * Função que Atualiza a Referência para a Data.DataStructures.DS_Templates.Fila em Prioridade de Atendimento baseada no Código de Cor
     */
    public void SetPrioridadeAtual(){
        for (FilaPacientes fila : pacientes_em_espera) {
            if(fila.n_itens > 0){
                this.fila_em_prioridade = fila;
                break;
            }
        }
    }

    /**
     * Função que verifica e move se necessário mover paciente de fila de prioridade baseado no tempo de espera
     */
    public static void MoverDePrioridade() throws PacienteMorreu {
        for(int posicao = 0; posicao < quantidade_filas_de_espera; posicao++){
            Tempo tempo_registro = pacientes_em_espera[posicao].getFim().getDados().getHorarioCadastro());
            if(this.tempo_atual.compararTempo(tempo_registro)){
                switch (pacientes_em_espera[posicao].codigo_cor){
                    case RED:
                        throw new PacienteMorreu("Paciente Morreu por Negligência de Atendimento");
                        break;
                    case WHITE:
                        break;
                    default:
                        pacientes_em_espera[posicao - 1].Inserir(pacientes_em_espera[posicao].getFim().getDados());
                        pacientes_em_espera[posicao].Remover();
                }
            }
        }
    }

    public void CadastrarPaciente(){
        String nome = "";
        String cpf = "";
        long horario_cadastro = System.currentTimeMillis();
        Dados paciente_cadastro = new Dados(nome, cpf, horario_cadastro);
    }





   public static void main(String[] args) {

        Head.Line('-');


        Head.Line('-');
   }
}
