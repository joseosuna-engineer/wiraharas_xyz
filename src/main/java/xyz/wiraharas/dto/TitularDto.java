package xyz.wiraharas.dto;

public class TitularDto {

    /**
     * Only the data I want to show
     */
    private String name;
    private String lastName;

    public TitularDto() {
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

    @Override
    public String toString() {
        return "TitularDto{" + "name=" + name + ", lastName=" + lastName + '}';
    }

}
