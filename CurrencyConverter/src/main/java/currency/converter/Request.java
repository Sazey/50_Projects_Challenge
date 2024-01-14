package currency.converter;

public class Request {
    private String base_currency;
    private String quote_curency;
    private float amount;

    public Request() {
    }

    public Request(String base_currency, String quote_curency, float amount) {
        this.base_currency = base_currency;
        this.quote_curency = quote_curency;
        this.amount = amount;
    }
}
