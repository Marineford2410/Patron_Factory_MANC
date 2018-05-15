package ico.aragon;

public class Sony implements Mobile{
    private int ramSize;
    private String processor;
    private int memoria;
    private int camara;

    public Sony(int ramSize, String processor, int memoria, int camara) {
        this.ramSize = ramSize;
        this.processor = processor;
        this.memoria = memoria;
        this.camara = camara;
    }

    @Override
    public String imprimirCaracteristicas() {
        String valores = "Celular: Sony" + "\nRAM: " + ramSize + " GB" 
                + "\nProcesador: " + processor + "\nMemoria: " + memoria + " GB";    
        return valores;
    }

}
