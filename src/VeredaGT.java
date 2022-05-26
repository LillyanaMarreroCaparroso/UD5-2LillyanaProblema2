public class VeredaGT implements Vehicle {


    public final int MAX_ENERGY = 100;
    public String matricula;
    public int energy;
    public int movementCount;
    public int energyDelta;

    public VeredaGT(String matricula, int energy, int energyDelta) {
        this.matricula = matricula;
        this.energy = energy; //carga actual
        this.movementCount = 0; //num de movimientos
        this.energyDelta = energyDelta; //num que representa la energia que pierde
                                        //en cada movimiento
    }

    @Override
    public float energyLevel() {
        float energ = (float)this.energy;
        return energ;
    }

    @Override
    public void recharge() {
        this.energy = MAX_ENERGY;
    }

    @Override
    public void move() {
        if (energy == 0) {
            System.out.println("El vehiculo no tiene carga en la bateria ");
        } else {
            this.energy = energy - energyDelta;
            movementCount++;
            System.out.println("El vehículo se esta moviendo");
        }
    }

    @Override
    public String status() {
        String out;
        return out = "El vehiculo " + matricula +
                "tiene un nivel de carga de: " + energy +
                "y se ha movido " + movementCount + " veces";
    }
}
