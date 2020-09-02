package Data.DataStructures.DS_Templates.ListaEncadeada;

import Data.Paciente.Dados;

public class ItemLista {
    protected ItemLista proximo;
    protected Dados info;

    public ItemLista(Dados info, ItemLista proximo){
        this.proximo = proximo;
        this.info = info;
    }
    public ItemLista getProximo(){
        return this.proximo;
    }

    public void setProximo(ItemLista novoProximo){
        this.proximo = novoProximo;
    }

    public Dados getDados(){
        return this.info;
    }

    public void setDados(Dados novosDados){
        this.info = novosDados;
    }

}
