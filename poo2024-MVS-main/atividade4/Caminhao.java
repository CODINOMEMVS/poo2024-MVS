public class Caminhão extends Veículo {
    private double capacidadeCarga;

    public Caminhão(String marca, String modelo, int anoFabricacao, double capacidadeCarga) {
        super(marca, modelo, anoFabricacao);
        this.capacidadeCarga = capacidadeCarga;
    }

    public double getCapacidadeCarga() {
        return capacidadeCarga;
    }

    public void setCapacidadeCarga(double capacidadeCarga) {
        this.capacidadeCarga = capacidadeCarga;
    }

    
    public void acelerar() {
        System.out.println("Caminhão acelerando.");
    }

    
    public void frear() {
        System.out.println("Caminhão freando.");
    }
}
