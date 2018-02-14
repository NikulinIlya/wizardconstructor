package ru.project.wizardprocess.dialog;

import javafx.scene.control.Control;

public abstract class DialogWindow implements IDialogWindow, IMessageProvider {

    private Control control;
    private String title = null;
    private String description = null;
    private String message = null;
    private int messageType = NONE;
    private String errorMessage = null;
    protected DialogWindow() {
        //No initial behaviour
    }

    protected DialogWindow(String title) {
        this.title = title;
    }

    @Override
    public void dispose() {

    }

    @Override
    public Control getControl() {
        return control;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public String getErrorMessage() {
        return errorMessage;
    }

    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public int getMessageType() {
        return messageType;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Deprecated
    protected final String getToolTipText(int widgetId) {
        return null;
    }

    protected boolean isControlCreated() {
        return control != null;
    }

    @Override
    public void performHelp() {
        //No default help
    }

    protected void setControl(Control newControl) {
        control = newControl;
    }

    @Override
    public void setDescription(String description) {
        this.description = description;
    }

    public void setErrorMessage(String newMessage) {
        errorMessage = newMessage;
    }

    public void setMessage(String newMessage) {
        setMessage(newMessage, NONE);
    }

    public void setMessage(String newMessage, int newType) {
        message = newMessage;
        messageType = newType;
    }

    @Override
    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public void setVisible(boolean visible) {
        control.setVisible(visible);
    }
}
