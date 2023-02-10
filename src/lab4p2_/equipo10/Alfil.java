package lab4p2_.equipo10;

public class Alfil extends Pieza {

    public Alfil(int posI, int posJ, int novaPosI, int novaPosJ, boolean validarMov) {
        super(posI, posJ, novaPosI, novaPosJ, validarMov);
    }

    public Alfil() {
    }

    @Override
    public String toString() {
        return super.toString() + " Alfil{" + '}';
    }

    @Override
    public boolean Movimiento(int NovaI, int NovaJ, Object [][] matriz) {
        return false;
    }

}
