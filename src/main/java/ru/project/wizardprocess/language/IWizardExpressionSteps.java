package ru.project.wizardprocess.language;

import ru.project.wizardprocess.Condition;
import ru.project.wizardprocess.wizard.IWizard;
import ru.project.wizardprocess.IWizardStep;

public interface IWizardExpressionSteps {
    IWizardExpressionSteps next(IWizardStep step);
    IWizardExpressionSteps Conditional(Condition condition, IWizardStep step);
    IWizardExpressionSteps Conditional(Condition condition, IWizardStep step1, IWizardStep step2);

    IWizard getWizard();
}
