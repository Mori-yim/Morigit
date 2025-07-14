public class MainCompte{
    public static void main(String[] args){
         Compte c1 = new Compte(12345,25000);
        Compte c2 = new Compte(1234,30000);
        //Affichage de c1
        c1.print();
        //Affichageqqqq de c2
        System.out.println(c2.toString());
        //Depot de 5000 a c1
        c1.crediter(5000);
        c1.print();
        //Retrait de 4000 de c2
        c2.debiter(30000);
//        c2.print();
//        c1.transfert(c2);
//        c2.print();
    }
}