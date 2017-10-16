package ru.windowsconstructor.constructprocess.utils.Wizards;

public interface IWizard {
    String getName();
    IWizardStep getFirstStep();
    IWizardStep GetPrev(IWizardStep step);
    IWizardStep GetNext(IWizardStep step);
    Boolean IsLast(IWizardStep step);

    void NextStep();
}
