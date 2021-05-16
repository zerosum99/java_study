package test;

public class TV {
    String color;
    boolean power;
    public int channel = 0;

    public void power() {power = !power;}
    public void channelUp() { ++channel;}
    public void channelDown() {--channel;}

}
