package fit.ssr.imccalc.models;

public class Person {
    private double height;
    private double weight;
    private double imc;

    public Person() {
        super();
    }

    public Person(double altura, double peso, double imc) {
        this.height = altura;
        this.weight = peso;
        this.imc = imc;
    }

    @Override
    public String toString() {
        return String.format("[%s]", this.imc);
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getImc() {
        return imc;
    }

    public void setImc(double imc) {
        this.imc = imc;
    }

    
}
