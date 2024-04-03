package TalkingPets;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("How many pets do you have?");

        int allPets = scanner.nextInt();                            //Taking note of how many pets you told us you have.
        Pet[] pets = new Pet[allPets];                              //Prepares a special list where we can write down the names of said pets. It's like making a list with enough spaces for all your pets.
        scanner.nextLine();                                         //Making sure it's ready to listen to the next thing you will say.


        for (int i = 0; i < allPets; i++ ){
            System.out.println("What is pet " + (i+1) + " name?");
            String petNameInput = scanner.nextLine();               //Storing your pet's name.

            System.out.println("What kind of pet is it?");
            String petKindInput = scanner.nextLine();               //Storing what kind of pet you have.


            switch(petKindInput){                                   //Depending on what kind of pet you have, we'll do different things. It's like having different plans for a cat, a dog, or any other pet.
                case "cat":
                    Cat addCat = new Cat();
                    addCat.setName(petNameInput);
                    pets[i] = addCat;
                    continue;
                case "dog":                                         //If you told us your pet is a dog, we'll do this set of actions.
                    Dog addDog = new Dog();                         //creating a special spot just for your dog.
                    addDog.setName(petNameInput);                   //Writing down the name you told us your dog has.
                    pets[i] = addDog;                               //Putting your dog in its special spot on our list.
                    continue;                                       //We're saying, "Okay, we're done with this pet. Let's move on to the next one."
                case "turtle":
                    Turtle addTurtle = new Turtle();
                    addTurtle.setName(petNameInput);
                    pets[i] = addTurtle;
                    continue;
                default:                                            //If you type a pet that we don't know about, we'll do the same steps and store it in the array as well.
                    Pet addPet = new Pet();
                    addPet.setName(petNameInput);
                    pets[i] = addPet;
            }

        }

        for (Pet pet:pets){                                         //Now that we have all your pet info, we're going to tell you their names.
            String petName = pet.getName();                         //Getting the names of your pets from our list
            System.out.println("Pet name: " + petName);
            pet.speak();                                            //Making our pets speak, this is where the override methods will come into play.
        }

        scanner.close();
    }

}
