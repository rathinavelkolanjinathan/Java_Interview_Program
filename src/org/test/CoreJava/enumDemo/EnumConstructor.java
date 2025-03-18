package org.test.CoreJava.enumDemo;

public enum EnumConstructor {

    EAST(0), WEST(180), NORTH(120), SOUTH(190);

    private int angle;

    public int getAngle() {
        return angle;
    }

    private EnumConstructor(final int angle) {

        this.angle = angle;
    }
}
