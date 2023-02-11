package lab4p2_.equipo10;

import java.util.Scanner;

public class Lab4P2_Equipo10 {

    static Object[][] matrix = new Object[9][9];
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String comando;
        String jugador;

        System.out.print("Ingrese el nombre del jugador de piezas blancas: ");
        sc = new Scanner(System.in);
        String j1 = sc.nextLine();
        System.out.print("Ingrese el nombre del jugador de piezas negras: ");
        sc = new Scanner(System.in);
        String j2 = sc.nextLine();

        matrix = LlenarMatriz(matrix);
        System.out.println("\n" + Imprimir(matrix));

        jugador = j1;
        System.out.println("Turno de: " + jugador);

        System.out.print("Ingrese la pieza a mover y su destino ->\n[<pieza>|<ubicación actual>-<destino>]: ");//p|a2-a3
        sc = new Scanner(System.in);
        comando = sc.nextLine();

        do {
            String[] coord = comando.split("\\|");

            String[] mov = coord[1].split("-");
            String mov1 = mov[0];//ubicacion actual
            String mov2 = mov[1];//destino

            char pos = mov1.charAt(0);
            int ubic1 = (int) pos - 96;//primera coordenada
            int ubic2 = Integer.parseInt(String.valueOf(mov1.charAt(1)));//segunda coordenada

            pos = mov2.charAt(0);
            int dest1 = (int) pos - 96;
            int dest2 = Integer.parseInt(String.valueOf(mov2.charAt(1)));

            if (jugador.equals(j1)) {//para validar que quiere mover las piezas blancas
                if (((Pieza) matrix[ubic2][ubic1]).isColor() == false) {
                    System.out.println("No puede mover piezas negras");
                    break;
                }
            }

            if (jugador.equals(j2)) {//para validar que quiere mover las piezas negras
                if (((Pieza) matrix[ubic2][ubic1]).isColor() == true) {
                    System.out.println("No puede mover piezas blancas");
                    break;
                }
            }

            Object o = matrix[ubic2][ubic1];

            boolean val;
            if (o instanceof Peon) {
                val = ((Peon) o).Movimiento(ubic2, ubic1, dest2, dest1, matrix);
                System.out.println(val);
                if (val == true) {
                    matrix[dest2][dest1] = matrix[ubic2][ubic1];
                    matrix[ubic2][ubic1] = " ";
                } else {
                    System.out.print("Movimiento no válido\n");
                }
            } else if (o instanceof Caballo) {
                val = ((Caballo) o).Movimiento(ubic2, ubic1, dest2, dest1, matrix);
                if (val) {
                    matrix[dest2][dest1] = matrix[ubic2][ubic1];
                    matrix[ubic2][ubic1] = " ";
                } else {
                    System.out.print("Movimiento no válido\n");
                }
            } else if (o instanceof Alfil) {
                val = ((Alfil) o).Movimiento(ubic2, ubic1, dest2, dest1, matrix);
                if (val) {
                    matrix[dest2][dest1] = matrix[ubic2][ubic1];
                    matrix[ubic2][ubic1] = " ";
                } else {
                    System.out.print("Movimiento no válido\n");
                }
            } else if (o instanceof Torre) {
                val = ((Torre) o).Movimiento(ubic2, ubic1, dest2, dest1, matrix);
                if (val) {
                    matrix[dest2][dest1] = matrix[ubic2][ubic1];
                    matrix[ubic2][ubic1] = " ";
                } else {
                    System.out.print("Movimiento no válido\n");
                }
            } else if (o instanceof Rey) {
                val = ((Rey) o).Movimiento(ubic2, ubic1, dest2, dest1, matrix);
                if (val) {
                    matrix[dest2][dest1] = matrix[ubic2][ubic1];
                    matrix[ubic2][ubic1] = " ";
                } else {
                    System.out.print("Movimiento no válido\n");
                }
            } else if (o instanceof Dama) {
                val = ((Dama) o).Movimiento(ubic2, ubic1, dest2, dest1, matrix);
                if (val) {
                    matrix[dest2][dest1] = matrix[ubic2][ubic1];
                    matrix[ubic2][ubic1] = " ";
                } else {
                    System.out.print("Movimiento no válido\n");
                }
            }

            System.out.println("\n" + Imprimir(matrix));

            jaque(matrix);

            if (jugador.equals(j1)) {
                jugador = j2;
            } else {
                jugador = j1;
            }

            System.out.println("Turno de: " + jugador);
            System.out.print("Ingrese la pieza a mover y su destino\n[<pieza>|<ubicación actual>-<destino>]: ");//p|a2-a3
            sc = new Scanner(System.in);
            comando = sc.nextLine();

        } while (!"gusbai".equals(comando));
    }

    static public Object[][] LlenarMatriz(Object[][] tablero) {
        int pos1 = 0, abc = 65;

        for (int i = 0; i < tablero.length; i++) {//fila
            for (int j = 0; j < tablero[0].length; j++) {//columna
                if (j == 0 && pos1 < 8) {//1-8
                    tablero[i][j] = pos1;
                    pos1++;
                } else if (i == tablero.length - 1 && j > 0) {//A-H
                    tablero[i][j] = (char) abc;
                    abc++;
                } else if (i == 1) {//peones negros
                    Peon p = new Peon('p', i, j, false);
                    tablero[i][j] = p;
                } else if (i == 6) {//peones blancos
                    Peon P = new Peon('P', i, j, true);
                    tablero[i][j] = P;
                } else if (i == 0 && (j == 1 || j == 8)) {//torres negras
                    Torre r = new Torre('r', i, j, false);
                    tablero[i][j] = r;
                } else if (i == 7 && (j == 1 || j == 8)) {//torres blancas
                    Torre R = new Torre('R', i, j, true);
                    tablero[i][j] = R;
                } else if (i == 0 && (j == 2 || j == 7)) {//caballos negros
                    Caballo n = new Caballo('n', i, j, false);
                    tablero[i][j] = n;
                } else if (i == 7 && (j == 2 || j == 7)) {//caballos blancos
                    Caballo N = new Caballo('N', i, j, true);
                    tablero[i][j] = N;
                } else if (i == 0 && (j == 3 || j == 6)) {//alfil negros
                    Alfil b = new Alfil('b', i, j, false);
                    tablero[i][j] = b;
                } else if (i == 7 && (j == 3 || j == 6)) {//alfil blancos
                    Alfil B = new Alfil('B', i, j, true);
                    tablero[i][j] = B;
                } else if (i == 0 && j == 4) {//reina negra
                    Dama q = new Dama('q', i, j, false);
                    tablero[i][j] = q;
                } else if (i == 7 && j == 4) {//reina blanca
                    Dama Q = new Dama('Q', i, j, true);
                    tablero[i][j] = Q;
                } else if (i == 0 && j == 5) {//rey negro
                    Rey k = new Rey('k', i, j, false);
                    tablero[i][j] = k;
                } else if (i == 7 && j == 5) {//rey blanco
                    Rey K = new Rey('K', i, j, true);
                    tablero[i][j] = K;
                } else {
                    tablero[i][j] = " ";
                }
            }
        }
        return tablero;
    }

    static public String Imprimir(Object[][] tablero) {
        String cad = "";
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[0].length; j++) {
                if (j == 0) {
                    cad += tablero[i][j] + " ";
                } else if (i == tablero.length - 1) {
                    cad += " " + tablero[i][j] + " ";
                } else if (tablero[i][j] instanceof Peon) {
                    cad += "[" + ((Peon) tablero[i][j]).rep + "]";
                } else if (tablero[i][j] instanceof Caballo) {
                    cad += "[" + ((Caballo) tablero[i][j]).rep + "]";
                } else if (tablero[i][j] instanceof Alfil) {
                    cad += "[" + ((Alfil) tablero[i][j]).rep + "]";
                } else if (tablero[i][j] instanceof Torre) {
                    cad += "[" + ((Torre) tablero[i][j]).rep + "]";
                } else if (tablero[i][j] instanceof Rey) {
                    cad += "[" + ((Rey) tablero[i][j]).rep + "]";
                } else if (tablero[i][j] instanceof Dama) {
                    cad += "[" + ((Dama) tablero[i][j]).rep + "]";
                } else {
                    cad += "[ ]";
                }
            }
            cad += "\n";
        }
        return cad;
    }

    static public String jaque(Object[][] matriz) {
        String Jaque = "";

        for (int i = 1; i < matriz.length; i++) {
            for (int j = 1; j < matriz[i].length - 1; j++) {
                if (matriz[i][j] instanceof Rey) {
                    int cont = 0, a1 = 1, b1 = -1, a = 1, b = -1, PosI = i, PosJ = j;
                    boolean cadena, tamp;
                    while (cont < 100) {
                        cadena = (((Rey) matriz[PosI][PosJ]).color);
                        if ((matriz[PosI = PosI + a][PosJ = PosJ + a]) != " ") {
                            if (matriz[PosI][PosJ] instanceof Dama) {
                                tamp = (((Dama) matriz[PosI][PosJ]).color);
                                if ((tamp = false) && (cadena = false)) {
                                    Jaque = "Nada";
                                } else {
                                    Jaque = "Jaque";
                                }
                            } else if (matriz[PosI][PosJ] instanceof Alfil) {
                                tamp = (((Alfil) matriz[PosI][PosJ]).color);
                                if ((tamp = false) && (cadena = false)) {
                                    Jaque = "Nada";
                                } else {
                                    Jaque = "Jaque";
                                }
                            } else if (matriz[PosI][PosJ] instanceof Torre) {
                                tamp = (((Torre) matriz[PosI][PosJ]).color);
                                if ((tamp = false) && (cadena = false)) {
                                    Jaque = "Nada";
                                } else {
                                    Jaque = "Jaque";
                                }
                            } else if (matriz[PosI][PosJ] instanceof Caballo) {
                                tamp = (((Caballo) matriz[PosI][PosJ]).color);
                                if ((tamp = false) && (cadena = false)) {
                                    Jaque = "Nada";
                                } else {
                                    Jaque = "Jaque";
                                }
                            } else if (matriz[PosI][PosJ] instanceof Rey) {
                                tamp = (((Rey) matriz[PosI][PosJ]).color);
                                if ((tamp = false) && (cadena = false)) {
                                    Jaque = "Nada";
                                } else {
                                    Jaque = "Jaque";
                                }
                            } else if (matriz[PosI][PosJ] instanceof Peon) {
                                tamp = (((Peon) matriz[PosI][PosJ]).color);
                                if ((tamp = false) && (cadena = false)) {
                                    Jaque = "Nada";
                                } else {
                                    Jaque = "Jaque";
                                }
                            }

                        } else if ((matriz[PosI = PosI + a][PosJ = PosJ - b] != " ")) {
                            if (matriz[PosI][PosJ] instanceof Dama) {
                                tamp = (((Dama) matriz[PosI][PosJ]).color);
                                if ((tamp = false) && (cadena = false)) {
                                    Jaque = "Nada";
                                } else {
                                    Jaque = "Jaque";
                                }
                            } else if (matriz[PosI][PosJ] instanceof Alfil) {
                                tamp = (((Alfil) matriz[PosI][PosJ]).color);
                                if ((tamp = false) && (cadena = false)) {
                                    Jaque = "Nada";
                                } else {
                                    Jaque = "Jaque";
                                }
                            } else if (matriz[PosI][PosJ] instanceof Torre) {
                                tamp = (((Torre) matriz[PosI][PosJ]).color);
                                if ((tamp = false) && (cadena = false)) {
                                    Jaque = "Nada";
                                } else {

                                }
                            } else if (matriz[PosI][PosJ] instanceof Caballo) {
                                tamp = (((Caballo) matriz[PosI][PosJ]).color);
                                if ((tamp = false) && (cadena = false)) {
                                    Jaque = "Nada";
                                } else {
                                    Jaque = "Jaque";
                                }
                            } else if (matriz[PosI][PosJ] instanceof Rey) {
                                tamp = (((Rey) matriz[PosI][PosJ]).color);
                                if ((tamp = false) && (cadena = false)) {
                                    Jaque = "Nada";
                                } else {
                                    Jaque = "Jaque";
                                }
                            } else if (matriz[PosI][PosJ] instanceof Peon) {
                                tamp = (((Peon) matriz[PosI][PosJ]).color);
                                if ((tamp = false) && (cadena = false)) {
                                    Jaque = "Nada";
                                } else {
                                    Jaque = "Jaque";
                                }
                            } else if ((matriz[PosI = PosI - b][PosJ = PosJ + a]) != " ") {
                                if (matriz[PosI][PosJ] instanceof Dama) {
                                    tamp = (((Dama) matriz[PosI][PosJ]).color);
                                    if ((tamp = false) && (cadena = false)) {
                                        Jaque = "Nada";
                                    } else {
                                        Jaque = "Jaque";
                                    }
                                } else if (matriz[PosI][PosJ] instanceof Alfil) {
                                    tamp = (((Alfil) matriz[PosI][PosJ]).color);
                                    if ((tamp = false) && (cadena = false)) {
                                        Jaque = "Nada";
                                    } else {
                                        Jaque = "Jaque";
                                    }
                                } else if (matriz[PosI][PosJ] instanceof Torre) {
                                    tamp = (((Torre) matriz[PosI][PosJ]).color);
                                    if ((tamp = false) && (cadena = false)) {
                                        Jaque = "Nada";
                                    } else {
                                        Jaque = "Jaque";
                                    }
                                } else if (matriz[PosI][PosJ] instanceof Caballo) {
                                    tamp = (((Caballo) matriz[PosI][PosJ]).color);
                                    if ((tamp = false) && (cadena = false)) {
                                        Jaque = "Nada";
                                    } else {
                                        Jaque = "Jaque";
                                    }
                                } else if (matriz[PosI][PosJ] instanceof Rey) {
                                    tamp = (((Rey) matriz[PosI][PosJ]).color);
                                    if ((tamp = false) && (cadena = false)) {
                                        Jaque = "Nada";
                                    } else {
                                        Jaque = "Jaque";
                                    }
                                } else if (matriz[PosI][PosJ] instanceof Peon) {
                                    tamp = (((Peon) matriz[PosI][PosJ]).color);
                                    if ((tamp = false) && (cadena = false)) {
                                        Jaque = "Nada";
                                    } else {
                                        Jaque = "Jaque";
                                    }
                                } else if ((matriz[PosI = PosI - b][PosJ = PosJ - b]) != " ") {
                                    if (matriz[PosI][PosJ] instanceof Dama) {
                                        tamp = (((Dama) matriz[PosI][PosJ]).color);
                                        if ((tamp = false) && (cadena = false)) {
                                            Jaque = "Nada";
                                        } else {
                                            Jaque = "Jaque";
                                        }
                                    } else if (matriz[PosI][PosJ] instanceof Alfil) {
                                        tamp = (((Alfil) matriz[PosI][PosJ]).color);
                                        if ((tamp = false) && (cadena = false)) {
                                            Jaque = "Nada";
                                        } else {
                                            Jaque = "Jaque";
                                        }
                                    } else if (matriz[PosI][PosJ] instanceof Torre) {
                                        tamp = (((Torre) matriz[PosI][PosJ]).color);
                                        if ((tamp = false) && (cadena = false)) {
                                            Jaque = "Nada";
                                        } else {
                                            Jaque = "Jaque";
                                        }
                                    } else if (matriz[PosI][PosJ] instanceof Caballo) {
                                        tamp = (((Caballo) matriz[PosI][PosJ]).color);
                                        if ((tamp = false) && (cadena = false)) {
                                            Jaque = "Nada";
                                        } else {
                                            Jaque = "Jaque";
                                        }
                                    } else if (matriz[PosI][PosJ] instanceof Rey) {
                                        tamp = (((Rey) matriz[PosI][PosJ]).color);
                                        if ((tamp = false) && (cadena = false)) {
                                            Jaque = "Nada";
                                        } else {
                                            Jaque = "Jaque";
                                        }
                                    } else if (matriz[PosI][PosJ] instanceof Peon) {
                                        tamp = (((Peon) matriz[PosI][PosJ]).color);
                                        if ((tamp = false) && (cadena = false)) {
                                            Jaque = "Nada";
                                        } else {
                                            Jaque = "Jaque";
                                        }

                                        a1 = a1 + 1;
                                        b1 = b1 - 1;
                                        a = a + 1;
                                        b = b - 1;
                                        cont = cont + 1;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return Jaque;
    }

}
