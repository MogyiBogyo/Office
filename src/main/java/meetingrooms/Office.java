package meetingrooms;

import java.util.ArrayList;
import java.util.List;

public class Office {
    private List<MeetingRoom> meetingRooms = new ArrayList<>();

    public void addMeetingRoom(String name, int width, int lenght){
        MeetingRoom newMeetingRoom = new MeetingRoom(name, width, lenght);
       this.meetingRooms.add(newMeetingRoom);
    }
    public void addMeetingRoom(MeetingRoom meetingRoom){
        this.meetingRooms.add(meetingRoom);
    }

    public List<MeetingRoom> getMeetingRooms() {
        return meetingRooms;
    }

    public List<MeetingRoom> getMeetingRoomsInReverseOrder(){
        List<MeetingRoom> reverseList = new ArrayList<>();
        for (int i = this.meetingRooms.size() - 1; i >= 0; i--){
            reverseList.add( getMeetingRooms().get(i));
            //System.out.println(getMeetingRooms().get(i));
        }
        return reverseList;
    }

    public List<MeetingRoom> getEverySecondMeetingRoom(int k){
        List<MeetingRoom> selectedList = new ArrayList<>();
        for (int i = 0 ; i < this.meetingRooms.size(); i++){
            if (((k % 2 == 0) && !(i % 2 == 0))
              ||(( k % 2 != 0) && (i % 2 == 0)) ) {
                selectedList.add(getMeetingRooms().get(i));
            }
        }
        return selectedList;
    }

    public MeetingRoom getMeetingRoomWithGivenName(String name){
        MeetingRoom roomWithName = null;
        for (int i = 0; i < this.meetingRooms.size(); i++){
            if(getMeetingRooms().get(i).getName().equals(name)){
                roomWithName = getMeetingRooms().get(i);
            }
        }
        return roomWithName;
    }

    public List<MeetingRoom> getMeetingRoomWithGivenNamePart(String namePart){
        List<MeetingRoom> selectedList = new ArrayList<>();

        for (int i = 0; i < this.meetingRooms.size(); i++){
            if(getMeetingRooms().get(i).getName().contains(namePart)){
                selectedList.add(getMeetingRooms().get(i));
            }
        }
        return selectedList;
    }

    public List<MeetingRoom> getMeetingRoomsWithAreaLargerThan(int area){
        List<MeetingRoom> largerRooms = new ArrayList<>();
        for (int i = 0; i < this.meetingRooms.size(); i++) {
            if(getMeetingRooms().get(i).getArea() > area){
                largerRooms.add(getMeetingRooms().get(i));
            }
        }
        return largerRooms;
    }
    public List<String> getMeetingRoomSWithAreas(){
        List<String> result = new ArrayList<>();
        for (int i = 0; i< getMeetingRooms().size(); i++){
            result.add(getMeetingRooms().get(i) + ", terület=" + getMeetingRooms().get(i).getArea());
        }
        return result;
    }
}
