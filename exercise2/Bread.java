package burger_shop;

public class Bread {
    private String name;

    static final String rye = "rye bread";
    static final String wheat = "wheat bread";
    static final String white = "white bun";
    static final String pretzel = "pretzel bun";
    static final String onion = "onion bun";

    public Bread(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
