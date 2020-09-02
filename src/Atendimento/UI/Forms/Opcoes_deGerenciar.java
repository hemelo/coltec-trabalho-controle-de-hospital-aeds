package Atendimento.UI.Forms;

import javax.swing.*;

public class Opcoes_deGerenciar extends Menu{
    public static Opcoes opcoes;

    private JComboBox Select;
    private JButton sairButton;
    private JButton irButton;
    public JPanel Panel;

    public Opcoes_deGerenciar() {
        super();
        sairButton.addActionListener(e -> Window.setDefaultCloseOperation(JFrame.ABORT));

        irButton.addActionListener(e -> {
            Opcoes opcao = Opcoes.valueOf((String) Select.getSelectedItem());

            switch(opcao){
                case GERENCIAR_MEDICOS:

                    break;
                case GERENCIAR_PACIENTES:

                    break;
            }
        });
    }
}
