package org.example;

import org.example.factory.TreeFactory;

public class Main {
    public static void main(String[] args) {
        int[][] treeCoordinates = {{10, 20}, {50, 40}, {70, 80}, {10, 20}, {50, 40}, {70, 80}, {10, 20},
                {50, 40}, {70, 80}, {10, 20}, {50, 40}, {70, 80}};

        for (var coordinates : treeCoordinates) {
            var randomNumber = Math.random() * 100;
            var treeType = randomNumber >= 50
                    ? TreeFactory.getTreeType("Pine", "Green", "pine_texture")
                    : TreeFactory.getTreeType("Oak", "Brown", "oak_texture");

            treeType.render(coordinates[0], coordinates[1]);
        }
    }
}