
package lab4p2_.equipo10;

public class Torre extends Pieza{

    public Torre(char rep, int posI, int posJ, boolean validarMov) {
        super(rep, posI, posJ, validarMov);
    }

   
    
    public Torre() {
    }

    @Override
    public String toString() {
        return super.toString()+" Torre{" + '}';
    }
    
    @Override
    public boolean Movimiento(int NovaI, int NovaJ, int PosI, int PosJ, Object[][] matriz) {
        boolean Movvalid;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if ((i == NovaI) && (j == NovaJ)) {
                    if ((j - 1 == -1 || j + 1 == 10)) {
                        if (i - 1 == -1 || i + 1 == 10) {
                            } else if (matriz[i][j] == " ") {
                                Movvalid = true;
                            } else {
                                Movvalid = false;
                            }
                        }
                    }
                    Movvalid = false;
                }
            }
        return false;    }

}
