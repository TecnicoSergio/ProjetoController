package Models;

public class Cep {
    public int Id;
    public int CEP;
    public String RUA;
    public String COMPLEMENTO;
    public String BAIRRO;
    public String CIDADE;
    public String ESTADO;
    public int FRETE;

    public Cep(int id, int CEP, String RUA, String COMPLEMENTO, String BAIRRO, String CIDADE, String ESTADO, int FRETE) {
        Id = id;
        this.CEP = CEP;
        this.RUA = RUA;
        this.COMPLEMENTO = COMPLEMENTO;
        this.BAIRRO = BAIRRO;
        this.CIDADE = CIDADE;
        this.ESTADO = ESTADO;
        this.FRETE = FRETE;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public int getCEP() {
        return CEP;
    }

    public void setCEP(int CEP) {
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

    public int getFRETE() {
        return FRETE;
    }

    public void setFRETE(int FRETE) {
        this.FRETE = FRETE;
    }
}
