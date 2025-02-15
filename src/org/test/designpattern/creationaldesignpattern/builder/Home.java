package org.java.designpattern.creationaldesignpattern.builder;

public class Home {

    public String floor;
    public String walls;
    public String terace;
    @Override
    public String toString() {
        return "Home{" +
                "floor='" + floor + '\'' +
                ", walls='" + walls + '\'' +
                ", terace='" + terace + '\'' +
                '}';
    }



    public static void main(String[] args) {
        EarthQuakeResistantBuilder builder = new EarthQuakeResistantBuilder();
        Director dir = new Director(builder);
        dir.manageRequiredHomeConstruction();
        Home home = dir.getCompleteObjectofHome();
        System.out.println("home val" + home);
        System.out.println("floor" + home.floor);
    }
}
