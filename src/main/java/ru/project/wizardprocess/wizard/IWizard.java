package ru.project.wizardprocess.wizard;

import ru.project.wizardprocess.IWizardStep;
import ru.project.wizardprocess.dialog.IDialogSettings;
import ru.project.wizardprocess.wizardwindow.IWizardWindow;
import ru.project.wizardprocess.wizardworkspace.IWizardWorkspace;

import java.util.ArrayList;

public interface IWizard {

    void addWindows();
    boolean canFinish();
    void createWindowControls(String fxmlFilePath);
    IWizardWindow getStartingWindow(IWizardWindow window);
    IWizardWindow getNextWindow(IWizardWindow window);
    IWizardWindow getPreviousWindow(IWizardWindow window);
    IWizardWindow getWindow(String windowName);
    IDialogSettings getDialogSettings();
    String getWizardName();
    int getWindowsCount();
    ArrayList<IWizardWindow> getWIndowsArrayList();
    String getWindowTitle();
    boolean isHelpAvailable();
    boolean needsPreviousAndNextButtons();
    boolean performCancel();
    boolean performFinish();
    IWizardWorkspace getWorkspace();
    void setWorkspace(IWizardWorkspace wizardWorkspace);


//    IWizardStep getFirstStep();
//    IWizardStep getPrevStep(IWizardStep step);
//    IWizardStep getNextStep(IWizardStep step);
//    Boolean isLast(IWizardStep step);
//
//    void NextStep();
}
