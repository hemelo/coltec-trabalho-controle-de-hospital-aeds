package Data.DataStructures.DS_Templates.Fila;
import Data.Paciente.Dados;

public abstract class Fila {
    public int n_itens;

    public boolean FilaEstaVazia(){
        if (this.n_itens == 0) return true;
        else return false;
    }

    public abstract void FilaCriar();
    public abstract void FilaCriar(int capacidade);
    public abstract boolean Inserir(Dados dados);
    public abstract boolean Remover();
    public abstract void Imprimir();
    public abstract boolean BuscarItem(Dados dados);
}
