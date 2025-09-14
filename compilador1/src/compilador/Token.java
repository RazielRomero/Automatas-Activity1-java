package compilador;

public class Token {

    private int indiceFile;
    private int indiceComienzo;
    private String token;
    private String tipo;

    public Token(String token, int indiceFile, int indiceComienzo){
        this.token = token;
        this.indiceComienzo = indiceComienzo;
        this.indiceFile = indiceFile;
    }

    public int getIndiceFile() {
        return indiceFile;
    }

    public void setIndiceFile(int indiceFile) {
        this.indiceFile = indiceFile;
    }

    public int getIndiceComienzo() {
        return indiceComienzo;
    }

    public void setIndiceComienzo(int indiceComienzo) {
        this.indiceComienzo = indiceComienzo;
    }

    /**
     * Devuelve que tira es concretamented (ejemplos: if, else, while, +=, double, 3.14, _n, etcetera).
     * @return String 
     */
    public String getToken() {
        return token;
    }

    /**
     * Establece que tira es concretamente (ejemplos: if, else, while, +=, double, 3.14, _n, etcetera).
     * @param String token
     */
    public void setToken(String token) {
        this.token = token;
    }

    /**
     * Regresa si es IDENTIFICADOR, NUMERO_LONG, NUMERO_DOUBLE, IF, ELSE o que token terminal.
     * @return String 
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Define si es IDENTIFICADOR, NUMERO_LONG, NUMERO_DOUBLE, IF, ELSE, o que token ternminal.
     * @param tipo
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    
}

