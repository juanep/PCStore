package computer;

//Creación de la Clase
public class Monitor {
	//Declaración de variables
    private final int idMonitor;
    private String name;
    private double size;
    private static int monitorCounter;

    private Monitor(){
         idMonitor = ++monitorCounter;
   }
    
    //Constructor que inicializa las variables
    public Monitor(String name, double size) {
        this();
        this.name = name;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
      public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    //Método que concatena las variables y regresa una cadena
    @Override
    public String toString() {
        return "Monitor{" + " idMonitor=" + idMonitor + ", name=" + name + ", size=" + size + '}';
    }
}
