package applet;

import java.applet.Applet;
import java.awt.Button;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class BMIApplet extends Applet {

    private TextField heightField;
    private TextField weightField;
    private Button button;
    private Label resultField;

    public void init() {

        heightField = new TextField(10);
        weightField = new TextField(10);
        button = new Button("≠p∫‚");
        resultField = new Label();

        Panel panel = new Panel();
        panel.setLayout(new GridLayout(0, 1));
        panel.add(new Label("®≠∞™"));
        panel.add(weightField);
        panel.add(new Label("≈È≠´"));
        panel.add(heightField);
        panel.add(button);
        panel.add(resultField);
        add(panel);

        button.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                double weight = Double
                        .parseDouble(heightField.getText());
                double height = Double
                        .parseDouble(weightField.getText());
                height = height / 100;//cmÅ®m
                double bmi = weight / height / height;
                String result = new DecimalFormat("###.#")
                        .format(bmi);
                resultField.setText("BMI≠»: " + result);
            }
        });

    }

}