package meetingrooms;

import java.util.Scanner;

public class MeetingRoomController {
    public static void main(String[] args) {
        Office office = new Office();
        Scanner scanner  = new Scanner(System.in);

        /*
        System.out.println(office.getMeetingRooms());
        office.addMeetingRoom("Kistárgyaló",5,10);
        office.addMeetingRoom("Nagytárgyaló",10,10);
        office.addMeetingRoom("Kisterem",15,10);
        office.addMeetingRoom("Nagyterem",20,20);
        office.addMeetingRoom("Nagyterem2323",20,20);
         */

        /*
        System.out.println(office.getMeetingRooms());
        System.out.println(office.getMeetingRoomsInReverseOrder());
        System.out.println(office.getEverySecondMeetingRoom(1));
        System.out.println(office.getMeetingRoomWithGivenName("Nagyterem"));
        System.out.println(office.getMeetingRoomWithGivenNamePart("Nagy"));
        System.out.println(office.getMeetingRoomsWithAreaLargerThan(150));
         */

        System.out.println("Adja meg hány termet szeretne rögzíteni!");
        int number = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < number; i++){
            if (i == 0)
                System.out.println("Adja meg vesszővel elválasztva a terem nevét, szélességét és hosszúságát!");
            else
                System.out.println("Adja meg vesszővel elválasztva a következő terem nevét, szélességét és hosszúságát!");

            String[] room = scanner.nextLine().split(",");
            MeetingRoom meetingRoom = new MeetingRoom( room[0], Integer.parseInt(room[1].trim()), Integer.parseInt(room[2].trim()));
            office.addMeetingRoom(meetingRoom);

        }

        System.out.println("""
                Menü:
                1. Tárgyalók sorrendben\s
                2. Tárgyalók visszafelé sorrendben\s
                3. Minden második tárgyaló\s
                4. Területek\s
                5. Keresés pontos név alapján\s
                6. Keresés névtöredék alapján\s
                7. Keresés terület alapján\s
                8. Kilépés""");


        String command;
        do{
           command = scanner.nextLine();

            switch (Integer.parseInt(command)) {
                case 1 -> System.out.println(office.getMeetingRooms());
                case 2 -> System.out.println(office.getMeetingRoomsInReverseOrder());
                case 3 -> System.out.println(office.getEverySecondMeetingRoom(2));
                case 4 -> System.out.println(office.getMeetingRoomSWithAreas());
                case 5 -> System.out.println(office.getMeetingRoomWithGivenName("Nagyterem"));
                case 6 -> System.out.println(office.getMeetingRoomWithGivenNamePart("Nagy"));
                case 7 -> System.out.println(office.getMeetingRoomsWithAreaLargerThan(150));
                default -> command = "8";
            }

        }while (!command.equals("8"));

    }
}
