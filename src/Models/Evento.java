package Models;

public class Evento {
    public int Id;
    public int IdVeiculo;
    public int IdUsuario;
    public String Descricao;
    public String Latitude;
    public String Longitude;
    public String Endereco;

    public Evento(int id, int idVeiculo, int idUsuario, String descricao, String latitude, String longitude, String endereco) {
        Id = id;
        IdVeiculo = idVeiculo;
        IdUsuario = idUsuario;
        Descricao = descricao;
        Latitude = latitude;
        Longitude = longitude;
        Endereco = endereco;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public int getIdVeiculo() {
        return IdVeiculo;
    }

    public void setIdVeiculo(int idVeiculo) {
        IdVeiculo = idVeiculo;
    }

    public int getIdUsuario() {
        return IdUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        IdUsuario = idUsuario;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String descricao) {
        Descricao = descricao;
    }

    public String getLatitude() {
        return Latitude;
    }

    public void setLatitude(String latitude) {
        Latitude = latitude;
    }

    public String getLongitude() {
        return Longitude;
    }

    public void setLongitude(String longitude) {
        Longitude = longitude;
    }

    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String endereco) {
        Endereco = endereco;
    }
}
