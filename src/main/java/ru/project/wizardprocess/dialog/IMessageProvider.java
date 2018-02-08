package ru.project.wizardprocess.dialog;

public interface IMessageProvider {

    int NONE = 0;
    int INFORMATION = 1;
    int WARNING = 2;
    int ERROR = 3;
    String getMessage();
    int getMessageType();
}
