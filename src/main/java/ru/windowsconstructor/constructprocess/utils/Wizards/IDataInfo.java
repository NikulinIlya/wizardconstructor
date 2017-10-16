package ru.windowsconstructor.constructprocess.utils.Wizards;

public interface IDataInfo {
    IDataAttribute[] getProperties();
    IDataAttribute getAttribute(String name);
    Object GetUnderlyingObject();
}
