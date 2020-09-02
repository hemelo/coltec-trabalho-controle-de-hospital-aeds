package Atendimento.UI.Forms;

import javax.swing.*;
import java.awt.event.*;

public class Menu {
    public static JFrame Window = new JFrame("Menu");

    private JPanel Panel;
    private JTextField User;
    private JPasswordField Password;
    private JButton cancelarButton;
    private JButton loginButton;
    private JButton cadastrarButton;

    public Menu() {
        cancelarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Window.setDefaultCloseOperation(JFrame.ABORT);
            }
        });

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = User.getText();
                String password = Password.getText();
                if(senhaErrada){
                    JOptionPane.showMessageDialog(Window, "Senha Incorreta!");
                }
                else{
                    JOptionPane.showMessageDialog(Window, "Você entrou com sucesso!");
                    Window.setContentPane(new Opcoes_deGerenciar().Panel);
                }
            }
        });

        cadastrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Window.setContentPane(new Opcoes_deGerenciar().Panel);
            }
        });
    }

    public static void main(String[] args) {
        Window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Window.setContentPane(new Menu().Panel);
    }
}
