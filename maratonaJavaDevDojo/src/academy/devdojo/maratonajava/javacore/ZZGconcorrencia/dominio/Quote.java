package academy.devdojo.maratonajava.javacore.ZZGconcorrencia.dominio;

//Criar orçamento com esses valores: storeName, price, discountCode;
public final class Quote {
    private final String store;
    private final double price;
    private final Discount.Code discountCode;


    private Quote(String store, double price, Discount.Code discountCode) {
        this.store = store;
        this.price = price;
        this.discountCode = discountCode;
    }

    /**
     * Creates new Quote objetc from the value following the patter storeName:price:discountCode
     * @param value containing storeName:price:discountCode
     * @return new Quote with valueas from @param value
     */

    public static Quote newQuote(String value) {
        String[] values = value.split(":");
        return new Quote(values[0], Double.parseDouble(values[1]), Discount.Code.valueOf(values[2]));
    }

    @Override
    public String toString() {
        return "Quote{" +
                "store='" + store + '\'' +
                ", price=" + price +
                ", discountCode=" + discountCode +
                '}';
    }

    public String getStore() {
        return store;
    }

    public double getPrice() {
        return price;
    }

    public Discount.Code getDiscountCode() {
        return discountCode;
    }
}
