package comp1069;

import javax.swing.*;

public class CreateAliens {
    // Create an application that instantiates one Martian and one Jupiterian
    // It must use dynamic method binding

    public static void main(String[] args) {
        CreateAliens createAliens = new CreateAliens();
        createAliens.displayResult();
    }

    private Martian martian;
    private Jupiterian jupiterian;

    public CreateAliens() {
        this.martian = new Martian();
        this.jupiterian = new Jupiterian();
    }

    // Use the toString() method with each object and display the results
    public void displayResult() {
        JOptionPane.showMessageDialog(null,"Martian: " + this.martian.toString());
        JOptionPane.showMessageDialog(null,"Jupiterian: " + this.jupiterian.toString());
    }

}
