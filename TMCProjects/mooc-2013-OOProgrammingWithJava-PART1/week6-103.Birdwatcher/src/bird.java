public class bird {
    public String name;
    public String LatinName;
    private int observation = 0;


    public void observe () {
        observation++;
    }

    public bird (String name, String LatinName){
        this.name = name;
        this.LatinName=LatinName;
    }
    public String getName() {
        return name;
    }

    public String toString() {
        return name+" ("+LatinName+"): "+observation+" observations";
    }
}
