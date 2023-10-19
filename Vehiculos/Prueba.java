package Vehiculos;

public class Prueba {
    public static void main(String[] args) {
        VehiculoTerrestre camioneta = new VehiculoTerrestre(100, 250);
        System.out.println("Camioneta");
        camioneta.imprimir();
        camioneta.acelerar(50);
        System.out.println("La nueva velocidad actual es = " +camioneta.velocidadActual);

        VehiculoAcuatico motoAcuatica = new VehiculoAcuatico(50,110);
        System.out.println("Moto Acuatica");
        motoAcuatica.imprimir();
        System.out.println("Revoluciones del moto = " +motoAcuatica.calcularRevolucionesMotor(1200, 2));
        motoAcuatica.recomendarVelocidad(20);
    }

}
