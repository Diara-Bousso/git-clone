package sn.diarrabousso.repository;

import sn.diarrabousso.domain.Invitation;
import sn.diarrabousso.domain.Reseau;

public interface InvitationRepository {
    Invitation[] getAllByReseau(Reseau id_demandeur,Reseau id_demande);
    Invitation FindById_Invitation(int id_invitation);
}
