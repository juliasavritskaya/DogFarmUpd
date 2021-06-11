package by.mnkqn.farm;

public class Aviary {

    private String name;
    private boolean clean;

    public Aviary(String name, boolean clean) {
        this.clean = clean;
        this.name = name;
    }

    public void setClean(boolean clean) {
        this.clean = clean;
    }

    public boolean isClean() {
        return clean;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return getName();
    }
}
