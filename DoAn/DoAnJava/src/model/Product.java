package model;

public class Product {
    private int id;
    private Character character;
    private Condition condition;
    private String name;
    private String image;
    private Storage storage;
    private long priceOld;
    private long priceSale;
    private String saleNumber;
    private Color color;
    private int collection;

    public Product(int id, Character character, Condition condition, String name, String image, Storage storage, long priceOld, long priceSale, String saleNumber, Color color, int collection) {
        this.id = id;
        this.character = character;
        this.condition = condition;
        this.name = name;
        this.image = image;
        this.storage = storage;
        this.priceOld = priceOld;
        this.priceSale = priceSale;
        this.saleNumber = saleNumber;
        this.color = color;
        this.collection = collection;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Character getCharacter() {
        return character;
    }

    public void setCharacter(Character character) {
        this.character = character;
    }

    public Condition getCondition() {
        return condition;
    }

    public void setCondition(Condition condition) {
        this.condition = condition;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Storage getStorage() {
        return storage;
    }

    public void setStorage(Storage storage) {
        this.storage = storage;
    }

    public long getPriceOld() {
        return priceOld;
    }

    public void setPriceOld(long priceOld) {
        this.priceOld = priceOld;
    }

    public long getPriceSale() {
        return priceSale;
    }

    public void setPriceSale(long priceSale) {
        this.priceSale = priceSale;
    }

    public String getSaleNumber() {
        return saleNumber;
    }

    public void setSaleNumber(String saleNumber) {
        this.saleNumber = saleNumber;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getCollection() {
        return collection;
    }

    public void setCollection(int collection) {
        this.collection = collection;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", character=" + character +
                ", condition=" + condition +
                ", name='" + name + '\'' +
                ", image='" + image + '\'' +
                ", storage=" + storage +
                ", priceOld=" + priceOld +
                ", priceSale=" + priceSale +
                ", saleNumber='" + saleNumber + '\'' +
                ", color=" + color +
                ", collection=" + collection +
                '}';
    }
}
