package es.project;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    private int prdId;
    private String prdName;

    public void display() {
        System.out.println("ProductId: "+prdId+" "+"ProductName: "+prdName);
    }

}