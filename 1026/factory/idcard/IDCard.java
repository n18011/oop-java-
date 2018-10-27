package idcard;
import framework.Product;

public class IDCard extends Product {
    private String owner;
    IDCard(String owner) {
        System.out.println(owner + "のカードを作ります。");
        this.owner = owner;
    }
    @Override
    public void use() {
        System.out.println(owner + "のカードを使いました");
    }
    public String getOwner() {
        return owner;
    }
}
