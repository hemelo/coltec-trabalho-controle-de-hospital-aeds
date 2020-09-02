package Data.DataStructures.DS_Templates.Pilha;

import Data.Paciente.Dados;

public class PilhaLE extends Pilha{
    private ItemPilha topo;

    public PilhaLE(){ PilhaCriar(); }

    public void PilhaCriar(){
        this.topo = null;
        this.n_itens = 0;
    }

    @Override
    public void PilhaCriar(int capacidade) {}

    public boolean Empilhar(Dados dados){
        ItemPilha item = new ItemPilha(dados, this.topo);
        this.topo = item;
        this.n_itens++;
        return true;
    }

    public boolean Desempilhar(){
        if(this.PilhaEstaVazia() == true) { return false; }
        this.topo = (ItemPilha) this.topo.getProximo();
        this.n_itens--;
        return true;
    }

    public void Imprimir(){
        ItemPilha item = this.topo;
        if(this.PilhaEstaVazia() == false) {
            System.out.println("Impressao de Data.DataStructures.DS_Templates.Pilha Encadeada");
            for (int i = 0; i < this.n_itens; i++) {
                System.out.printf("Posicao %d: %d\n", i, item.getDados().getRegistro());
                item = (ItemPilha) item.getProximo();
            }
        }
        else{
            System.out.println("Data.DataStructures.DS_Templates.Pilha Vazia!");
        }
    }

    public boolean BuscarItem(Dados dados){
        ItemPilha item = this.topo;
        do{
            if(dados.equals(item.getDados()) == true) { return true; }
            item = (ItemPilha) item.getProximo();
        }while(item.getProximo() != null);

        return false;
    }
}