package ru.windowsconstructor.constructprocess.utils.Wizards;

import java.util.List;

public interface IWizardStep {
    IWindow getWindow();
    Boolean Validate();
    IDataInfo getData();
    List<Condition> getPreconditions();
    List<Condition> getPostconditions();

}
