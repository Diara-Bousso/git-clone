package sn.diarrabousso.repository.ram;

import sn.diarrabousso.domain.Invitation;
import sn.diarrabousso.domain.Reseau;
import sn.diarrabousso.repository.InvitationRepository;

import java.util.ArrayList;
import java.util.List;

public class ListBasedInvitationRepository implements InvitationRepository {
    private final List<Invitation> invitations;

    public ListBasedInvitationRepository(){
        this.invitations = new ArrayList<Invitation>();
    }

    @Override
    public Invitation[] getAllByReseau(Reseau id_demandeur, Reseau id_demande) {
        //invitations.add(new Invitation(1,3,6,1,"12/01/2021","13/01/2021"));
        return invitations.toArray(new Invitation[0]);
    }

    @Override
    public Invitation FindById_Invitation(int id_invitation) {
        return null;
    }
}
