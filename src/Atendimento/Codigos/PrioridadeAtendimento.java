package Atendimento.Codigos;

import Atendimento.Atendimento;

public enum PrioridadeAtendimento {
    // Na ordem de maior importância
    RED(4),
    ORANGE(3),
    YELLOW(2),
    GREEN(1),
    WHITE(0);

    private final int value;
    PrioridadeAtendimento(int i) { this.value = i; }
    public int getValue(){ return value; }
}
