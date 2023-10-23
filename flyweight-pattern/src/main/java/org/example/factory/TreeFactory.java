package org.example.factory;

import org.example.flyweight.TreeType;

import java.util.HashMap;
import java.util.Map;

public class TreeFactory {
    private static Map<String, TreeType> treeTypes = new HashMap<>();

    public static TreeType getTreeType(String name, String colour, String texture) {
        var treeKey = name + colour + texture;

        if (!treeTypes.containsKey(treeKey)) {
            treeTypes.put(treeKey, new TreeType(name, colour, texture));
        }

        return treeTypes.get(treeKey);
    }
}
