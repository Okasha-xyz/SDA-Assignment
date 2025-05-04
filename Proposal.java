
package Demo;

/**
 *
 * @author ukasha arif
 */
public class Proposal {
    private String id;
    private String title;
    private String status;
    private String studentEmail;

    public Proposal(String id, String title, String studentEmail) {
        this.id = id;
        this.title = title;
        this.studentEmail = studentEmail;
        this.status = "Pending";
    }

    public String getId() { return id; }
    public String getTitle() { return title; }
    public String getStatus() { return status; }
    public String getStudentEmail() { return studentEmail; }

    public void setStatus(String status) { this.status = status; }
}

