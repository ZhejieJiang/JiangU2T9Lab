public class RightTriangle {
    private double base;
    private double height;

    public RightTriangle(double base,double height){
        this.base = base;
        this.height = height;}

    public double Hypotenuse(){
        double baseSquared = Math.pow(base,2);
        double heightSquared = Math.pow(height,2);
        return Math.sqrt(baseSquared + heightSquared);}
}


