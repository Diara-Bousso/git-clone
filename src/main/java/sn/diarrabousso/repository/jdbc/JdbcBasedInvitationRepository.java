package sn.diarrabousso.repository.jdbc;

import sn.diarrabousso.domain.Invitation;
import sn.diarrabousso.domain.Reseau;
import sn.diarrabousso.repository.InvitationRepository;

public class JdbcBasedInvitationRepository implements InvitationRepository {
    public Invitation[] getAllByReseau(Reseau id_demandeur, Reseau id_demande) {
        return new Invitation[0];
    }

    public Invitation FindById_Invitation(int id_invitation) {
        return null;
    }
}
