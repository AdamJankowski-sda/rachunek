import lombok.AllArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
public class Rachunek {

    private List<Produkt> zakupineProdukty = new ArrayList<>();
    public List<Produkt> getZakupineProdukty() {
        return zakupineProdukty;
    }

    public void addProduct(Produkt p){
        zakupineProdukty.add(p);
    }

    public void wypiszRachunek()
    {
        zakupineProdukty.forEach(item-> System.out.println(item.getNazwa()))    ;
    }
    public Double podsumujRachunekBrutto(){
        return zakupineProdukty.stream().mapToDouble(product->product.getCena()).sum();
    }
    public Double podsumujRachunekNetto(){
        return zakupineProdukty
                .stream()
                .mapToDouble(product->product.getCena()*product.getPodatek().getValue())
                .sum();
    }
    public Double wartoscPodatku(){
        return podsumujRachunekNetto() - podsumujRachunekBrutto();
    }

    public Double wypiszDlaKonkretnegoVAT(PodatekProduktu podatekProduktu)
    {
        return zakupineProdukty
                .stream()
                .mapToDouble(product->product.getCena()*podatekProduktu.getValue())
                .sum();
    }



}
