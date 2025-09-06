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

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    
}

