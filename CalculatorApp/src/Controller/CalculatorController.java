package Controller;

import Model.CalculatorModel;
import View.CalculatorView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorController {

    private CalculatorModel model;
    private CalculatorView view;

    public CalculatorController(CalculatorModel model, CalculatorView view) {
        this.model = model;
        this.view = view;

        view.addNumberButtonListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String userInput = view.getUserInput() + e.getActionCommand();
                view.setUserInput(userInput);
            }
        });

        view.addOperatorButtonListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String userInput = view.getUserInput();
                if (!userInput.isEmpty()) {
                    double inputNumber = Double.parseDouble(userInput);
                    model.setNum1(inputNumber);
                    model.setOperator(e.getActionCommand().charAt(0));
                    view.setUserInput("");
                }
            }
        });

        view.addEqualsButtonListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String userInput = view.getUserInput();
                if (!userInput.isEmpty()) {
                    double inputNumber = Double.parseDouble(userInput);
                    model.setNum2(inputNumber);
                    double result = model.performCalculation();
                    view.setUserInput(result % 1 == 0 ? String.valueOf((int) result) : String.format("%.1f", result));

                }
            }
        });

        view.addClearButtonListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                view.setUserInput("");
            }
        });

        view.addDeleteButtonListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String userInput = view.getUserInput();
                if (!userInput.isEmpty()) {
                    userInput = userInput.substring(0, userInput.length() - 1);
                    view.setUserInput(userInput);
                }
            }
        });
    }
}
