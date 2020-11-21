package xyz.wiraharas.dto;

public class CuentaDto {

    /**
     * Only the data I want to show
     */
    private String lastDigitsNumber;

    public CuentaDto() {
        super();
    }

    public String getLastDigitsNumber() {
        return lastDigitsNumber;
    }

    public void setLastDigitsNumber(String lastDigitsNumber) {
        this.lastDigitsNumber = lastDigitsNumber;
    }

    @Override
    public String toString() {
        return "CuentaDto{" + "lastDigitsNumber=" + lastDigitsNumber + '}';
    }

}
