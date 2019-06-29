package computer;

public class Input {

    private String inType;
    private String name;

    //constructor que inicializa las variables
    public Input(String inType, String name) {
        this.inType = inType;
        this.name = name;
    }

    public String getInType() {
        return inType;
    }

    public void setInType(String inType) {
        this.inType = inType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Input{ Name=" + name + ", inType=" + inType + "}";
    }
}
