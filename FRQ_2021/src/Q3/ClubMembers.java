package Q3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Question 3.
 */
public class ClubMembers
{
    private ArrayList<MemberInfo> memberList;
    /** Adds new club members to memberList, as described in part (a).
     * Precondition: names is a non-empty array.
     */
    public void addMembers(String[] names, int gradYear) {
        /* to be implemented in part (a) */
    }
    /** Removes members who have graduated and returns a list of members who have graduated
     * and are in good standing, as described in part (b).
     */
    public ArrayList<MemberInfo> removeMembers(int year) {
        /* to be implemented in part (b) */
        return null;
    }

    // There may be instance variables, constructors, and methods that are not shown.
    public ClubMembers(List<MemberInfo> memberInfoList) {
        memberList = new ArrayList<>();
        memberList.addAll(memberInfoList);
    }

    public ClubMembers() {
        this(Collections.emptyList());
    }

    public ArrayList<MemberInfo> getMemberList() {
        return memberList;
    }
}