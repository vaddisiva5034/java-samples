import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.function.DoubleBinaryOperator;

enum Operation {
    ADDITION((x, y) -> x+y),
    SUBTRACTION((x, y) -> x-y),
    DIVISION((x, y) -> x/y),
    MULTIPLICATION((x, y) -> x*y),
    PERCENTAGE((x, y) -> x%y);


    private DoubleBinaryOperator operator;

    Operation(DoubleBinaryOperator operator) {
        this.operator = operator;
    }

    public DoubleBinaryOperator getOperator() {
        return operator;
    }
}

public class Calculator {


    private JButton button1;
    private JPanel hello;

    public Calculator() {


    }

    private class NumberBtnClicked implements ActionListener {

        private String value;

        public NumberBtnClicked(String value) {
            this.value = value;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if(leftOperand == null || leftOperand == 0.0) {
                value = resultsTxt.getText() + value;
            }else{
                rightOperand = Double.valueOf(value);
            }
            resultsTxt.setText(value);

        }
    }

    private class OperationBtnClicked implements ActionListener {

        private Operation operation;

        public OperationBtnClicked(Operation operation) {
            this.operation = operation;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            calcOperation = operation;
            leftOperand = Double.valueOf(resultsTxt.getText());
        }
    }

    private class ClearBtnClicked implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            resultsTxt.setText("");
            leftOperand = 0.0;
            rightOperand = 0.0;
        }
    }

    private class DigitBtnClicked implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            resultsTxt.setText(resultsTxt.getText() + ".");

        }
    }

    private class EqualBtnClicked implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            Double output = calcOperation.getOperator().applyAsDouble(leftOperand, rightOperand);
            resultsTxt.setText(output%1==0?String.valueOf(output.intValue()):String.valueOf(output));
            leftOperand = 0.0;
            rightOperand = 0.0;
        }
    }

    private class SignBtnClicked implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            resultsTxt.setText("-"+ resultsTxt.getText());
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        frame.setContentPane(new Calculator().hello);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}