package horse.gargath.metricsexample.repository;

public class Foo {
    private int id;
    private String name;

    public Foo() {}

    public Foo (int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "{ \"id\": " + this.id + ", \"name\": \"" + this.name + "\" }";
    }
}