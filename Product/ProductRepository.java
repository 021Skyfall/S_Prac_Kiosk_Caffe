package Product;

public class ProductRepository {
    private Product[] products = new Product[]{
            new Coffee(1, "아메리카노", 3000, false),
            new Coffee(2, "카페라떼", 6000, false),
            new Tea(3, "페퍼민트 티", 5500, false),
            new Tea(4, "로즈마리 티", 6000, false)
    };

    public Product[] getProducts() {
        return products;
    }

    public Product findID(int productId) {
        for (Product product : products) {
            if (product.getId() == productId) {
                return product;
            }
        }
        return null;
    }
}
