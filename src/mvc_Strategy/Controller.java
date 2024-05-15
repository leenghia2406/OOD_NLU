package mvc_Strategy;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller {
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
        initListeners();
    }

    private void initListeners() {
        view.convertBinBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (view.validateInput()) {
                    model.setStrategy(new BinStrategy());
                    String dec = view.inputTxf.getText();
                    String result = model.strategy.convert(dec);
                    view.resTxf.setText(result);
                }else {
                	String result = "You don't number to convert";
                	view.resTxf.setText(result);
                }
            }
        });

        view.convertOctBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (view.validateInput()) {
                    model.setStrategy(new OctStrategy());
                    String dec = view.inputTxf.getText();
                    String result = model.strategy.convert(dec);
                    view.resTxf.setText(result);
                }else {
                	String result = "You don't number to convert";
                	view.resTxf.setText(result);
                }
            }
        });

        view.convertHexBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (view.validateInput()) {
                    model.setStrategy(new HexStrategy());
                    String dec = view.inputTxf.getText();
                    String result = model.strategy.convert(dec);
                    view.resTxf.setText(result.toUpperCase());
                }else {
                	String result = "You don't number to convert";
                	view.resTxf.setText(result);
                }
            }
        });
    }
}
