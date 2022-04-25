package Q2;

import java.util.ArrayList;
import java.util.List;

/**
 * Question 2
 */
public class SystemLog {
    /** Contains all entries in this system log.
     *  Guaranteed not to be null and to contain only non-null entries.
     */
    private List<LogMessage> messageList;

    /** Removes from the system log all entries whose descriptions properly contain keyword
     *  and returns a list (possibly empty) containing the removed entries.
     *  Postcondition:
     *  - Entries in the returned list properly contain keyword and
     *    are in the order in which they appeared in the system log.
     *  - The remaining entries in the system log do not properly contain keyword and
     *    are in their original order.
     *  - The returned list is empty if no message properly contain keyword.
     */
    public List<LogMessage> removeMessages(String keyword) {
        List<LogMessage> messages = new ArrayList<LogMessage>();
        for (int i = 0; i < messageList.size(); i++) {
            LogMessage msg = messageList.get(i);
            if (msg.containsWord(keyword)) {
                messages.add(messageList.remove(i));
                i--;
            }
        }
        return messages;
    }

    /** IGNORE CODE BELOW (for testing purposes) */
    public SystemLog(List<String> logMessages) {
        messageList = new ArrayList<LogMessage>();
        for (String s: logMessages) {
            messageList.add(new LogMessage(s));
        }
    }

    public String toString() {
        String res = "";
        for (LogMessage msg : messageList) {
            res += msg + "\n";
        }
        return res;
    }

    /*
    public static void main(String[] args) {
        List<String> messages = new ArrayList<String>();
        messages.add("CLIENT3:security alert - repeated login failures");
        messages.add("Webserver:disk offline");
        messages.add("SERVER1:file not found");
        messages.add("SERVER2:read error on disk DSK1");
        messages.add("SERVER1:write error on disk DSK2");
        messages.add("Webserver:error on /dev/disk");
        SystemLog log = new SystemLog(messages);
        System.out.println(log.removeMessages("disk"));
        System.out.println(log);
    }
    */
}
