package Models;

import java.time.format.DateTimeFormatter;

public class Marca extends Usuario{
    public int IdMarca;
    public String dsMarca;


    public Marca(String username, String latitude, String longitude, int dataAcesso, int idMarca, String dsMarca) {
        super(username, latitude, longitude, dataAcesso);
        IdMarca = idMarca;
        this.dsMarca = dsMarca;
    }

    public Marca(int idMarca, String dsMarca) {
        IdMarca = idMarca;
        this.dsMarca = dsMarca;
    }

    public int getIdMarca() {
        return IdMarca;
    }

    public void setIdMarca(int idMarca) {
        IdMarca = idMarca;
    }

    public String getDsMarca() {
        return dsMarca;
    }

    public void setDsMarca(String dsMarca) {
        this.dsMarca = dsMarca;
    }
}
