package com.silverlink.javafxproperties;

import javafx.beans.property.*;

public class OurProperty {

    private DoubleProperty property;

    public final double getProperty() {
        if(property != null)
            return property.get();
        return 0;
    }

    public final void setProperty(double property) {
        this.propertyProperty().set(property);
    }

    public final DoubleProperty propertyProperty(){
       if(property == null){
           property = new SimpleDoubleProperty(0);
       }
       return property;
    }
}
