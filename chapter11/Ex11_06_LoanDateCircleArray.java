import java.util.ArrayList;
import java.util.Date;

public class Ex11_06_LoanDateCircleArray {
    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>();
        list.add(new Loan());
        list.add(new Date());
        list.add(new Circle());


        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }


    }
}
