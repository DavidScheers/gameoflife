package be.cegeka.gameoflife;


import java.util.Map;

public class Generation {

    private Map<Position, Cell> generation;

    public Generation(Map<Position, Cell> initialGeneration) {
        this.generation = initialGeneration;
    }
}
