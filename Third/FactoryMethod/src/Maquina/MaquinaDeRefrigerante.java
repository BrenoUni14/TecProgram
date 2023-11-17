package Maquina;

public class MaquinaDeRefrigerante extends MaquinaDeBebidas{
    @Override
    public Bebida entregaBebida() {
        return new Refrigerante();
    }
}
