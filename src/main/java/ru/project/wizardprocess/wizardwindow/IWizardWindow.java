package ru.project.wizardprocess.wizardwindow;

import ru.project.wizardprocess.IWindowChangeCondition;
import ru.project.wizardprocess.IWindowElement;
import ru.project.wizardprocess.IWindowFunction;
import ru.project.wizardprocess.wizard.IWizard;

public interface IWizardWindow {

    boolean canFlipToNextWindow();
    String getWindowName();
    IWizardWindow getNextWindow();
    IWizardWindow getPreviousWindow();
    IWizard getWizard();
    boolean isWindowComplete();
    void setPreviousWindow();
    void setWizard();


//    IWizardWindow makeWindow(String windowName, double length, double width);
//    IWizardWindow setWindowBounds(double length, double width);
//    IWizardWindow setWindowID(int windowID);
//
//    IWizardWindow setBeforeCondition(IWindowChangeCondition condition);
//    IWizardWindow setAfterCondition(IWindowChangeCondition condition);
//    IWizardWindow addNextWindow(IWizardWindow nextWindow, IWindowChangeCondition nextWindowCondition);
//    IWizardWindow addPrevWindow(IWizardWindow prevWindow, IWindowChangeCondition prevWindowCondition);
//    IWizardWindow getNextWindow(IWizardWindow nextWindow);
//    IWizardWindow getPrevWindow(IWizardWindow prevWindow);
//
//    IWizardWindow addFunction(IWindowFunction function);
//    IWizardWindow addElement(IWindowElement element);
}
