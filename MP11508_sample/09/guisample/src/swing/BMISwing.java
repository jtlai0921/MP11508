package swing;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class BMISwing extends JFrame {

    private JTextField heightField;
    private JTextField weightField;
    private JButton button;
    private JLabel resultField;

    public BMISwing() {
        
        heightField = new JTextField(10);
        weightField = new JTextField(10);
        button = new JButton("�p��");
        resultField = new JLabel();

        Panel panel = new Panel();
        panel.setLayout(new GridLayout(0, 1));
        panel.add(new Label("����"));
        panel.add(weightField);
        panel.add(new Label("�魫"));
        panel.add(heightField);
        panel.add(button);
        panel.add(resultField);

        getContentPane().setLayout(new FlowLayout());
        getContentPane().add(panel);

        button.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                double weight = Double
                        .parseDouble(heightField.getText());
                double height = Double
                        .parseDouble(weightField.getText());
                height = height / 100;//cm��m
                double bmi = weight / height / height;
                String result = new DecimalFormat("###.#")
                        .format(bmi);
                resultField.setText("BMI��: " + result);
            }
        });

    }

    public static void main(String[] args) {
        BMISwing frame = new BMISwing();
        frame.setTitle("bmi");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(200, 200);
		frame.setVisible(true);
    }
    
}