/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author anna
 */import java.util.Objects;

public class ModelData {
    private String year;
    private int numberOfRetirees;

    public ModelData(String year, int numberOfRetirees) {
        this.year = year;
        this.numberOfRetirees = numberOfRetirees;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public int getNumberOfRetirees() {
        return numberOfRetirees;
    }

    public void setNumberOfRetirees(int numberOfRetirees) {
        this.numberOfRetirees = numberOfRetirees;
    }

    // Implementing equals and hashCode for proper comparison
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ModelData modelData = (ModelData) o;
        return numberOfRetirees == modelData.numberOfRetirees &&
                Objects.equals(year, modelData.year);
    }

    @Override
    public int hashCode() {
        return Objects.hash(year, numberOfRetirees);
    }
}
