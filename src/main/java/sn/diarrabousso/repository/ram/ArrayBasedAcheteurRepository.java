package sn.diarrabousso.repository.ram;

import sn.diarrabousso.domain.Acheteur;
import sn.diarrabousso.repository.AcheteurRepository;

public class ArrayBasedAcheteurRepository implements AcheteurRepository {
    public static final Acheteur[] ACHETEURS={
            new Acheteur(1,"CDE-A001","KANE","Massamba","Yoff","+(221)77-234-56-00","mass@gmail.com","PME","Export Fruit"),
            new Acheteur(2,"CDE-A002","LAYE","Zale","Mbao","+(221)77-236-89-89","zale@gmail.com","PME","Export-ZL"),
            new Acheteur(3,"CDE-A003","SOW","Seynabou","Matam","+(221)77-345-64-02","sey-nabou@gmail.com","GIE","GIE-SS"),
            new Acheteur(4,"CDE-A004","FALL","Babacar","Thiés","+(221)77-023-78-12","mbaye@gmail.com","SAS","Export-TTC"),
            //new Acheteur(5,"CDE-A005","NDIAYE","Kalidou","Yarakh","+(221)78-464-06-90","mass@gmail.com","PME","Export-TY"),
            new Acheteur(5,"CDE-A005","NDIAYE","Kalidou","Yarakh","+(221)78-464-06-90","kali@gmail.com","GIE","GIE-MD"),

    };
    public Acheteur[] getAll() {return ACHETEURS;}

    @Override
    public Acheteur getById(int id) {
        Acheteur acheteur;
        for (int i=0;i < ACHETEURS.length;i++){
            if (id == ACHETEURS[i].getId()){
                return ACHETEURS[i];
            }
        }
        return null;
    }


}
