
package sopaletras;


class Tablero {
private String[][] tablero;
static final String letras = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
private int w;
private int h;

    public  void setW(int w) {
       this.w = w;
    }

    public  void setH(int h) {
        this.h = h;
    }

    
 Tablero(int w ,int h){
    this.tablero = new String[w][h];
    setH(h);
    setW(w);
    rellenadoTablero();
}


private void rellenadoTablero(){
    
    for (int j = 0; j < w; j++) {
        for (int i = 0; i < h; i++) {
            int letra = (int) (Math.random()* letras.length());
            tablero[j][i] = letras.substring(letra,letra+1);
        }
    }
}


void mostrarMatriz(){
    for (int i = 0; i <w; i++) {
        for (int j = 0; j <h; j++) {
             System.out.print(tablero[i][j]);
        }
        System.out.println("");
    }
            
  

}
}