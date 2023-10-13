package org.example.dialog;

import org.example.button.Button;
import org.example.button.LinuxButton;

public class LinuxDialog extends Dialog{
    @Override
    public Button createButton() {
        return new LinuxButton();
    }
}
