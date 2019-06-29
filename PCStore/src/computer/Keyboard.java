package computer;

public class Keyboard extends Input{

	private final int idKeyboard;
    private static int keyboardCounter;

    //constructor que inicializa las variables
    public Keyboard(String inputType, String name) {
        super(inputType, name);
        idKeyboard = ++keyboardCounter;
    }

    @Override
    public String toString() {
        return "Keyboard{" + "idKeyboard=" + idKeyboard + ", " + super.toString();
    }
}
