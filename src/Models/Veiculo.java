package Models;

public class Veiculo {

    public int Id;
    public int IdMarca;
    public String Modelo;
    public ClasseEnum ClasseEnum = Models.ClasseEnum.Toyota;

    public Veiculo(int id, int idMarca, String modelo, Models.ClasseEnum classeEnum) {
        Id = id;
        IdMarca = idMarca;
        Modelo = modelo;
        ClasseEnum = classeEnum;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
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
