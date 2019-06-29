package computer;

public class Mouse extends Input{

    private final int idMouse;
    private static int mouseCounter;

    //constructor que inicializa las variables
    public Mouse(String inType, String name) {
        super(inType, name);
        idMouse = ++mouseCounter;
    }

    @Override
    public String toString() {
        return "Mouse{" + "idMouse=" + idMouse + ", " + super.toString();
    }
}
