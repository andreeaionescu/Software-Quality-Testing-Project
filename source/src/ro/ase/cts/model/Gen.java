package ro.ase.cts.model;

/**
 * Created by Andreea-Ionescu on 5/31/2016.
 */
public enum Gen {
    masculin ("MASCULIN"),
    feminin ("FEMININ"),
    neutru ("NEUTRU");

    private final String gen;

    private Gen(String s) {
        gen = s;
    }

    public boolean equalsName(String altGen) {
        return (altGen == null) ? false : gen.equals(altGen);
    }

    public String toString() {
        return this.gen;
    }
}
