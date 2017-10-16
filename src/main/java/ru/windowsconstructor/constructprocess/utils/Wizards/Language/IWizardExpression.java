package ru.windowsconstructor.constructprocess.utils.Wizards.Language;

import ru.windowsconstructor.constructprocess.utils.Wizards.IWizardStep;

public interface IWizardExpression {
    IWizardExpression WithName(String wizardName);
    IWizardExpressionSteps WithFirstStep(IWizardStep step);
}
