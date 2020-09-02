package Atendimento.UI.Forms;

public enum Opcoes {
    GERENCIAR_PACIENTES("Gerenciar Pacientes"),
    GERENCIAR_MEDICOS("Gerenciar Médicos");

    private final String value;
    Opcoes(String i) { this.value = i; }
    public String getValue(){ return value; }
}
