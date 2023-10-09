package org.example;

import org.example.model.Subscription;

import javax.swing.*;
import java.awt.*;

public class UI {
    private Subscription subscription;

    private static JTextField textField = new JTextField();

    public UI(Subscription subscription) {
        this.subscription = subscription;
    }

    public void init() {
        var frame = new JFrame("Test Subscriptions");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        var context = new JPanel();
        context.setLayout(new BoxLayout(context, BoxLayout.Y_AXIS));
        frame.getContentPane().add(context);

        var buttons = new JPanel(new FlowLayout(FlowLayout.CENTER));
        context.add(textField);
        context.add(buttons);

        textField.setText("Not currently subscribed");

        var subscribe = new JButton("Subscribe");
        subscribe.addActionListener(e -> {
            try {
                textField.setText(subscription.getState().onSubscribe());
            } catch (Exception ex) {
                textField.setText(ex.getMessage());
            }
        });

        var cancel = new JButton("Cancel");
        cancel.addActionListener(e -> {
            try {
                textField.setText(subscription.getState().onCancel());
            } catch (Exception ex) {
                textField.setText(ex.getMessage());
            }
        });


        frame.setVisible(true);
        frame.setSize(300, 100);

        buttons.add(subscribe);
        buttons.add(cancel);
    }
}
