package com.github.surzia.command.codec.automation;

// A Simple remote control with one button
public class SimpleRemoteControl {

    Command slot;  // only one button

    public SimpleRemoteControl() {
    }

    public void setCommand(Command command) {
        // set the command the remote will
        // execute
        slot = command;
    }

    public void buttonWasPressed() {
        slot.execute();
    }
}
