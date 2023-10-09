package org.example.receiver;

public class WindowsFileSystemReceiver implements FileSystemReceiver{
    @Override
    public void openFile() {
        System.out.println("Opening File on Windows");
    }

    @Override
    public void writeFile() {
        System.out.println("Writing File on Windows");
    }

    @Override
    public void closeFile() {
        System.out.println("Closing File on Windows");
    }
}
