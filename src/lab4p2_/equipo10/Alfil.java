package lab4p2_.equipo10;

public class Alfil extends Pieza {

    public Alfil() {
    }

    public Alfil(char rep, int posI, int posJ, boolean color) {
        super(rep, posI, posJ, color);
    }

    @Override
    public String toString() {
        return super.toString() + " Alfil{" + '}';
    }

    @Override
    public boolean Movimiento(int NovaI, int NovaJ, int PosI, int PosJ, Object[][] matriz) {
        for (int i = 1; i < matriz.length - 1; i++) {
            for (int j = 1; j < matriz[i].length; j++) {
                if ((NovaI < -1 || NovaJ > 10)) {
                    return false;
                } else if (NovaI < -1 || NovaJ > 10) {
                    return false;
                } else {
                    int cont = 0;
                    int a = 1;
                    int b = -1;
                    while (cont == 100) {
                        if ((matriz[PosI = PosI + a][PosJ = PosJ + a]).equals(matriz[NovaI][NovaJ])) {

                            return true;
                        } else if ((matriz[PosI = PosI + a][PosJ = PosJ - b]) == (matriz[NovaI][NovaJ])) {
                            return true;
                        } else if ((matriz[PosI = PosI - b][PosJ = PosJ + a]) == (matriz[NovaI][NovaJ])) {
                            return true;
                        } else if ((matriz[PosI = PosI - b][PosJ = PosJ - b]) == (matriz[NovaI][NovaJ])) {
                            return true;
                        } else {
                            if ((matriz[PosI][PosJ]) instanceof Pieza) {
                                return false;
                            }
                            a = a + 1;
                            b = b - 1;
                            cont = cont + 1;
                        }
                    }

                }
            }
        }
        return false;

    }
}
