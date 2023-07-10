package View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorView {

    private JFrame frame;
    private JTextField textField;
    private JButton[] numberButtons;
    private JButton[] operatorButtons;
    private JButton clearButton; // Reemplazamos el botón "."
    private JButton equalsButton;
    private JPanel panel;

    public CalculatorView() {
        frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 500);
        frame.setLayout(null);

        textField = new JTextField();
        textField.setBounds(50, 25, 300, 50);
        textField.setFont(new Font("Arial", Font.BOLD, 20));
        textField.setEditable(false);
        frame.setLocationRelativeTo(null);

        numberButtons = new JButton[10];
        for (int i = 0; i < 10; i++) {
            numberButtons[i] = new JButton(String.valueOf(i));
            numberButtons[i].setFont(new Font("Arial", Font.BOLD, 20));
            numberButtons[i].setBackground(Color.WHITE);
            numberButtons[i].setForeground(Color.BLACK);
        }

        operatorButtons = new JButton[4];
        operatorButtons[0] = new JButton("+");
        operatorButtons[1] = new JButton("-");
        operatorButtons[2] = new JButton("*");
        operatorButtons[3] = new JButton("/");

        for (int i = 0; i < 4; i++) {
            operatorButtons[i].setFont(new Font("Arial", Font.BOLD, 20));
            operatorButtons[i].setBackground(Color.GRAY);
            operatorButtons[i].setForeground(Color.WHITE);
        }

        clearButton = new JButton("C"); // Cambiamos el botón "."
        clearButton.setFont(new Font("Arial", Font.BOLD, 20));
        clearButton.setBackground(Color.GRAY);
        clearButton.setForeground(Color.WHITE);

        equalsButton = new JButton("=");
        equalsButton.setFont(new Font("Arial", Font.BOLD, 20));
        equalsButton.setBackground(Color.GRAY);
        equalsButton.setForeground(Color.WHITE);

        panel = new JPanel();
        panel.setBounds(50, 100, 300, 300);
        panel.setLayout(new GridLayout(4, 4, 10, 10));

        panel.add(numberButtons[1]);
        panel.add(numberButtons[2]);
        panel.add(numberButtons[3]);
        panel.add(operatorButtons[0]);
        panel.add(numberButtons[4]);
        panel.add(numberButtons[5]);
        panel.add(numberButtons[6]);
        panel.add(operatorButtons[1]);
        panel.add(numberButtons[7]);
        panel.add(numberButtons[8]);
        panel.add(numberButtons[9]);
        panel.add(operatorButtons[2]);
        panel.add(operatorButtons[3]);
        panel.add(numberButtons[0]);
        panel.add(clearButton); // Agregamos el botón de limpiar pantalla
        panel.add(equalsButton);

        frame.add(panel);
        frame.add(textField);
        frame.setVisible(true);
    }

    public void addNumberButtonListener(ActionListener listener) {
        for (int i = 0; i < 10; i++) {
            numberButtons[i].addActionListener(listener);
        }
    }

    public void addOperatorButtonListener(ActionListener listener) {
        for (int i = 0; i < 4; i++) {
            operatorButtons[i].addActionListener(listener);
        }
    }

    public void addEqualsButtonListener(ActionListener listener) {
        equalsButton.addActionListener(listener);
    }

    public void addClearButtonListener(ActionListener listener) {
        clearButton.addActionListener(listener);
    }

    public void addDeleteButtonListener(ActionListener listener) {
        clearButton.addActionListener(listener); // Corrección aquí
    }

    public String getUserInput() {
        return textField.getText();
    }

    public void setUserInput(String input) {
        textField.setText(input);
    }
}
