package org.example;

import org.example.command.CloseFileCommand;
import org.example.command.OpenFileCommand;
import org.example.receiver.FileSystemReceiver;
import org.example.receiver.WindowsFileSystemReceiver;

public class Main {
    public static void main(String[] args) {
        FileSystemReceiver fileSystemReceiver = new WindowsFileSystemReceiver();

        var openFileCommand = new OpenFileCommand(fileSystemReceiver);
        var fileInvoker = new FileInvoker(openFileCommand);

        fileInvoker.execute();

        var closeFileCommand = new CloseFileCommand(fileSystemReceiver);
        fileInvoker = new FileInvoker(closeFileCommand);

        fileInvoker.execute();
    }
}