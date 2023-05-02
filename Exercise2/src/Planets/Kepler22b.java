package Planets;

import Explorers.Explorer;


public class Kepler22b implements Planet{
    @Override
    public void accept(Explorer explorer) {
        explorer.visit(this);

    }
}
