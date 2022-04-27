package Q3;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class TestClubMembers {

    @Test
    public void testAddMembersConstructsAndAddsNewMembers() {
        String[] names = {"Alice", "Bob", "Charles"};
        int gradYear = 2020;

        ClubMembers clubMembers = new ClubMembers();
        clubMembers.addMembers(names, gradYear);

        List<MemberInfo> expectedMembers = Arrays.asList(
                new MemberInfo(names[0], gradYear, true),
                new MemberInfo(names[1], gradYear, true),
                new MemberInfo(names[2], gradYear, true));

        checkMemberList(expectedMembers, clubMembers.getMemberList());
    }

    @Test
    public void testAddMembersConstructsMultipleCallsAddsMoreMembers() {
        ClubMembers clubMembers = new ClubMembers();
        clubMembers.addMembers(new String[] {"Alice", "Doug"}, 2020);
        clubMembers.addMembers(new String[] {"Bob", "Charles"}, 2021);

        List<MemberInfo> expectedMembers = Arrays.asList(
                new MemberInfo("Alice", 2020, true),
                new MemberInfo("Doug", 2020, true),
                new MemberInfo("Bob", 2021, true),
                new MemberInfo("Charles", 2021, true)
        );

        checkMemberList(expectedMembers, clubMembers.getMemberList());
    }

    @Test
    public void testRemoveMembersRemovesGraduatedMembers() {
        ClubMembers clubMembers = new ClubMembers(Arrays.asList(
                new MemberInfo("Alice", 2019, false),
                new MemberInfo("Bob", 2018, true),
                new MemberInfo("Charles", 2017, false),
                new MemberInfo("Doug", 2020, true)
        ));

        clubMembers.removeMembers(2018);

        List<MemberInfo> expectedMembers = Arrays.asList(
                new MemberInfo("Alice", 2019, false),
                new MemberInfo("Doug", 2020, true)
        );

        checkMemberList(expectedMembers, clubMembers.getMemberList());
    }

    @Test
    public void testRemoveMembersReturnsMembersInGoodStanding() {
        ClubMembers clubMembers = new ClubMembers(Arrays.asList(
                new MemberInfo("Alice", 2019, false),
                new MemberInfo("Bob", 2018, true),
                new MemberInfo("Charles", 2017, false),
                new MemberInfo("Doug", 2020, true),
                new MemberInfo("Eli", 2016, true)
        ));

        ArrayList<MemberInfo> graduatedInGoodStanding = clubMembers.removeMembers(2018);

        List<MemberInfo> expectedMembers = Arrays.asList(
                new MemberInfo("Bob", 2018, true),
                new MemberInfo("Eli", 2016, true)
        );
        checkMemberList(expectedMembers, graduatedInGoodStanding);
    }

    private void checkMemberList(List<MemberInfo> expectedMembers, List<MemberInfo> clubMembers) {
        Assert.assertEquals(expectedMembers.size(), clubMembers.size());
        for (MemberInfo expectedMember : expectedMembers) {
            Assert.assertTrue(clubMembers.contains(expectedMember));
        }
    }
}
