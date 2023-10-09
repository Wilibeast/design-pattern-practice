package org.example.receiver;

public class MacFileSystemReceiver implements FileSystemReceiver{
    @Override
    public void openFile() {
        System.out.println("Opening File on Mac");
    }

    @Override
    public void writeFile() {
        System.out.println("Writing File on Mac");
    }

    @Override
    public void closeFile() {
        System.out.println("Closing File on Mac");
    }
}
