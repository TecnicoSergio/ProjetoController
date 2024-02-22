package Models;

import java.time.format.DateTimeFormatter;

public class Usuario {
    public int Id;
    public String Username;
    public byte[] PasswordHash;
    public byte[] PasswordSalt;
    public byte[] Foto;
    public String Latitude;
    public String Longitude;
    public DateTimeFormatter DataAcesso;

    public String PasswordString;

    public Usuario(int id, String username, byte[] passwordHash, byte[] passwordSalt, byte[] foto, String latitude, String longitude, DateTimeFormatter dataAcesso, String passwordString) {
        Id = id;
        Username = username;
        PasswordHash = passwordHash;
        PasswordSalt = passwordSalt;
        Foto = foto;
        Latitude = latitude;
        Longitude = longitude;
        DataAcesso = dataAcesso;
        PasswordString = passwordString;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public byte[] getPasswordHash() {
        return PasswordHash;
    }

    public void setPasswordHash(byte[] passwordHash) {
        PasswordHash = passwordHash;
    }

    public byte[] getPasswordSalt() {
        return PasswordSalt;
    }

    public void setPasswordSalt(byte[] passwordSalt) {
        PasswordSalt = passwordSalt;
    }

    public byte[] getFoto() {
        return Foto;
    }

    public void setFoto(byte[] foto) {
        Foto = foto;
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

    public DateTimeFormatter getDataAcesso() {
        return DataAcesso;
    }

    public void setDataAcesso(DateTimeFormatter dataAcesso) {
        DataAcesso = dataAcesso;
    }

    public String getPasswordString() {
        return PasswordString;
    }

    public void setPasswordString(String passwordString) {
        PasswordString = passwordString;
    }
}
