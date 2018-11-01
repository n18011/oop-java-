package idcard;
import framework.Product;

public class IDCard extends Product {
    private String owner;
    private Integer number;
    IDCard(Integer number, String owner) {
        System.out.println("カードNo." + number + " " + owner + "のカードを作ります。");
        this.owner = owner;
        this.number = number;
    }
    @Override
    public void use() {
        System.out.println("カードNo." + number + " " + owner + "のカードを使いました");
    }
    public String getOwner() {
        return owner;
    }
    public Integer getNo() {
        return number;
    }
}
