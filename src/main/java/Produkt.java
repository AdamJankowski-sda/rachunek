import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Produkt {

    private PodatekProduktu podatek;
    private Double cena;
    private String nazwa;

    public Double podajCeneBrutto(){
        return cena + cena*LocalDB.getVats().get(podatek);
    }

}
