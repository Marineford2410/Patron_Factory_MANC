package ico.aragon;

public class Samsung implements Mobile{
    private int ramSize;
    private String processor;
    private String name = Mobile.SAMSUNG;
    private int memoria;

    public Samsung(int ramSize, String processor, int memoria) {
        this.ramSize = ramSize;
        this.processor = processor;
        this.memoria = memoria;
    }


    @Override
    public String imprimirCaracteristicas() {
        String valores = "Celular: " + name + "\nRAM: " + ramSize + " GB" 
                + "\nProcesador: " + processor + "\nMemoria: " + memoria + " GB";
        return valores;
    }

}
