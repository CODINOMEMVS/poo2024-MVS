public class Carro extends Veículo {
    private int capacidadePassageiros;

    public Carro(String marca, String modelo, int anoFabricacao, int capacidadePassageiros) {
        super(marca, modelo, anoFabricacao);
        this.capacidadePassageiros = capacidadePassageiros;
    }

    public int getCapacidadePassageiros() {
        return capacidadePassageiros;
    }

    public void setCapacidadePassageiros(int capacidadePassageiros) {
        this.capacidadePassageiros = capacidadePassageiros;
    }

    
    public void acelerar() {
        System.out.println("Carro acelerando.");
    }

    
    public void frear() {
        System.out.println("Carro freando.");
    }
}