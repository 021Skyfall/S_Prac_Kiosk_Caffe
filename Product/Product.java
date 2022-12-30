package Product;
/*
커피와 티의 공통 정보 저장 = 이름, 가격, id
 */
public abstract class Product {
    private int id;
    private String name;
    private int price;

    public Product(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
    public abstract void applyOption();
    public abstract String getOptionToString();
}
