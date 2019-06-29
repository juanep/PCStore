package computer;

public class Order {

	private final int idOrden;
    //Init computer array
    private final Computer computers[];
    private static int orderCounter;
    private int computerCounter;
    //Define items limit
    private static final int maxComputers = 10;

    public Order() {
        this.idOrden = ++orderCounter;
        //Init Order
        computers = new Computer[maxComputers];
    }

    public void addComputer(Computer computer) {
        //if computerCounter isn't over the limit
        if (computerCounter < maxComputers) {
            //Add new Computer to computers array
            computers[computerCounter++] = computer;
        }
        else{
            System.out.println("Items can not over the limit: " + maxComputers);
        }
    }

    public void showOrder() {
        System.out.println("Orden #:" + idOrden);
        System.out.println("Computers in order #" + idOrden + ":");
        for (int i = 0; i < computerCounter; i++) {
            System.out.println(computers[i]);
        }
    }
}
