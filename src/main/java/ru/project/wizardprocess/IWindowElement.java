package ru.project.wizardprocess;

public interface IWindowElement {
    IWindowElement setElementName();
    IWindowElement setElementBounds();
    IWindowElement setElementType();
    IWindowElement setAfterCondition(IWindowChangeCondition condition);
}
