public class Pojo {
    private String name ;

    public Pojo(String name) {
        super();
        this.name = name;
    }

    public Pojo() {
        super();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Pojo [name=" + name + "]";
    }
    
}
