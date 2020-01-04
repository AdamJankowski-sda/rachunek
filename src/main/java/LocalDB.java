import lombok.Data;

import java.util.HashMap;
import java.util.Map;
@Data
public class LocalDB {

private static Map<PodatekProduktu,Double> vats = new HashMap<>();

public static void init(){
    vats.put(PodatekProduktu.NO_VAT,1.0);
    vats.put(PodatekProduktu.VAT5,0.05);
    vats.put(PodatekProduktu.VAT8,0.08);
    vats.put(PodatekProduktu.VAT23,0.23);
}

public static Map<PodatekProduktu,Double> getVats(){
    return vats;
}

}
