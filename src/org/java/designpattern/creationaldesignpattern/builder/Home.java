package org.java.designpattern.creationaldesignpattern.builder;

public class Home {

    public String floor;
    public String walls;

    @Override
    public String toString() {
        return "Home{" +
                "floor='" + floor + '\'' +
                ", walls='" + walls + '\'' +
                ", terace='" + terace + '\'' +
                '}';
    }

    public String terace;

    public static void main(String[] args) {
        EarthQuakeResistantBuilde builder = new EarthQuakeResistantBuilde();
        Director dir = new Director(builder);
        dir.manageRequiredHomeConstruction();
        Home home = dir.getCompleteObjectofHome();
        System.out.println("home val" + home);
        System.out.println("floor" + home.floor);
    }
}
