package lab4p2_.equipo10;

public class Peon extends Pieza {

    public Peon() {
    }

    public Peon(char rep, int posI, int posJ, boolean color) {
        super(rep, posI, posJ, color);
    }

    @Override
    public String toString() {
        return "Peon{" + '}';
    }

    @Override
    public boolean Movimiento(int NovaI, int NovaJ, int PosI, int PosJ, Object[][] matriz) {
        boolean Inicio = false;
        if (PosI == 2 || PosJ == 6) {
            Inicio = true;
        }

        if (matriz[NovaI][NovaJ] == " ") {
            if (Inicio) {//si no es pieza inicial
                if ((matriz[PosI - 1][PosJ]).equals(matriz[NovaI][NovaJ])) {//peon blanco
                    return true;
                } else if ((matriz[PosI + 1][PosJ]).equals(matriz[NovaI][NovaJ])) {//peon negro
                    return true;
                }
            }

            if ((matriz[PosI + 2][PosJ]).equals(matriz[NovaI][NovaJ])) {//si es pieza inicial negra
                return true;
            } else if ((matriz[PosI + 1][PosJ]).equals(matriz[NovaI][NovaJ])) {
                return true;
            } else if ((matriz[PosI - 2][PosJ]).equals(matriz[NovaI][NovaJ])) {//si es pieza inicial blanca
                return true;
            } else if ((matriz[PosI - 1][PosJ]).equals(matriz[NovaI][NovaJ])) {
                return true;
            }
        } else {
            return false;
        }

        if (((NovaI == 0 || NovaI == 9)) && ((NovaJ == 0 || NovaJ == 9))) {
            return false;
        } else {
            if ((matriz[PosI + 1][PosJ + 1] != " ") || (matriz[PosI - 1][PosJ + 1] != " ")) {
                return true;
            }
            if (matriz[PosI - 1][PosJ - 1] == (matriz[NovaI][NovaI])) {
            }
        }

        return false;
    }
}
