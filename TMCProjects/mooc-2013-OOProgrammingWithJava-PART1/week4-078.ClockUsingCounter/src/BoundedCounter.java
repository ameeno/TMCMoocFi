public class BoundedCounter {

    private int value;
    private int upperBound;

    public BoundedCounter(int upperBound) {
        this.value = 0;
        this.upperBound = upperBound;
    }

    public void next() {
        this.value++;
        if (this.value > this.upperBound) {
            this.value = 0;
        }
    }

    public String toString() {
        if (this.value < 10) {
            return "0" + this.value;
        }
        return "" + this.value;
    }

    public int getValue() {
        // write here code that returns the value
        return this.value;
    }
    public void setValue(int valuein){ if(valuein>0 && valuein <=this.upperBound)this.value = valuein;}
}
