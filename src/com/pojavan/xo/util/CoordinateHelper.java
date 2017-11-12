package com.pojavan.xo.util;

public class CoordinateHelper {

    private static final int FIELD_SIZE = 3;
    private static final int MIN_COORDINATE = 0;

    public static boolean checkCoordinate(int coordinate) {
        if (coordinate < MIN_COORDINATE || coordinate >= FIELD_SIZE)
            return false;
        return true;
    }

}
