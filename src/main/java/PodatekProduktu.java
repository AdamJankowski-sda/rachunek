public enum PodatekProduktu {
    VAT8(.08),
    VAT23(.23),
    VAT5(.05),
    NO_VAT(1.0);

    private Double value;

    PodatekProduktu(double value)
    {
        this.value = value;
    }
    public Double getValue(){
        return this.value;
    }

}
