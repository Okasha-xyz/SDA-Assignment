
package Demo;

/**
 *
 * @author ukasha arif
 */
public class Feedback {
    private String proposalId;
    private String supervisorId;
    private String comments;

    public Feedback(String proposalId, String supervisorId, String comments) {
        this.proposalId = proposalId;
        this.supervisorId = supervisorId;
        this.comments = comments;
    }

    public String getProposalId() { return proposalId; }
    public String getSupervisorId() { return supervisorId; }
    public String getComments() { return comments; }
}

