package ru.project.wizardprocess;

import ru.project.wizardprocess.wizardwindow.IWizardWindow;

import java.util.List;

public interface IWizardStep {
    IWizardWindow getWindow();
    Boolean Validate();
    IDataInfo getData();
    List<Condition> getPreconditions();
    List<Condition> getPostconditions();

}
