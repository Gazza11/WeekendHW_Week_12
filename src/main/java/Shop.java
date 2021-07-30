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

    public void addStock(ISell item){
        getStock().add(item);
    }

    public void removeItem(ISell item){
        int idx = findItem(item);
        stock.remove(idx);
    }

    public Integer findItem(ISell item){
        for(int i = 0; i < getStockSize(); i++){
            if(stock.get(i) == item){
                return i;
            }
        }
        return null;
    }

    public Double getPotentialProfit(){
        Double result = 0.;
        for(ISell item : stock){
            result += item.calculateMarkup();
        }
        return result;
    }
}
