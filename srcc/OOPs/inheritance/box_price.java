package OOPs.inheritance;

public class box_price extends box_weight {
    double value = 7;

    box_price() {
        super();
        this.value = -1;
    }


    box_price(box_weight old, double weight) {
        super(old, weight);
        this.value = value;
    }

    box_price(double l, double h, double w, double weight, double value) {
        super(l, h, w, weight);
        this.value = value;
    }


}


//}
