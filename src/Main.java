import models.Infirmier;
import models.Medecin;
import models.Patient;
import models.Personnel;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Patient[] tabPatient = new Patient[5];
        tabPatient[0] = new Patient("Morj","junior",18,"N005","cholera");
        tabPatient[1] = new Patient("Maio","julio",8,"N0009","grippe");

        Personnel[] tabPersonnel = new Personnel[5];

         tabPersonnel[0] = new Medecin("Docti","Martin",50,"18S95678","Gynecologie");
         tabPersonnel[1] = new Medecin("Doco","Marthe",57,"18S95678","Chirugie");
         tabPersonnel[2] = new Medecin("Alain","Marc",40,"18S95690","Ophtamologie");

         tabPersonnel[3] = new Infirmier("Mrinh","Stella",36,"20S78994","Maternite");
         tabPersonnel[4] = new Infirmier("Mrinh","Stella",36,"20S78994","Maternite");



        for(int i=0;i<tabPersonnel.length;i++){
           tabPersonnel[i].afficherInfos();
       }

       for(int i=0;i<tabPatient.length;i++){
           tabPatient[i].afficherInfos();
       }



    }
}