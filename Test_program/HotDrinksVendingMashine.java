package javaTasks.Test_program;

import java.util.ArrayList;
import java.util.List;

public class HotDrinksVendingMashine  implements VendingMashine{
    List<Product> productList = new ArrayList<>();
    public void addHotDrinks(HotDrinks hotDrinks){
        productList.add(hotDrinks);
    }

    @Override
    public void InitProduct(List<Product> list) { productList = list; }

    @Override
    public Product getProduct(String name) {
        for (Product i: productList){
            if (i.getName().equals(name)) {
                return i;
            }
        }
        return null;
    }
}
