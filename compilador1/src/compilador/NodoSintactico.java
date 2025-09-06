package compilador;

import java.util.ArrayList;

public class NodoSintactico {

    private final String nombre;
    private ArrayList<NodoSintactico> derivados;
    private final Token token;
    private final boolean esTerminal;

    public NodoSintactico(Token token){
        this.nombre = token.getTipo();
        this.token = token;
        derivados = new ArrayList<>();
        esTerminal = true;
    }

    public NodoSintactico(String nombre){
        this.nombre = nombre;
        token = null;
        derivados = new ArrayList<>();
        esTerminal = false;
    }

    public String getNombre() {
        return nombre;
    }

    /**
     * Devuelve todos los derivados
     * @returnArrayList<NodoSintatico>
     */
    public ArrayList<NodoSintactico> getDerivados() {
        return derivados;
    }

    /**
     * Devuelve todos los derivados
     * ADVERTENCIA ES DESTRUCTIVO, es decir, si hay algo antes, lo borra
     * @param derivados
     */
    public void setDerivados(ArrayList<NodoSintactico> derivados) {
        this.derivados = derivados;
    }

    public Token getToken() {
        return token;
    }

    public boolean isEsTerminal() {
        return esTerminal;
    }

    public void agregarDerivados(NodoSintactico derivado){
        derivados.add(derivado);
    }

    public NodoSintactico getDerivado(int index){
        return derivados.get(index);
    }

    /**
     * Dado un nombre retorno un arreglo con todos los NodoSintatico de dicho 
     * nombre que deriven del actual NodoSintactico
     */
    public ArrayList<NodoSintactico> getDerivados(String nombre){
        ArrayList<NodoSintactico> d = new ArrayList<NodoSintactico>();
        for(int i = 0; i < derivados.size(); i++){
            if(derivados.get(i).getNombre().equals(nombre)){
                d.add(derivados.get(i));
            }
        }
        return d;
    }

    public boolean tieneDerivados(){
        return !derivados.isEmpty();
    }
}
