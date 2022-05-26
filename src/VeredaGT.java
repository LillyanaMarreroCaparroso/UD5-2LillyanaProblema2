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
        System.out.println("Carga actual: ");
        return energ;
    }

    @Override
    public void recharge() {
        this.energy = MAX_ENERGY;
        System.out.println("Bateria recargada");
    }

    @Override
    public void move() {
        if (energy == 0) {
            System.out.println("El vehiculo no tiene carga en la bateria, por lo que no se puede mover ");
        } else {
            this.energy = energy - energyDelta;
            movementCount++;
            System.out.println("El vehículo se esta moviendo");
        }
    }

    @Override
    public String status() {
        return "El vehiculo " + this.matricula +
                " \nTiene un nivel de carga de: " + this.energy +
                "\nSe ha movido " + this.movementCount + " veces";
    }
}
