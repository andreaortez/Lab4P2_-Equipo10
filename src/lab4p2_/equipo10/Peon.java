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

        for (int i = 1; i < matriz.length - 1; i++) {
            for (int j = 1; j < matriz[i].length; j++) {
                if ((i == NovaI) && (j == NovaJ)) {
                    if (Inicio) {//si no es pieza inicial
                        if ((matriz[PosI + 1][PosJ + 1]).equals(matriz[NovaI][NovaJ])) {
                            return true;
                        } else if ((matriz[PosI - 1][PosJ + 1]).equals(matriz[NovaI][NovaJ])) {
                            return true;
                        }
                    } else {//si es pieza inicial
                        if (matriz[NovaI][NovaJ] == " ") {
                            if ((matriz[PosI][PosJ + 2]).equals(matriz[NovaI][NovaJ])) {
                                return true;
                            } else if ((matriz[PosI][PosJ + 1]).equals(matriz[NovaI][NovaJ])) {
                                return true;
                            }
                        } else {
                            if ((matriz[PosI][PosJ + 1]).equals(matriz[NovaI][NovaJ])) {
                                return true;
                            }
                        }
                    }

                    if (matriz[i][j] == " ") {
                        if (((j != -1 || j != 10)) && ((j != 0 || j != 9))) {
                            return true;
                        } else {
                            return false;
                        }
                    } else {
                        if ((matriz[PosI + 1][PosJ + 1] != " ") || (matriz[PosI - 1][PosJ + 1] != " ")) {
                            return true;
                        }
                        if (matriz[PosI - 1][PosJ - 1] == (matriz[NovaI][NovaI])) {
                        }
                    }
                }
            }
        }
        return false;
    }
}
