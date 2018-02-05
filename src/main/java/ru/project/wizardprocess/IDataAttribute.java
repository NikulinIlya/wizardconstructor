package ru.project.wizardprocess;

import java.lang.reflect.Type;

public interface IDataAttribute {
    String getName();
    Object getValue();
    //T getValueAs<T>();
    Type getType();
    Boolean isComputable();
    Boolean CanSetValue();
    void setValue(Object object);
}
