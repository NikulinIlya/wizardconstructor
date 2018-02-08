package ru.project.wizardprocess.dialog;

import javafx.scene.control.Control;

public interface IDialogWindow {

    void createControl(String fxmlFilePath);
    void dispose();
    Control getControl();
    String getDescription();
    String getErrorMessage();
    String getMessage();
    String getTitle();
    void performHelp();
    void setDescription(String description);
    void setTitle(String title);
    void setVisible(boolean visible);
}
