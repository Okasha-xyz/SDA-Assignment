
package Demo;

/**
 *
 * @author ukasha arif
 */

public class SupervisorController {
    private ProposalService proposalService;

    public SupervisorController(ProposalService proposalService) {
        this.proposalService = proposalService;
    }

    public void handleReview(String proposalId, String supervisorId, String feedback, String action) {
        boolean result = proposalService.reviewProposal(proposalId, supervisorId, feedback, action);
        if (result) {
            System.out.println("Review submitted successfully.");
        } else {
            System.out.println("Review failed. Proposal not found.");
        }
    }
}

