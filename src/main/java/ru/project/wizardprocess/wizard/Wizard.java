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
    private boolean forcePreviousAndNextButtons = false;
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
        windows.forEach(window -> {
            window.createControl(fxmlFilePath);
            Assert.isNotNull(
                    window.getControl(),
                    "getControl() of wizard page returns null. Did you call setControl() in your wizard page?");
        });
    }

    @Override
    public void dispose() {
        for (IWizardWindow window : windows) {
            try {
                window.dispose();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    @Override
    public IWizardWorkspace getWorkspace() {
        return workspace;
    }

    @Override
    public IDialogSettings getDialogSettings() {
        return dialogSettings;
    }

    @Override
    public IWizardWindow getNextWindow(IWizardWindow window) {
        int index = windows.indexOf(window);
        if (index == windows.size() - 1 || index == -1) {
            // last page or page not found
            return null;
        }
        return windows.get(index + 1);
    }

    @Override
    public IWizardWindow getWindow(String name) {
        for (IWizardWindow window : windows) {
            String windowName = window.getName();
            if (windowName.equals(name)) {
                return window;
            }
        }
        return null;
    }

    @Override
    public int getWindowsCount() {
        return windows.size();
    }

    @Override
    public IWizardWindow[] getWindows() {
        return windows.toArray(new IWizardWindow[windows.size()]);
    }

    @Override
    public IWizardWindow getPreviousWindow(IWizardWindow window) {
        int index = windows.indexOf(window);
        if (index == 0 || index == -1) {
            return null;
        }
        return windows.get(index - 1);
    }

//    @Override
//    public Shell getShell() {
//        if (container == null) {
//            return null;
//        }
//        return container.getShell();
//    }

    @Override
    public IWizardWindow getStartingWindow() {
        if (windows.size() == 0) {
            return null;
        }
        return windows.get(0);
    }

    @Override
    public String getWindowTitle() {
        return windowTitle;
    }

    @Override
    public boolean isHelpAvailable() {
        return isHelpAvailable;
    }

    @Override
    public boolean needsPreviousAndNextButtons() {
        return forcePreviousAndNextButtons || windows.size() > 1;
    }

    @Override
    public boolean performCancel() {
        return true;
    }

    @Override
    public abstract boolean performFinish();

    @Override
    public void setWorkspace(IWizardWorkspace wizardWorkspace) {
        workspace = wizardWorkspace;
    }

    public void setDialogSettings(IDialogSettings settings) {
        dialogSettings = settings;
    }

    public void setForcePreviousAndNextButtons(boolean b) {
        forcePreviousAndNextButtons = b;
    }

    public void setHelpAvailable(boolean b) {
        isHelpAvailable = b;
    }

    public void setWindowTitle(String newTitle) {
        windowTitle = newTitle;
        if (workspace != null) {
            workspace.updateWindowTitle();
        }
    }
}
