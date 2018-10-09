import java.util.Random;

public class NightSky {

    private double density;
    private int width;
    private int height;
    private int starsPrinted;
    public NightSky(double density, int width, int height) {
        this.density = density;
        this.width = width;
        this.height = height;
        this.starsPrinted = 0;

    }

    public NightSky(double density) {
        this(density, 20, 10);
    }

    public NightSky(int width, int height) {
        this(0.1, width, height);
    }

    public void printLine() {

        String line = "";
        Random rnd= new Random();
        for (int i = 0; i < this.width; i++) {

            if (rnd.nextDouble() <= this.density) {
                line += "*";
                this.starsPrinted++;
            } else {
                line += " ";
            }

        }
        System.out.println(line);

    }

    public void print() {
        this.starsPrinted = 0;
        for (int i = 0; i < this.height; i++) {
            printLine();
        }
    }

    public int starsInLastPrint() {
        return starsPrinted;
    }
}
