package Data.DataStructures.DS_Templates.Pilha;

import Data.Paciente.Dados;

public abstract class Pilha {
    int n_itens;

    public boolean PilhaEstaVazia(){
        if (this.n_itens == 0) return true;
        else return false;
    }

    public abstract void PilhaCriar();
    public abstract void PilhaCriar(int capacidade);
    public abstract boolean Empilhar(Dados dados);
    public abstract boolean Desempilhar();
    public abstract void Imprimir();
    public abstract boolean BuscarItem(Dados dados);

}
