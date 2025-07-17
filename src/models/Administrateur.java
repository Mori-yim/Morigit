package models;

public class Administrateur extends  Personnel{

    private  static  final int prime=500;
    public Administrateur(String nom, String prenom, int age, String matricule, double salaireDeBase) {
        super(nom, prenom, age, matricule, salaireDeBase);
    }

    @Override
    public double calculerSalaire() {
        return salaireDeBase+prime;
    }
    public void afficherContrat() {
        System.out.println("Administrateur, Salaire: " + calculerSalaire());
    }
}
