import java.util.Scanner;

/*
Arash Vasheghani
CS\IS 112
Lab 6 Problem1
1/29/2024
*/

/*
psuedocode:
create int totalFloors, rooms, roomsOccupied, totalRooms(0), totalOccupied(0), percentConverted
create float percentOccupied
Create Scanner keyboard;
Display "Number of floors in Hotel?"
Input totalFloors
For Each floor //start at floor 1 and iterate to totalFloors
    if it's not floor 13
        Ask "Rooms on floor (floor) is?
        Input rooms
            While, input rooms less than 10
                Display "Must have at least 10 rooms"
                Display "Rooms on floor" +floor +"is?"
                Input rooms
        Ask "How many rooms are occupied?"
        Input roomsOccupied;
            while roomsOccupied is greater than rooms
                Display "Cannot have more occupied rooms than actual rooms"
                Display "How many room are occupied?"
                Input roomsOccupied
        Accumulate rooms into totalRooms
        Accumulate roomsOccupied into totalOccupied

percentOccupied equals average of totalOccupied from total rooms. Explicit float conversion of average variables.
Convert percentOccupied to percentConverted as int

 Display "The Hotel has (totalRooms) Total Rooms."
 Display "(totalOccupied) of the Rooms are Occupied."
 Display "(percentOccupied) of the Rooms are Occupied."
 */

public class Lab6_Problem1
{
    public static void main(String[] arg)
    {
        int totalFloors, rooms, roomsOccupied, totalRooms=0, totalOccupied=0, percentConverted;
        float percentOccupied;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Number of floors in Hotel?");
        totalFloors = keyboard.nextInt();

        for(int floor= 1; floor <= totalFloors; floor++)
        {
            if (floor !=13)
            {
                System.out.println("Rooms on floor "+floor+" is?");
                rooms = keyboard.nextInt();
                while(rooms<10)
                {
                    System.out.println("Must have at least 10 rooms");
                    System.out.println("Rooms on floor "+floor+" is?");
                    rooms = keyboard.nextInt();
                }
                System.out.println("How many room are occupied?");
                roomsOccupied = keyboard.nextInt();
                while(roomsOccupied>rooms)
                {
                    System.out.println("Cannot have more occupied rooms than actual rooms");
                    System.out.println("How many room are occupied?");
                    roomsOccupied = keyboard.nextInt();
                }
                totalRooms += rooms;
                totalOccupied += roomsOccupied;
            }
        }
        percentOccupied = 100*((float)totalOccupied/totalRooms); // float to not lose data
        percentConverted = (int)percentOccupied;                // float to int

        System.out.println("The Hotel has "+totalRooms+" Total Rooms.");
        System.out.println(totalOccupied+" of the Rooms are Occupied.");
        System.out.println(percentConverted+"% of the Rooms are Occupied.");
    }
}
