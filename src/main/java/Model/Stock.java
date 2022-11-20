package Model;

import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

//TODO Fazer uma classe propria para o cavalo

public class Stock {

    String name;
    Double marcketValue = 0.0;
    Double avgCust = 0.0;
    Double totalPrice = 0.0;
    Double moneyEarned = 0.0;
    int stockQtd = 0;
    Document doc;

    public void criarStock(String name) throws IOException {

        this.setName(name);
        this.setDoc(Jsoup.connect("https://www.google.com/finance/quote/" + this.getName() + ":BVMF").get());
        this.setMarcketValue(getDoc());

    }
    
    public String dayRange() {
        return getDoc().getElementsByClass("P6K39c").get(1).text();
    }
    
    public String percentVariance() {
        return getDoc().getElementsByClass("JwB6zf").get(17).text();
    }

    // Metodos especiais
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name.toUpperCase();
    }

    public Document getDoc() {
        return doc;
    }

    public void setDoc(Document doc) throws IOException {
        this.doc = doc;
    }

    public Double getAvgCust() {
        return avgCust;
    }

    public void setAvgCust(Double avgCust, int stockQtd) {
        this.avgCust = avgCust / stockQtd;
    }

    public int getStockQtd() {
        return stockQtd;
    }

    public void setStockQtd(int stockQtd) {
        this.stockQtd = stockQtd;
    }

    public Double getMarcketValue() {
        return marcketValue;
    }

    public void setMarcketValue(Document doc) {
        this.marcketValue = Double.parseDouble(doc.getElementsByClass("YMlKec fxKbKc").text().replace("R$", ""));
    }

    public Double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Double marcketValue, int stockQtd) {
        this.totalPrice = marcketValue * stockQtd;
    }

    public Double getMoneyEarned() {
        return moneyEarned;
    }

    public void setMoneyEarned(Double moneyEarned) {
        this.moneyEarned = moneyEarned;
    }

}
