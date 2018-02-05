package ru.project.wizardprocess;

public interface IDataInfo {
    IDataAttribute[] getProperties();
    IDataAttribute getAttribute(String name);
    Object GetUnderlyingObject();
}
