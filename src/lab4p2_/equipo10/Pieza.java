package lab4p2_.equipo10;

public abstract class Pieza {

    public char rep;
    public int posI, posJ;
    public boolean color;

    public Pieza() {

    }

    public Pieza(char rep, int posI, int posJ, boolean color) {
        this.rep = rep;
        this.posI = posI;
        this.posJ = posJ;
        this.color = color;
    }

    public boolean isColor() {
        return color;
    }

    public void setColor(boolean color) {
        this.color = color;
    }

    public Pieza(char rep) {
        this.rep = rep;
    }


    public int getPosI() {
        return posI;
    }

    public void setPosI(int posI) {
        this.posI = posI;
    }

    public int getPosJ() {
        return posJ;
    }

    public void setPosJ(int posJ) {
        this.posJ = posJ;
    }

    @Override
    public String toString() {
        return "Pieza{" + "posI=" + posI + ", posJ=" + posJ + ", novaPosI=" + ", validarMov=" + '}';
    }

    public abstract boolean Movimiento(int NovaI, int NovaJ, int PosI, int PosJ, Object[][] matriz);//NOVAI - COORDP, NOVAJ - COORDC;

}
