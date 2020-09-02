package Atendimento;
import Atendimento.Codigos.PrioridadeAtendimento;
import Data.DataStructures.PilhaPacientes;
import Data.DataStructures.ListaPacientes;

public class Stats {
    public static PrioridadeAtendimento[] codigos_de_fila = PrioridadeAtendimento.values();

    public int atendidos;
    public int obitos;

    public PilhaPacientes pacientes_atendidos;
    public ListaPacientes pacientes_em_atendimento;

    public Stats(){
        this.atendidos = 0;
        this.obitos = 0;
        this.pacientes_atendidos = new PilhaPacientes();
        this.pacientes_em_atendimento = new ListaPacientes();
    }

    public void setAtendidos() {
        this.atendidos = this.atendidos + 1;
    }

    public void setObitos(){
        this.obitos = this.obitos + 1;
    }

    public int getAtendidos() {
        return atendidos;
    }

    public int getObitos() {
        return obitos;
    }
}
