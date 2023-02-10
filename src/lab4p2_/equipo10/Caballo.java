package lab4p2_.equipo10;

public class Caballo extends Pieza {

    public Caballo(char rep, int posI, int posJ) {
        super(rep, posI, posJ);
    }

    public Caballo() {
    }

    @Override
    public String toString() {
        return super.toString() + " Caballo{" + '}';
    }

    @Override
    public boolean Movimiento(int NovaI, int NovaJ, int PosI, int PosJ, Object[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if ((i == NovaI) && (j == NovaJ)) {
                    if ((j - 1 == -1 || j + 1 == 10)) {
                        if (i - 1 == -1 || i + 1 == 10) {
                            if ((matriz[PosI + 1][PosJ + 2]).equals(matriz[NovaI][NovaJ])) {
                                else if (matriz[PosI - 1][PosJ + 2]) == (matriz[NovaI][NovaJ]) {
                                        else if (matriz[PosI - 1][PosJ + 2]) == (matriz[NovaI][NovaJ]) {
//                                        else if matriz[PosI - 1 [PosJ - 2] == matriz[NovaI][NovaJ]
//                                                else if matriz[PosI - 2][PosJ - 1] == matriz[NovaI][NovaJ]{
//                                            else if matriz[PosI + 2PosJ + 1] == matriz[NovaI][NovaJ]
                            }
                        }
                    }
                        }
                        return false;
                    }

                    return false;
                }

            }
