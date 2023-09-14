package OOPs.inheritance;

public class box_weight extends box {
    double weight;
    double side;

    public box_weight(double h, double l, double w, double weight) {
        super(h, l, w);//what is this?
//        this keyword is calling the parent class constructor used to initialize values present in parent class
        this.weight = weight;

    }

    box_weight(double side) {
        this.side = side;
        this.weight = weight;
    }

    public box_weight(box old, double weight) {
        super(old);
        this.weight = weight;
    }


    public box_weight() {

    }
}

