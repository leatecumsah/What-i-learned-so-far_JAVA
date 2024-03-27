package A1;

public class Rennschnecke {
	String name;
    double maximalGeschwindigkeit;
    double weg;

    public Rennschnecke()
    {
        this.name = "Franz";
        this.maximalGeschwindigkeit = 10.0;
        this.weg = 0.0;
    }

    public Rennschnecke(String name)
    {
        this.name = name;
        this.maximalGeschwindigkeit = 10.0;
        this.weg = 0.0;
    }

    public Rennschnecke(String name, double maximalGeschwindigkeit, double weg)
    {
        this.name = name;
        this.maximalGeschwindigkeit = maximalGeschwindigkeit;
        this.weg = weg;
    }

    public void krieche()
    {
        double zufallsStrecke = Math.random() * maximalGeschwindigkeit;
        weg += zufallsStrecke;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }


    public void setMaximalGeschwindigkeit(double maximalGeschwindigkeit)
    {
        this.maximalGeschwindigkeit = maximalGeschwindigkeit;
    }

    public double getsetMaximalGeschwindigkeit()
    {
        return maximalGeschwindigkeit;
    }
    public void setWeg(double weg)
    {
        this.weg = weg;
    }

    public double getWeg()
    {
        return weg;
    }

    public String toString()
    {

        return String.format("Rennschnecke: Name: %s, Maximalgeschwindigkeit: %.1f, Weg: %.1f",
                name, maximalGeschwindigkeit, weg);
    }
}
