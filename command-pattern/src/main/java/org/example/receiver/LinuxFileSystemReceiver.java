package org.example.receiver;

public class LinuxFileSystemReceiver implements FileSystemReceiver{
    @Override
    public void openFile() {
        System.out.println("Opening File on Linux");
    }

    @Override
    public void writeFile() {
        System.out.println("Writing File on Linux");
    }

    @Override
    public void closeFile() {
        System.out.println("Closing File on Linux");
    }
}
