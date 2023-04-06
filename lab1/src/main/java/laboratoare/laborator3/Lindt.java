package main.java.laboratoare.laborator3;
public class Lindt extends CandyBox{
    private float lungime;
    private float latime;
    private float inaltime;
    public Lindt(){
    }
    public Lindt(String flavor, String origin, float lungime, float latime, float inaltime){
        super(flavor, origin);
        this.lungime = lungime;
        this.latime = latime;
        this.inaltime = inaltime;
    }
//        super();
//        this.flavor = flavor;
//        this.origin = origin;

    @Override
    public float getVolume(){
        return lungime * latime * inaltime;
    }

    @Override
    public String toString(){
        return "Lindt{" +
                "lungime=" + lungime +
                ", latime=" + latime +
                ", inaltime=" + inaltime +
                ", flavor='" + flavor + '\'' +
                ", origin='" + origin + '\'' +
                '}';
    }


}
