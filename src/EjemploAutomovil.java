import java.util.Date;

public class EjemploAutomovil {
    public static void main(String[] args) {
        Automovil subaru = new Automovil("Subaru","Impreza");
        subaru.setCilindrada(2.0);
        subaru.setColor(Color.BLANCO);
        
        Automovil mazda = new Automovil("Mazda","BT-50",Color.ROJO, 3.0);
        System.out.println("mazda.leerFabricante() = " + mazda.getFabricante());

        Automovil nissan = new Automovil("Nissan", "Navara", Color.GRIS, 3.5, 50);
        Automovil nissan2 = new Automovil("Nissan", "Navara", Color.GRIS, 3.5, 50);

        Automovil auto = new Automovil();
        Date fecha = new Date();


        System.out.println("son iguales? " + (nissan == nissan));
        System.out.println("son iguales con equals? " + (nissan.equals(nissan2)));
        System.out.println(subaru.verDetalle());
        System.out.println(mazda.verDetalle());
        System.out.println(nissan.verDetalle());

        System.out.println(auto.equals(fecha));

        System.out.println(subaru.acelerar(3000));
        System.out.println(subaru.frenar());
        System.out.println(nissan);
        System.out.println(nissan.toString());

        System.out.println(mazda.acelerarFrenar(4000));

        System.out.println("Kilómetros por litro: " + subaru.calcularConsumo(300, 0.6f));
        System.out.println("Kilómetros por litro: " + subaru.calcularConsumo(300, 60));
        System.out.println("Kilómetros por litro: " + nissan.calcularConsumo(300, 60));
    }
}
