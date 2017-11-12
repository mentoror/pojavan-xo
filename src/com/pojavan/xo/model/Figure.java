package com.pojavan.xo.model;

public class Figure {

    private final String value;

    public Figure(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return value;
    }
}
