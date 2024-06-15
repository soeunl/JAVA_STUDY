package Study06;

public class Dogs {
    String name;
    String type;

    Dogs(String name, String type){
        this.name = name;
        this.type = type;
    }

    public String toString() {
        return type + " " + name;
    }
}
