
package Demo;

/**
 *
 * @author ukasha arif
 */
import java.util.HashMap;

public class ProposalRepository {
    private static HashMap<String, Proposal> proposals = new HashMap<>();

    public Proposal fetchProposal(String proposalId) {
        return proposals.get(proposalId);
    }

    public void updateProposalStatus(String proposalId, String status) {
        Proposal proposal = proposals.get(proposalId);
        if (proposal != null) {
            proposal.setStatus(status);
        }
    }

    public void addProposal(Proposal proposal) {
        proposals.put(proposal.getId(), proposal);
    }
}
