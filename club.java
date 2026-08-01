import java.util.ArrayList;

public class club {
    public static void main(String[] args) {
        ClubMember club = new ClubMember();

        club.getList().add(new MemberInfo("SMITH, JANE", 2019, false));
        club.getList().add(new MemberInfo("FOX, STEVE", 2018, true));
        club.getList().add(new MemberInfo("XIN, MICHAEL", 2017, false));
        club.getList().add(new MemberInfo("GARCIA, MARIA", 2020, true));

        String[] newMembers = {"JOHNSON, ALEX", "LEE, SAM"};
        club.addMembers(newMembers, 2021);

        ArrayList<MemberInfo> graduatedGoodList = club.removeMembers(2018);

        System.out.println("graduatedGoodList: " + graduatedGoodList);
        System.out.println("memberList: " + club.getList());
    }
}

class MemberInfo{
    private String name;
    private int gradYear;
    private boolean inGoodStanding;

    public MemberInfo(String name, int gradYear, boolean inGoodStanding){
        this.name = name;
        this.gradYear = gradYear;
        this.inGoodStanding = inGoodStanding;
    }

    public int getGradYear(){
        return gradYear;
    }

    public boolean getInGoodStanding(){
        return inGoodStanding;
    }
}

class ClubMember{
    private ArrayList<MemberInfo> list;
    
    public ClubMember(){
        list = new ArrayList<>();
    }

    public void addMembers(String[]names, int gradYear){
        for (int i = 0; i < names.length; i++){
            list.add(new MemberInfo(names[i], gradYear, true));
        }
    }

    public ArrayList<MemberInfo> removeMembers(int gradYear){
        ArrayList <MemberInfo> graduatedGoodlist = new ArrayList<>();

        for (int i = list.size()-1; i >= 0; i--){
            MemberInfo member = list.get(i);

            if ((member.getGradYear() <= gradYear) && (member.getInGoodStanding())) {
                graduatedGoodlist.add(member);
            }
            if (member.getGradYear() <= gradYear){
                list.remove(member);
            }
        }

        return graduatedGoodlist;
    }

    public ArrayList<MemberInfo> getList(){
        return list;
    }
}
