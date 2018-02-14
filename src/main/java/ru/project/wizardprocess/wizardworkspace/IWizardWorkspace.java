package ru.project.wizardprocess.wizardworkspace;

import ru.project.wizardprocess.wizardwindow.IWizardWindow;

public interface IWizardWorkspace {
    IWizardWindow getCurrentPage();
    void showPage(IWizardWindow window);
    void updateButtons();
    void updateMessage();
    void updateTitleBar();
    void updateWindowTitle();
}
