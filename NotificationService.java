
package Demo;

/**
 *
 * @author ukasha arif
 */

public class NotificationService {
    public void notifyStudent(String studentEmail, String status, String comments) {
        System.out.println("Notification sent to " + studentEmail + ": Proposal " + status + " with feedback - " + comments);
    }
}

