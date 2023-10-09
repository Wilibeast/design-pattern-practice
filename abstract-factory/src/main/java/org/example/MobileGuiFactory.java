package org.example;

import org.example.button.Button;
import org.example.button.MobileButton;
import org.example.checkbox.Checkbox;
import org.example.checkbox.NormalCheckbox;
import org.example.dialog.Dialog;
import org.example.dialog.MobileDialog;

public class MobileGuiFactory implements GuiFactory{
    @Override
    public Button createButton() {
        return new MobileButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new NormalCheckbox();
    }

    @Override
    public Dialog createDialog() {
        return new MobileDialog();
    }
}
