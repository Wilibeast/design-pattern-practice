package org.example.model;

public class Coffee {
    private boolean isDoneBrewing = false;

    public void drink() {
        System.out.println(isDoneBrewing ? "mm, yummy" : "eww, disgusting");
    }

    public void setIsDoneBrewing(boolean value) {
        isDoneBrewing = value;
    }

    public boolean isDoneBrewing() {
        return isDoneBrewing;
    }

    public void setDoneBrewing(boolean doneBrewing) {
        isDoneBrewing = doneBrewing;
    }
}
