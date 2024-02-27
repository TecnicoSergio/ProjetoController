package Models;

import java.time.format.DateTimeFormatter;

public class Veiculo extends Usuario{


    public int IdMarca;
    public String Modelo;
    public ClasseEnum ClasseEnum = Models.ClasseEnum.Toyota;

    public Veiculo(String username, String latitude, String longitude, int dataAcesso, int idMarca, String modelo, Models.ClasseEnum classeEnum) {
        super(username, latitude, longitude, dataAcesso);
        IdMarca = idMarca;
        Modelo = modelo;
        ClasseEnum = classeEnum;
    }

    public Veiculo(int idMarca, String modelo, Models.ClasseEnum classeEnum) {
        IdMarca = idMarca;
        Modelo = modelo;
        ClasseEnum = classeEnum;
    }

    public int getIdMarca() {
        return IdMarca;
    }

    public void setIdMarca(int idMarca) {
        IdMarca = idMarca;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String modelo) {
        Modelo = modelo;
    }

    public Models.ClasseEnum getClasseEnum() {
        return ClasseEnum;
    }

    public void setClasseEnum(Models.ClasseEnum classeEnum) {
        ClasseEnum = classeEnum;
    }
}
