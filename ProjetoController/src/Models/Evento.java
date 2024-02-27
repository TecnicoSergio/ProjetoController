package Models;

import java.time.format.DateTimeFormatter;

public class Evento extends Usuario{

    public int IdVeiculo;
    public int IdUsuario;
    public String Descricao;
    public String Latitude;
    public String Longitude;


    public Evento(String username, String latitude, String longitude, int dataAcesso, int idVeiculo, int idUsuario, String descricao, String latitude1, String longitude1) {
        super(username, latitude, longitude, dataAcesso);
        IdVeiculo = idVeiculo;
        IdUsuario = idUsuario;
        Descricao = descricao;
        Latitude = latitude1;
        Longitude = longitude1;
    }

    public Evento(int idVeiculo, int idUsuario, String descricao, String latitude, String longitude) {
        IdVeiculo = idVeiculo;
        IdUsuario = idUsuario;
        Descricao = descricao;
        Latitude = latitude;
        Longitude = longitude;
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

    @Override
    public String getLatitude() {
        return Latitude;
    }

    @Override
    public void setLatitude(String latitude) {
        Latitude = latitude;
    }

    @Override
    public String getLongitude() {
        return Longitude;
    }

    @Override
    public void setLongitude(String longitude) {
        Longitude = longitude;
    }
}
