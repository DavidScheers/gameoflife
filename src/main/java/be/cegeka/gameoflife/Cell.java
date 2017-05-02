package be.cegeka.gameoflife;


public class Cell {

    private boolean alive = false;
    private Position position;

    public Cell(boolean alive, Position position) {
        this.alive = alive;
        this.position = position;
    }

    public Cell(Position position) {
        this.position = position;
    }

    public boolean isAlive() {
        return this.alive;
    }

    public Position getPosition() {
        return position;
    }

    public void die() {
        this.alive = false;
    }

    public void revive() {
        this.alive = true;
    }
}
