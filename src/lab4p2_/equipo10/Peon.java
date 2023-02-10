package lab4p2_.equipo10;

public class Peon extends Pieza {

    boolean First;

    public Peon() {
    }

    public Peon(int posI, int posJ, boolean validarMov, boolean first) {
        super(posI, posJ, validarMov);
        First = true;
    }


    public static boolean first() {
        return true;
    }

    @Override
    public String toString() {
        return "Peon{" + '}';
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
