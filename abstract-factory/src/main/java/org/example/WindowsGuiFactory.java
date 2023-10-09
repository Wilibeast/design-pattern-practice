package org.example;

import org.example.button.Button;
import org.example.button.NormalButton;
import org.example.checkbox.Checkbox;
import org.example.checkbox.WindowsCheckbox;
import org.example.dialog.DesktopDialog;
import org.example.dialog.Dialog;

public class WindowsGuiFactory implements GuiFactory{
    @Override
    public Button createButton() {
        return new NormalButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }

    @Override
    public Dialog createDialog() {
        return new DesktopDialog();
    }
}
