public class Main {

    public static void main(String[] args) {

        VeredaGT vereda3000 = new VeredaGT("64JFDSJ", 20, 10);

        //mostramos el nivel de carga
        System.out.println(vereda3000.energyLevel());
        //movemos el vehiculo
        vereda3000.move();
        //mostramos los datos del vehiculo
        System.out.println(vereda3000.status());

        System.out.println("--------------------------");

        //recargamos la carga pasara de ser 20(16 por el movimiento) a 100
        vereda3000.recharge();
        //mostramos los datos del vehiculo
        System.out.println(vereda3000.status());

        System.out.println("--------------------------");

        //movemos el vehiculo
        vereda3000.move();
        //mostramos los datos del vehiculo
        System.out.println(vereda3000.status());




    }

}
