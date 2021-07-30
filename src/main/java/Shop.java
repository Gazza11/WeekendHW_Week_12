import instruments.ISell;

import java.util.ArrayList;

public class Shop {

    private String name;
    private ArrayList<ISell> stock;

    public Shop(String name, ArrayList<ISell> stock) {
        this.name = name;
        this.stock = stock;
    }

    public String getName() {
        return name;
    }

    public ArrayList<ISell> getStock() {
        return stock;
    }

    public Integer getStockSize(){
        return stock.size();
    }

    public void addStock(ISell stock){
        getStock().add(stock);
    }
}
