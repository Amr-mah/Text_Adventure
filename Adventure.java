import java.io.InputStream;
import java.util.Scanner;

public class Adventure {
    public static void main(String[] args) {

        System.out.println("You have been kidnapped!");
        System.out.println("You wake up in a dark room and you need to find a way to escape!");
        System.out.println("You can see a door to your right.");
        System.out.println("Type 'help' at any time if you don't know what you're doing.");
        System.out.println("Type 'hint' if you are stuck at a specific area.");
        // Starting location

        String door;
        Help readIn = new Help(System.in);
        do {
            System.out.println("Type '1' to go through the door on your right. ");
            door = readIn.next(0);
        }
        while(!door.equals("1") && !door.equals("2"));

        if (door.equals("1")) {
            System.out.println("You enter the new room which looks like a kitchen!");
            System.out.println("You feel really hungry and decide to open the fridge");
            System.out.println("You can see a sandwich and a soft drink");
            // Second location

            String key;
            do {
                // First object to interact with
                System.out.println("Type 'a' to take the sandwich ");
                System.out.println("Type 'b' to take the drink ");
                key = readIn.next(1);
            }
            while (!key.equals("a") && !key.equals("b") );

            System.out.println("You hear some people talking nearby!");
            System.out.println("You look around and find a gun in one of the drawers!");
            System.out.println("You are scared to take the gun because you have never used one before");
            do {
                // Second object to interact with
                System.out.println("Type 'a' to take the gun ");
                System.out.println("Type 'b' to leave the gun ");
                key = readIn.next(2);
            }
            while (!key.equals("a") && !key.equals("b") );

            System.out.println("You suddenly see a guy start sprinting at you");
            int person = 10;
            int gun = 5;
            int punch = 2;

            while (person > 0) {
                System.out.println("The person is not dead yet. Type 'a' to use your gun or 'b' to punch him.(Please don't use gun if you never picked it up)");
                key = readIn.next(3);

                if (key.equals("a")) {
                    person = person - gun;
                }
                else if (key.equals("b")) {
                    person = person - punch;
                }
            }
            System.out.println("The guy falls to the ground and seems unconscious");
            System.out.println("You continue moving forward and see one door. The door is locked.");
            System.out.println("You should probably look around.");
            System.out.println("You search the guy's clothes and find the key");

            String door2;
            do {
                System.out.println("Type 'ready' to go through the door.");
                door2 = readIn.next(4);
            }
            while (!door2.equals("ready"));

            if (door2.equals("ready")) {

                System.out.println("You walk through the door and find yourself in the middle of a cage.");
                System.out.println("You realize there's a lion in front of you!");
                System.out.println("You freak out and the lion starts bolting at you! ");
                // Third location

                int lion = 20;

                while (lion > 0) {
                    System.out.println("The lion is not dead yet. Type 'a' to use your gun or 'b' to punch him. (Please don't use gun if you never picked it up)");
                    key = readIn.next(5);

                    if (key.equals("a")) {
                        lion = lion - gun;
                    }

                    if (key.equals("b")) {
                        lion = lion - punch;
                    }
                }
                System.out.println("Good job! You have killed the lion! ");
                System.out.println("As you explore the room, you find some new items.");
                String lvl;
                do {
                    // Third object to interact with
                    System.out.println("Type 'a' to pick up the flashlight.");
                    System.out.println(" or ");
                    System.out.println("Type 'b' to create your own torch.");
                    lvl = readIn.next(6);
                }
                while (!lvl.equals("a") && !lvl.equals("b") );

                System.out.println("You can now see much better and realize that the exit is right in front of you.");

                String door3;
                do {
                    System.out.println("Type 'ready' to go through the door.");
                    door3 = readIn.next(7);
                }
                while (!door3.equals("ready"));

                if (door3.equals("ready")) {
                    System.out.println("You have exited the house");
                    System.out.println("OH NO! There is a dragon flying at you!");
                    System.out.println("You see a sniper rifle on the ground");
                    // Fourth location

                    String pickup;
                    do {
                        // Fourth object to interact with
                        System.out.println("Type 'a' to pick up the sniper ");
                        pickup = readIn.next(8);
                    }
                    while (!pickup.equals("a"));
                    System.out.println("You now have a sniper rifle! You scope in on the dragon.");

                    int sniper = 25;
                    int dragon = 50;

                    while (dragon > 0) {
                        System.out.println("The dragon is not dead yet. Type 'a' to use your sniper or 'b' to use your gun. (Please don't use gun if you never picked it up) ");
                        key = readIn.next(9);

                        if (key.equals("a")) {
                            dragon = dragon - sniper;
                        }

                        if (key.equals("b")) {

                            dragon = dragon - gun;
                        }
                    }
                    System.out.println("Nice job! You killed the dragon.");
                    System.out.println("You see a ladder that goes up to the roof of the house.");
                    System.out.println("You feel like going up the ladder because you think you'll find something cool.");

                    String roof;
                    do {
                        System.out.println("Type 'ready' when you are ready to climb the ladder and see what's on the roof.");
                        roof = readIn.next(10);
                    }
                    while (!roof.equals("ready"));

                    System.out.println("You reach the roof and you can't find anything.");
                    System.out.println("You are prepared to go back down when you hear something creepy.");
                    System.out.println("You see a ghost!");
                    System.out.println("You quickly reach for your weapon. Type 'a' to use your sniper, 'b' to use your gun, and 'c' to punch him" );
                    // Fifth Location

                    key = readIn.next(11);

                    int ghost = 1;

                    while (ghost > 0) {
                        System.out.println("The ghost is not dead yet. Type 'a' to use your sniper or 'b' to use your gun or 'c' to use punch him (Please don't use gun if you never picked it up) ");
                        key = readIn.next(12);

                        if (key.equals("a")) {
                            System.out.println("You can't shoot the ghost");
                        }

                        else if (key.equals("b")) {
                            System.out.println("You can't shoot the ghost");
                        }
                        else if (key.equals("c")) {
                            ghost = ghost - punch;
                        }

                    }
                    System.out.println("Nice job! The ghost freaked out when you tried to punch him and disappeared!");
                    System.out.println("You have defeated every creature in the house and you are now free!");
                    // Victory Condition
                }
            }
        }
    }
}
class Help
{
    private static Scanner readIn;
    public Help(InputStream source) {
        readIn = new Scanner(source);
    }

    public String next(int room)
    {

        String answer = readIn.next();
        if (answer.equals ("help"))

        {
            // If the user types help:
            System.out.println("The purpose of this game is for you to escape the place you're in");
            System.out.println("As you move from room to room, you will find different things that will help you escape. You will be prompted with the actions you can make. ");
            System.out.println("If you have don't know what to do in a room, you can type 'hint' ");
            System.out.println("  ");
        }

        // Hints for what to do at each location
        if (answer.equals("hint")) {

            if (room == 0) {
                System.out.println("  ");
                System.out.println("Type 1 to go through the door on your right or 2 to go through the door on your left ");
                System.out.println("  ");
                return answer;
            }

            if(room == 1) {
                System.out.println("  ");
                System.out.println("You are pretty hungry so you can either eat a sandwich or drink something.");
                System.out.println("  ");
                return answer;
            }

            if (room == 2) {
                System.out.println("  ");
                System.out.println("The gun might be useful. Type 'a' to pick it up.");
                System.out.println("You should definitely pick it up because it will be useful.");
                System.out.println("  ");
                return answer;
            }

            if(room == 3) {
                System.out.println("  ");
                System.out.println("The guy is still running at you. Kill him before he kills you.");
                System.out.println("  ");
                return answer;
            }

            if(room == 4) {
                System.out.println("  ");
                System.out.println("You have no other choice but to got through the door so just type 'ready'");
                System.out.println("  ");
                return answer;
            }

            if(room == 5) {
                System.out.println("  ");
                System.out.println("The lion is still coming at you. Hurry up and kill it before it kills you");
                System.out.println("  ");
                return answer;
            }

            if (room == 6) {
                System.out.println("  ");
                System.out.println("You will need a source of light to see.");
                System.out.println("Pick how you want to get your source of light.");
                System.out.println("  ");
            }

            if (room == 7) {
                System.out.println("  ");
                System.out.println("You have no other choice but to got through the door so just type 'ready'");
                System.out.println("  ");
            }

            if (room == 8) {
                System.out.println("  ");
                System.out.println("You're going to need the sniper so just pick it up by typing 'a'");
                System.out.println("  ");
            }

            if (room == 9) {
                System.out.println("  ");
                System.out.println("The dragon is still coming at you. Hurry up and kill it before it kills you");
                System.out.println("  ");
            }

            if (room == 10) {
                System.out.println("  ");
                System.out.println("You really feel attracted to whatever is on the roof so just type 'ready'");
                System.out.println("  ");
            }

            if (room == 11) {
                System.out.println("  ");
                System.out.println("What weapon do you want to try on the ghost? Only one of them will work on him.");
                System.out.println("  ");
            }

            if (room == 12) {
                System.out.println("  ");
                System.out.println("Try a different weapon. Only one will work on the ghost. Just keep trying all of them.");
                System.out.println("  ");
            }
        }
        return answer;
    }
}
