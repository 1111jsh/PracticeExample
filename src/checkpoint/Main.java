package checkpoint;

import checkpoint.discount.BEDiscountCondition;
import checkpoint.discount.CozDiscountCondition;

public class Main {
    public static void main(String[] args) {
        Kiosk kiosk = new Kiosk(new BEDiscountCondition(50));
        kiosk.operate();
    }
}
