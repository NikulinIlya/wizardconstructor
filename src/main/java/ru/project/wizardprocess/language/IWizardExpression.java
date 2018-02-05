package ru.project.wizardprocess.language;

import ru.project.wizardprocess.IWizardStep;

public interface IWizardExpression {
    IWizardExpression withName(String wizardName);
    IWizardExpressionSteps withFirstStep(IWizardStep step);
}
