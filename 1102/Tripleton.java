import java.util.List;
import java.util.ArrayList;
public class Tripleton {
    private static Tripleton[] tripleton = {new Tripleton(), new Tripleton(), new Tripleton()};
    private static int i = 0;
    private Tripleton() {
        System.out.println("インスタンスを生成しました。");
    }
    public static Tripleton getInstance() {
        i = i % 3;
        return tripleton[i++];
    }
    static void p() {
        System.out.println("インスタンス =>" + tripleton[i]);
    }
}
