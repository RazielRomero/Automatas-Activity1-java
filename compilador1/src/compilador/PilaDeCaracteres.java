package compilador;

import java.util.ArrayList;

public class PilaDeCaracteres {

    private ArrayList<Character> pila;
    private int tope;

    public PilaDeCaracteres(){
        pila = new ArrayList<>();
        tope = -1;
        agregarCaracter('z');
    }

    public boolean vacia(){
        return tope == -1;
    }

    public void agregarCaracter(char c){
        pila.add(c);
        tope++;
    }

    /**
     * ADVERTENCIA: Metodo destructivo.
     * 
     * @return char 
     * @throws NullPointerException
     */
    public char getCaracterDeTope() throws NullPointerException {
        if(vacia()) throw new NullPointerException("La pila esta vacia");
        char c = pila.remove(tope).charValue();
        tope--;
        return c;
    }


    /**
     * ADVERTENCIA : Metodo no destructivo
     * @return char 
     * @throws NullPointerException
     */
    public char verToken() throws NullPointerException{
        if(vacia()) throw new NullPointerException("La pila esta vacia");
        return pila.get(tope).charValue();
    }

}
