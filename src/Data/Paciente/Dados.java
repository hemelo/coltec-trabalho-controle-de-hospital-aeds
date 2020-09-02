package Data.Paciente;

public class Dados {
    private String nome;
    private String registro;
    private long horario_cadastrado;

    private static String formato = "%s";

    public Dados(String nome, String CPF, long horario_cadastrado){
        this.nome = nome;
        this.registro = CPF;
        this.horario_cadastrado = horario_cadastrado;
    }

    public long getHorarioCadastro(){
        return this.horario_cadastrado;
    }
    public String getNome() { return this.nome; }
    public String getRegistro() { return this.registro; }
    public String getFormato(){
        return this.formato;
    }

    public boolean equals(Object obj){
        if(obj instanceof Dados){
            if(((Dados) obj).getRegistro() == this.getRegistro())
                return true;
            else
                return false;
        }else{
            return false;
        }
    }
}
