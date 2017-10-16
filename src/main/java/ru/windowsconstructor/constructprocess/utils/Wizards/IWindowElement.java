package ru.windowsconstructor.constructprocess.utils.Wizards;

public interface IWindowElement {
    IWindowElement setElementName();
    IWindowElement setElementBounds();
    IWindowElement setElementType();
    IWindowElement setAfterCondition(IWindowChangeCondition condition);
}
