package starcraft;

abstract class Unit {
    int x,y;
    abstract void move(int x, int y);
    void stop() {}
}
