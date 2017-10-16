package ru.windowsconstructor.constructprocess.utils.Wizards.Language;

import ru.windowsconstructor.constructprocess.utils.Wizards.Condition;
import ru.windowsconstructor.constructprocess.utils.Wizards.IWizard;
import ru.windowsconstructor.constructprocess.utils.Wizards.IWizardStep;

public interface IWizardExpressionSteps {
    IWizardExpressionSteps Next(IWizardStep step);
    IWizardExpressionSteps Conditional(Condition condition, IWizardStep step);
    IWizardExpressionSteps Conditional(Condition condition, IWizardStep step1, IWizardStep step2);

    IWizard GetWizard();
}
