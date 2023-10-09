package org.example.command;

import org.example.receiver.FileSystemReceiver;

import java.io.File;

public class WriteFileCommand implements Command{
    private FileSystemReceiver fileSystemReceiver;

    public WriteFileCommand(FileSystemReceiver fileSystemReceiver) {
        this.fileSystemReceiver = fileSystemReceiver;
    }
    @Override
    public void execute() {
        fileSystemReceiver.writeFile();
    }
}
