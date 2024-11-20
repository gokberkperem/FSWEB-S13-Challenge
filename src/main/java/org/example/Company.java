package org.example;

public class Company {
    private int id;
    private String name;
    private double giro;
    private String[] developerNames;

    public Company(int id, String name, double giro, int developerCount) {
        this.id = id;
        this.name = name;
        this.giro = Math.max(giro, 0); // Negative check
        this.developerNames = new String[developerCount]; // Dizi boyutu
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGiro() {
        return giro;
    }

    public void setGiro(double giro) {
        this.giro = Math.max(giro, 0);
    }

    public String[] getDeveloperNames() {
        return developerNames;
    }

    public void addEmployee(int index, String name) {
        if (index < 0 || index >= developerNames.length) {
            System.out.println("Invalid index: " + index);
        } else if (developerNames[index] == null) {
            developerNames[index] = name;
        } else {
            System.out.println("Index " + index + " is already filled.");
        }
    }

    @Override
    public String toString() {
        return "Company{id=" + id + ", name='" + name + "', giro=" + giro + '}';
    }
}
