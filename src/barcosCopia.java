public class barcosCopia {
    public static void main(String[]args){
        int[][] tablero;
        tablero=new int[][]{
                {4,4,4,4,0},
                {0,0,0,0,0},
                {0,0,0,0,2},
                {0,0,0,0,2},
                {0,1,0,0,0}
        };

        recorrerTablero(tablero);
    }

    /**
     * Funcion que revisa un tablero
     * @param aux_tablero tablero a revisar
     */
    private static void recorrerTablero(int[][] aux_tablero) {
        for (int i=0;i<aux_tablero.length;i++){
            for (int j=0;j<aux_tablero[i].length;j++){
                if (esNave(aux_tablero[i][j])){
                    mostrarNave(aux_tablero[i][j],i,j);
                }
            }
        }
    }

    /**
     * Funcion que indica que tipo de barco hay en una coordenada
     * @param valorCoordenada valor que se va a analizar
     * @param y coordenada y
     * @param x coordenada x
     */
    private static void mostrarNave(int valorCoordenada, int y,int x) {
            switch (valorCoordenada){
                case 1:
                    System.out.println("Submarino "+y+":"+x);
                    break;

                case 2:
                    System.out.println("Acorazado "+y+":"+x);
                    break;

                case 4:
                    System.out.println("Portaaviones "+y+":"+x);
                    break;

                default:
                    System.out.println("No sé lo que es");
                    break;
            }
    }

    /**
     * Funcion que revisa si en la coordenada hay un barco o no
     * @param valor_coordenada valor que se va a analizar
     * @return true si es un barco, false si no es un barco
     */
    static boolean esNave(int valor_coordenada){
        return valor_coordenada > 0;
    }

}
