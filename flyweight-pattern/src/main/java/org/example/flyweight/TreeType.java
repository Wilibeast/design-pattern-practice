package org.example.flyweight;

public class TreeType implements Tree {
    private String name;
    private String colour;
    private String texture;

    public TreeType(String name, String colour, String texture) {
        this.name = name;
        this.colour = colour;
        this.texture = texture;
    }

    @Override
    public void render(int xCoordinate, int yCoordinate) {
        System.out.println("Render a " + name + " tree of color " + colour +
                " and texture " + texture + " at coordinates (" + xCoordinate + ", " + yCoordinate + ")");
    }
}
