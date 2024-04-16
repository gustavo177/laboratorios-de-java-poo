public class EjemploAutomovilEnum {
    public static void main(String[] args) {
        Automovil.setCapacidadEstanqueEstatico(45);
        Automovil subaru = new Automovil("Subaru", "Impreza");
        subaru.setCilindrada(2.0);
        subaru.setColor(Color.BLANCO);
        subaru.setTipo(TipoAutomovil.HATCHBACK);

        Automovil mazda = new Automovil("Mazda","BT-50",Color.ROJO, 3.0);
        mazda.setTipo(TipoAutomovil.PICKUP);
        System.out.println("mazda.leerFabricante() = " + mazda.getFabricante());

        TipoAutomovil tipo = subaru.getTipo();
        System.out.println("tipo subaru: " + tipo.getNombre());
        System.out.println("tipo desc. subaru: " + tipo.getDescripcion());

        tipo = mazda.getTipo();
//        switch (tipo) {
//            case CONVERTIBLE:
//                System.out.println("El automovil es deportivo y descapotable de dos puertas");
//                break;
//            case COUPE:
//                System.out.println("Es un automovil pequeño de dos puertas y típicamente deportivo");
//                break;
//            case FURGON:
//                System.out.println("Es un automovil utilitario de transporte, de empresas");
//                break;
//            case HATCHBACK:
//                System.out.println("Es un automovil mediano compacto, aspecto deportivo");
//                break;
//            case PICKUP:
//                System.out.println("Es un automovil de doble cabina o camioneta");
//                break;
//            case SEDAN:
//                System.out.println("Es un automovil mediano");
//                break;
//            case  STATION_WAGO:
//                System.out.println("Es un automovil más grande, con maleta grande...");
//                break;
//        }

        // versión de java 13 hacia adelante
        switch (tipo) {
            case CONVERTIBLE ->
                System.out.println("El automovil es deportivo y descapotable de dos puertas");
            case COUPE ->
                System.out.println("Es un automovil pequeño de dos puertas y típicamente deportivo");
            case FURGON ->
                System.out.println("Es un automovil utilitario de transporte, de empresas");
            case HATCHBACK ->
                System.out.println("Es un automovil mediano compacto, aspecto deportivo");
            case PICKUP ->
                System.out.println("Es un automovil de doble cabina o camioneta");
            case SEDAN ->
                System.out.println("Es un automovil mediano");
            case  STATION_WAGO ->
                System.out.println("Es un automovil más grande, con maleta grande...");
        }
    }
}
