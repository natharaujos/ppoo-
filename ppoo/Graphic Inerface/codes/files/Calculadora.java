import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.*;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPanel;

public class Calculadora {

    private JFrame janela;
    private JTextField resultado;
    private JButton botao9;
    private JButton botao8;
    private JButton botao7;
    private JButton botao6;
    private JButton botao5;
    private JButton botao4;
    private JButton botao3;
    private JButton botao2;
    private JButton botao1;
    private JButton botao0;
    private JButton botaoSoma;
    private JButton botaoSub;
    private JButton botaoMult;
    private JButton botaoDiv;
    private JButton botaoIgual;
    private JButton botaoPonto;
    private JButton botaoAc;

    public Calculadora() {

        janela = new JFrame("Calculadora");
        botao9 = new JButton("9");
        botao8 = new JButton("8");
        botao7 = new JButton("7");
        botao6 = new JButton("6");
        botao5 = new JButton("5");
        botao4 = new JButton("4");
        botao3 = new JButton("3");
        botao2 = new JButton("2");
        botao1 = new JButton("1");
        botao0 = new JButton("0");
        botaoSoma = new JButton("+");
        botaoSub = new JButton("-");
        botaoMult = new JButton("*");
        botaoDiv = new JButton("/");
        botaoIgual = new JButton("=");
        botaoPonto = new JButton(".");
        botaoAc = new JButton("AC");
        resultado = new JTextField();

        botao0.addActionListener(
            new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    String aux = resultado.getText();
                    resultado.setText(aux + "0");
                }

            }
        );

        botao1.addActionListener(
            new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    String aux = resultado.getText();
                    resultado.setText(aux + "1");
                }

            }
        );

        botao2.addActionListener(
            new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    String aux = resultado.getText();
                    resultado.setText(aux + "2");
                }

            }
        );

        botao3.addActionListener(
            new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    String aux = resultado.getText();
                    resultado.setText(aux + "3");
                }

            }
        );

        botao4.addActionListener(
            new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    String aux = resultado.getText();
                    resultado.setText(aux + "4");
                }

            }
        );

        botao5.addActionListener(
            new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    String aux = resultado.getText();
                    resultado.setText(aux + "5");
                }

            }
        );

        botao6.addActionListener(
            new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    String aux = resultado.getText();
                    resultado.setText(aux + "6");
                }

            }
        );

        botao7.addActionListener(
            new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    String aux = resultado.getText();
                    resultado.setText(aux + "7");
                }

            }
        );

        botao8.addActionListener(
            new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    String aux = resultado.getText();
                    resultado.setText(aux + "8");
                }

            }
        );

        botao9.addActionListener(
            new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    String aux = resultado.getText();
                    resultado.setText(aux + "9");
                }

            }
        );

        botaoSoma.addActionListener(
            new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    String aux = resultado.getText();
                    resultado.setText(aux + "+");
                }

            }
        );

        botaoSub.addActionListener(
            new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    String aux = resultado.getText();
                    resultado.setText(aux + "-");
                }

            }
        );

        botaoDiv.addActionListener(
            new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    String aux = resultado.getText();
                    resultado.setText(aux + "/");
                }

            }
        );

        botaoMult.addActionListener(
            new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    String aux = resultado.getText();
                    resultado.setText(aux + "*");
                }

            }
        );

        botaoAc.addActionListener(
            new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    resultado.setText("");
                }

            }
        );
        
        botaoPonto.addActionListener(
            new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    String aux = resultado.getText();
                    resultado.setText(aux + ".");
                }
            }
        );

        botaoIgual.addActionListener(
            new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    Calculo calculo = new Calculo();
                    String aux = resultado.getText();
                    resultado.setText(calculo.calcula(aux));
                }

            }
        );
        
        

        construirJanela();
    }

    private void construirJanela() {

        janela.setSize(300, 400);
        janela.setLayout(new BorderLayout(20,20));
        JPanel painel = new JPanel();
        painel.setLayout(new BoxLayout(painel, BoxLayout.X_AXIS));
        resultado.setFont(new Font("montserrat",Font.PLAIN, 20));
        painel.add(resultado);
        janela.setBackground(Color.BLACK);
        janela.add(painel,BorderLayout.NORTH);
        JPanel button = new JPanel();
        button.setLayout(new GridLayout(4,4,5,5));
        button.setBackground(Color.BLACK);
        button.add(botao9);
        botao9.setBackground(Color.orange);
        button.add(botao8);
        botao8.setBackground(Color.orange);
        button.add(botao7);
        botao7.setBackground(Color.orange);
        button.add(botaoDiv);
        botaoDiv.setBackground(Color.white);
        button.add(botaoMult);
        botaoMult.setBackground(Color.white);
        button.add(botao4);
        botao4.setBackground(Color.orange);
        button.add(botao5);
        botao5.setBackground(Color.orange);
        button.add(botao6);
        botao6.setBackground(Color.orange);
        button.add(botaoSub);
        botaoSub.setBackground(Color.white);
        button.add(botaoSoma);
        botaoSoma.setBackground(Color.white);
        button.add(botao1);
        botao1.setBackground(Color.orange);
        button.add(botao2);
        botao2.setBackground(Color.orange);
        button.add(botao3);
        botao3.setBackground(Color.orange);
        button.add(botaoIgual);
        botaoIgual.setBackground(Color.white);
        button.add(botaoPonto);
        button.add(botao0);
        botao0.setBackground(Color.orange);
        button.add(botaoAc);
        janela.add(button, BorderLayout.CENTER);
    }

    public void exibirJanela() {

        janela.setVisible(true);
    }
}