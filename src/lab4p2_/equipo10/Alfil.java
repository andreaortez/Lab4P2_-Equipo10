package lab4p2_.equipo10;

import static lab4p2_.equipo10.Peon.first;

public class Alfil extends Pieza {

    public Alfil(char rep, int posI, int posJ, boolean validarMov) {
        super(rep, posI, posJ, validarMov);
    }



    public Alfil() {
    }

    @Override
    public String toString() {
        return super.toString() + " Alfil{" + '}';
    }

    @Override
    public boolean Movimiento(int NovaI, int NovaJ, int PosI, int PosJ, Object[][] matriz) {
        boolean Movvalid;
        boolean Inicio;
        if (PosI==2||PosJ==6) {
            Inicio = first();
        }else{
            Inicio = first();
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if ((i == NovaI) && (j == NovaJ)) {
                    if (Inicio== true) {
                        
                    }else{
                        
                    }
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
