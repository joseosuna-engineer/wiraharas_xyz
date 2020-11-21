package xyz.wiraharas.entity;

public class TitularEntity {

    private String name;
    private String lastName;
    private String email;
    private String clientId;
    private String guid;

    public TitularEntity() {
        super();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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
        return "TitularEntity{" + "name=" + name + ", lastName=" + lastName + ", email=" + email + ", clientId=" + clientId + ", guid=" + guid + '}';
    }

}
