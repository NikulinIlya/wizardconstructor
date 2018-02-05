package ru.project.wizardprocess.wizardwindow;

public abstract class WizardWindow implements IWizardWindow {

    private String windowName;

    public String getWindowName() {
        return windowName;
    }

    public void setWindowName(String windowName) {
        this.windowName = windowName;
    }
}
