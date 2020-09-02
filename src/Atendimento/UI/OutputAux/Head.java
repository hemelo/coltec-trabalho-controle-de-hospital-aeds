package Atendimento.UI.OutputAux;
import java.util.Arrays;

public class Head {
    public static int vezes = 20;

    public void setVezes(int n){
        vezes = n;
    }

    public static void Line(char x){
        char[] out = new char[vezes];
        Arrays.fill(out, x);
        System.out.println(out);
    }
}
