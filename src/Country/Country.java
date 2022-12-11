package Country;

public enum Country {
    CANADA("CAD"),
    USA("USD"),
    GERMANY("EUR");
    private String currency;

    Country(String currency) {
        this.currency = currency;
    }

    public String getCurrency(){
        return currency;
    }
}
