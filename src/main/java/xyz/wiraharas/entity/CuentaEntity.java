package xyz.wiraharas.entity;

public class CuentaEntity {

    private String number;
    private String clientId;
    private String guid;

    public CuentaEntity() {
        super();
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    @Override
    public String toString() {
        return "CuentaEntity{" + "number=" + number + ", clientId=" + clientId + ", guid=" + guid + '}';
    }

}
