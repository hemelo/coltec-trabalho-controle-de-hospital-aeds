package Data.DataStructures;
import Data.DataStructures.DS_Templates.Fila.*;
import Atendimento.Codigos.PrioridadeAtendimento;

public class FilaPacientes extends FilaLE {
    public PrioridadeAtendimento codigo_cor;

    public FilaPacientes(PrioridadeAtendimento codigo_cor){
        super();
        this.codigo_cor = codigo_cor;
    }


}
