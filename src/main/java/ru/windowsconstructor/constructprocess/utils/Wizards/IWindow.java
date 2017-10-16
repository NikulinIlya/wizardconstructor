package ru.windowsconstructor.constructprocess.utils.Wizards;

public interface IWindow {
    IWindow makeWindow(String windowName, double length, double width);
    IWindow setWindowBounds(double length, double width);
    //IWindow setWindowID(int windowID);

    //IWindow setBeforeCondition(IWindowChangeCondition condition);
    //IWindow setAfterCondition(IWindowChangeCondition condition);
    IWindow addNextWindow(IWindow nextWindow, IWindowChangeCondition nextWindowCondition);
    IWindow addPrevWindow(IWindow prevWindow, IWindowChangeCondition prevWindowCondition);
    IWindow getNextWindow(IWindow nextWindow);
    IWindow getPrevWindow(IWindow prevWindow);

    IWindow addFunction(IWindowFunction function);
    IWindow addElement(IWindowElement element);
}
