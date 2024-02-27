package Models;

import java.time.format.DateTimeFormatter;

public class Cep extends Usuario{

    public float CEP;
    public String RUA;
    public String COMPLEMENTO;
    public String BAIRRO;
    public String CIDADE;
    public String ESTADO;


    public Cep(String username, String latitude, String longitude, int dataAcesso, float CEP, String RUA, String COMPLEMENTO, String BAIRRO, String CIDADE, String ESTADO) {
        super(username, latitude, longitude, dataAcesso);
        this.CEP = CEP;
        this.RUA = RUA;
        this.COMPLEMENTO = COMPLEMENTO;
        this.BAIRRO = BAIRRO;
        this.CIDADE = CIDADE;
        this.ESTADO = ESTADO;
    }

    public Cep(float CEP, String RUA, String COMPLEMENTO, String BAIRRO, String CIDADE, String ESTADO) {
        this.CEP = CEP;
        this.RUA = RUA;
        this.COMPLEMENTO = COMPLEMENTO;
        this.BAIRRO = BAIRRO;
        this.CIDADE = CIDADE;
        this.ESTADO = ESTADO;
    }

    public float getCEP() {
        return CEP;
    }

    public void setCEP(float CEP) {
        this.CEP = CEP;
    }

    public String getRUA() {
        return RUA;
    }

    public void setRUA(String RUA) {
        this.RUA = RUA;
    }

    public String getCOMPLEMENTO() {
        return COMPLEMENTO;
    }

    public void setCOMPLEMENTO(String COMPLEMENTO) {
        this.COMPLEMENTO = COMPLEMENTO;
    }

    public String getBAIRRO() {
        return BAIRRO;
    }

    public void setBAIRRO(String BAIRRO) {
        this.BAIRRO = BAIRRO;
    }

    public String getCIDADE() {
        return CIDADE;
    }

    public void setCIDADE(String CIDADE) {
        this.CIDADE = CIDADE;
    }

    public String getESTADO() {
        return ESTADO;
    }

    public void setESTADO(String ESTADO) {
        this.ESTADO = ESTADO;
    }
}
