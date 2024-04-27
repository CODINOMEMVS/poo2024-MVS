public class Ônibus extends Veículo {
    private int capacidadePassageiros;

    public Ônibus(String marca, String modelo, int anoFabricacao, int capacidadePassageiros) {
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
        System.out.println("Ônibus acelerando.");
    }

    public void frear() {
        System.out.println("Ônibus freando.");
    }
}
