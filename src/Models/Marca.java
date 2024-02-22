package Models;

public class Marca {
    public int IdMarca;
    public String dsMarca;

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
