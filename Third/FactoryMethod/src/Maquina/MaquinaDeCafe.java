package Maquina;

public class MaquinaDeCafe extends MaquinaDeBebidas{
    @Override
    public Bebida entregaBebida() {
        return new Cafe();
    }

}
