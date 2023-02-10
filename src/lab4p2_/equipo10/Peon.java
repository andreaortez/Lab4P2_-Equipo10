package lab4p2_.equipo10;

public class Peon extends Pieza {



    public Peon() {
    }

    public Peon(char rep, int posI, int posJ) {
        super(rep, posI, posJ);
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
        if (PosI == 2 || PosJ == 6) {
            Inicio = first();
        } else {
            Inicio = first();
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if ((i == NovaI) && (j == NovaJ)) {
                    if (Inicio == true) {
                        return true;
                    } else {
                        return false;
                    }
                } else if ((j - 1 == -1 || j + 1 == 10)) {
                    if (matriz[i][j] != " ") {
                        return true;
                    }else{
                        return false;
                    }
                } else if (i - 1 == -1 || i + 1 == 10) {
                                        
                        return true;
                    }else{
                        return false;
                    }
                } else if (matriz[i][j] == " ") {
                    return true;
                } else {
                    return false;
                }
            }
        }
        return false;
    }
}
}if (matriz[i][j] == " ") {
 if (matriz[i][j] != " ") {