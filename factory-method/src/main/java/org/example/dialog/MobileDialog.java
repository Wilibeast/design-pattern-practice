package org.example.dialog;

import org.example.button.Button;
import org.example.button.MobileButton;

public class MobileDialog extends Dialog{
    @Override
    public Button createButton() {
        return new MobileButton();
    }
}
