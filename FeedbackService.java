
package Demo;

/**
 *
 * @author ukasha arif
 */
public class FeedbackService {
    private FeedbackRepository feedbackRepository;

    public FeedbackService(FeedbackRepository repository) {
        this.feedbackRepository = repository;
    }

    public void saveFeedback(String proposalId, String supervisorId, String comments) {
        Feedback feedback = new Feedback(proposalId, supervisorId, comments);
        feedbackRepository.storeFeedback(feedback);
    }
}
