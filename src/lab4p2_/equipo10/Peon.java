package lab4p2_.equipo10;

public class Peon extends Pieza {

    public Peon() {
    }

    public Peon(char rep, int posI, int posJ, boolean color) {
        super(rep, posI, posJ, color);
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
        boolean Inicio;
        if (PosI == 2 || PosJ == 6) {
            Inicio = first();
        } else {
        }
        for (int i = 1; i < matriz.length-1; i++) {
            for (int j = 1; j < matriz[i].length; j++) {
                if ((i == NovaI) && (j == NovaJ)) {
                    if (Inicio = true) {
                        return true;
                    } else {
                        return false;
                    }
                }
                if (matriz[i][j] == " ") {
                    if ((j != -1 || j != 10)) {
                        return true;
                    } else {
                        return false;
                    }
                } else {
                    if ((matriz[PosI+1][PosJ+1] != " ")||(matriz[PosI-1][PosJ+1] != " ")) {
                        return true;
                    }
                }
            }

        }
        return false;
    }

}
