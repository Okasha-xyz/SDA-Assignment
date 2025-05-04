

package Demo;

public class Main {
    public static void main(String[] args) {
        ProposalRepository proposalRepo = new ProposalRepository();
        FeedbackRepository feedbackRepo = new FeedbackRepository();
        FeedbackService feedbackService = new FeedbackService(feedbackRepo);
        NotificationService notificationService = new NotificationService();
        ProposalService proposalService = new ProposalService(proposalRepo, feedbackService, notificationService);
        SupervisorController controller = new SupervisorController(proposalService);

        Proposal proposal = new Proposal("P101", "isavex", "Okasha Khan");
        proposalRepo.addProposal(proposal);

       
        controller.handleReview("P101", "S001", "Good idea, but clarify scope.", "Revision");
    }
}
