package model;

public class Package {
    private int idUser;
    private int idProduct;
    private int buyNumber;

    public Package(int idUser, int idProduct, int buyNumber) {
        this.idUser = idUser;
        this.idProduct = idProduct;
        this.buyNumber = buyNumber;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    public int getBuyNumber() {
        return buyNumber;
    }

    public void setBuyNumber(int buyNumber) {
        this.buyNumber = buyNumber;
    }

    @Override
    public String toString() {
        return "Package{" +
                "idUser=" + idUser +
                ", idProduct=" + idProduct +
                ", buyNumber=" + buyNumber +
                '}';
    }
}
