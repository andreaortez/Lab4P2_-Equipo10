
package lab4p2_.equipo10;

public abstract class Pieza {
    public char rep;
    public int posI, posJ; 

    
    
    public Pieza() {
        
    }

    public Pieza(char rep, int posI, int posJ) {
        this.rep = rep;
        this.posI = posI;
        this.posJ = posJ;

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
        return "Pieza{" + "posI=" + posI + ", posJ=" + posJ + ", novaPosI=" + ", validarMov="  + '}';
    }    
    
    public abstract boolean Movimiento(int NovaI, int NovaJ, int PosI, int PosJ, Object [][] matriz);//NOVAI - COORDP, NOVAJ - COORDC;
        
}
