package CalculatorApplication;

import Controller.CalculatorController;
import Model.CalculatorModel;
import View.CalculatorView;

public class CalculatorApp {

    public static void main(String[] args) {
        // Aquí se crea una instancia del modelo, la vista y el controlador

        CalculatorModel model = new CalculatorModel();
        CalculatorView view = new CalculatorView();
        CalculatorController controller = new CalculatorController(model, view);
    }

}
