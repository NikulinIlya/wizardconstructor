package ru.windowsconstructor.constructprocess.utils.Wizards;

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
