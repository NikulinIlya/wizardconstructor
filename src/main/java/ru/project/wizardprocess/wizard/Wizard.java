package ru.project.wizardprocess.wizard;

//import ru.project.utils.org.eclipse.core.runtime.Assert;

import org.eclipse.core.runtime.Assert;
import ru.project.wizardprocess.dialog.IDialogSettings;
import ru.project.wizardprocess.wizardwindow.IWizardWindow;
import ru.project.wizardprocess.wizardworkspace.IWizardWorkspace;

import java.util.ArrayList;
import java.util.List;

public abstract class Wizard implements IWizard {

    private IWizardWorkspace workspace = null;
    private List<IWizardWindow> windows = new ArrayList<>();
    private boolean isHelpAvailable = false;
    private String windowTitle = null;
    private IDialogSettings dialogSettings = null;
//    private WizardWindow window;


    protected Wizard() {
        super();
    }

    public void addWindow(IWizardWindow window) {
        windows.add(window);
        window.setWizard(this);
    }

    @Override
    public void addWindows() {

    }

    @Override
    public boolean canFinish() {
        for (IWizardWindow window : windows) {
            if (!window.isWindowComplete()) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void createWindowControls(String fxmlFilePath) {
        // the default behavior is to create all the pages controls
        // page is responsible for ensuring the created control is
        // accessible via getControl.
        windows.forEach(window -> {
            window.createControl(fxmlFilePath);
            Assert.isNotNull(
                    window.getControl(),
                    "getControl() of wizard page returns null. Did you call setControl() in your wizard page?");
        });
    }


}
