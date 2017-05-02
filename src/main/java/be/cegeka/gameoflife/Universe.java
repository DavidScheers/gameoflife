package be.cegeka.gameoflife;


import java.util.List;

public class Universe {

    private Generation generation;
    private List<List<Cell>> grid;
    private Integer size;

    public Universe(List<List<Cell>> grid, Integer size) {
        this.grid = grid;
        this.size = size;
    }

    public Generation iterate() {

    }

    public List<List<Cell>> render() {

    }
}
