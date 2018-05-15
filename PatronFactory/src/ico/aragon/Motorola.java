/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.aragon;

/**
 *
 * @author makin
 */
public class Motorola implements Mobile{
    private int ramSize;
    private String processor;
    private int memoria;
    private int camara;

    public Motorola(int ramSize, String processor, int memoria, int camara) {
        this.ramSize = ramSize;
        this.processor = processor;
        this.memoria = memoria;
        this.camara = camara;
    }

    @Override
    public String imprimirCaracteristicas() {
        String valores = "Celular: Motorola" + "\nRAM: " + ramSize + " GB" + 
                "\nProcesador: " + processor + "\nMemoria: " + memoria + " GB"; 
        return valores;
    }

}
