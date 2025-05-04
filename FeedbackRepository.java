
package Demo;

/**
 *
 * @author ukasha arif
 */
import java.util.ArrayList;
import java.util.List;

public class FeedbackRepository {
    private List<Feedback> feedbackList;

    public FeedbackRepository() {
        this.feedbackList = new ArrayList<>();
    }

    public void storeFeedback(Feedback feedback) {
        feedbackList.add(feedback);
        System.out.println("Feedback stored for Proposal ID: " + feedback.getProposalId());
    }

    public List<Feedback> getAllFeedback() {
        return feedbackList;
    }
}

