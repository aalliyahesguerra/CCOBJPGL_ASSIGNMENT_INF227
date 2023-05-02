package Explorers;

import Planets.Mars;
import Planets.Planet;
import Planets.Mercury;
import Planets.Neptune;
import Planets.Saturn;
import Planets.Kepler22b;

public interface Explorer {

    void visit(Mercury mercury);

    void visit(Mars mars);

    void visit(Saturn saturn);

    void visit(Kepler22b kepler22b);

    void visit(Neptune neptune);



    default void visit(Planet planet) {
        System.out.println("Landed on an unknown planet...");
    }
}