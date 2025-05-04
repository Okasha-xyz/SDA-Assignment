
package Demo;

/**
 *
 * @author ukasha arif
 */

public class ProposalService {
    private ProposalRepository proposalRepo;
    private FeedbackService feedbackService;
    private NotificationService notificationService;

    public ProposalService(ProposalRepository proposalRepo, FeedbackService feedbackService, NotificationService notificationService) {
        this.proposalRepo = proposalRepo;
        this.feedbackService = feedbackService;
        this.notificationService = notificationService;
    }

    public boolean reviewProposal(String proposalId, String supervisorId, String feedback, String action) {
        Proposal proposal = proposalRepo.fetchProposal(proposalId);
        if (proposal == null) return false;

        proposalRepo.updateProposalStatus(proposalId, action);
        notificationService.notifyStudent(proposal.getStudentEmail(), action, feedback);
        return true;
    }
}

