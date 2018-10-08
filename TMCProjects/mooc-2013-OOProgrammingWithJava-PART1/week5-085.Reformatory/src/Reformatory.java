public class Reformatory {
    private int numberOfMeasurements=0;

    public int weight(Person person) {
        // return the weight of the person
        this.numberOfMeasurements++;
        return person.getWeight();
    }
    public void feed(Person person){
        person.setWeight(person.getWeight()+1);
    }
    public int totalWeightsMeasured(){
        return this.numberOfMeasurements;
    }

}
