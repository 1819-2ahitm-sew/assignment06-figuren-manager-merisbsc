class Ellipse extends Figure{

    double mainAxis;
    double secondAxis;
    double area = area();
    double circumfence = circumfence();

    public Ellipse(double mainAxis, double secondAxis) {
        this.mainAxis = mainAxis;
        this.secondAxis = secondAxis;
    }

    @Override
    public double area() {
        return Math.PI * mainAxis * secondAxis;
    }

    @Override
    public double circumfence() {
        return Math.PI * (mainAxis + secondAxis) * ( 1 + 3 *((mainAxis - secondAxis) / (mainAxis + secondAxis) * (mainAxis - secondAxis) / (mainAxis + secondAxis)) / (10 + Math.sqrt(4 - 3 * ((mainAxis - secondAxis) / (mainAxis + secondAxis) * (mainAxis - secondAxis) / (mainAxis + secondAxis)))));
    }

    @Override
    public String output() {
        return "Rechteck mit Hauptachse " + this.mainAxis + " und Nebenachse " + this.secondAxis + ":\nFläche > " + area() + "\nUmfang > " + circumfence();
    }

}