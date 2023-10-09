package org.example;

import org.example.button.Button;
import org.example.checkbox.Checkbox;
import org.example.dialog.Dialog;

public interface GuiFactory {
    Button createButton();
    Checkbox createCheckbox();
    Dialog createDialog();
}
