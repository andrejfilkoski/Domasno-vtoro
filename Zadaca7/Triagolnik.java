public class Triagolnik {

    double strana1;
    double strana2;
    double strana3;

    public Triagolnik(double strana1, double strana2, double strana3) {
        this.strana1 = strana1;
        this.strana2 = strana2;
        this.strana3 = strana3;
    }

    public double Plostina(){
        double p = (strana1 + strana2 + strana3) / 2;
        return Math.sqrt(p*(p-strana1)*(p-strana2)*(p-strana3));
    }

    public double Perimetar(){
        return strana1+strana2+strana3;
    }
}
