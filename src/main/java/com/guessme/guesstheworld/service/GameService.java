package com.guessme.guesstheworld.service;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.atomic.AtomicStampedReference;

@Service
@Scope(value = "prototype")
public class GameService {
    private String randomlychoosenWord =null;

    private char[] allChacterOfTheWorld;

<<<<<<< HEAD
    private int chosenIndex; // store the index of the randomly chosen word


=======
>>>>>>> 19a921ec40ea79fccb669c752c11d1a3cec6d427
    private String[] randomWords = {
            "unitedstates", "canada", "brazil", "mexico", "argentina",
            "france", "germany", "italy", "spain", "unitedkingdom",
            "russia", "china", "india", "japan", "southkorea",
            "australia", "newzealand", "southafrica", "egypt", "nigeria",
            "turkey", "saudiarabia", "indonesia", "thailand", "vietnam",
            "sweden", "norway", "finland", "denmark", "netherlands",
            "switzerland", "austria", "belgium", "poland", "greece",
<<<<<<< HEAD
            "portugal", "morocco", "algeria", "tunisia", "greece",
            "iran", "iraq", "pakistan", "bangladesh", "philippines",
            "malaysia", "singapore", "chile", "colombia", "peru"
    };
    private String[] hints = {
            "Famous for Hollywood and major tech cities",          // unitedstates
            "Cold winters and maple leaf symbol",                  // canada
            "Huge rainforest and iconic carnival",                 // brazil
            "Rich cuisine and ancient pyramids in the north",      // mexico
            "Known for tango dance and southern glaciers",         // argentina
            "Home of a shining tower and romantic streets",        // france
            "Strong cars and legendary beer festival",             // germany
            "Ancient empire and famous pasta",                     // italy
            "Sunny beaches and energetic dancing style",           // spain
            "Foggy weather and a giant clock tower",               // unitedkingdom
            "Largest country spanning two continents",             // russia
            "Great wall and world’s biggest population",           // china
            "Colorful festivals and a marble mausoleum",           // india
            "Land of sushi and fast bullet trains",                // japan
            "Pop music wave and advanced electronics",             // southkorea
            "Opera house on the waterfront",                       // australia
            "Sheep farms and green rolling landscapes",            // newzealand
            "Wildlife safaris and a flat-topped mountain",         // southafrica
            "Massive ancient structures in the desert",            // egypt
            "Africa’s most populous nation",                       // nigeria
            "City split by a famous strait",                       // turkey
            "Desert kingdom with sacred cities",                   // saudiarabia
            "Thousands of islands and active volcanoes",           // indonesia
            "Golden temples and elephant tourism",                 // thailand
            "Long coastline and noodle soup tradition",            // vietnam
            "Northern lights and icy fjords",                      // sweden
            "Land of midnight sun and reindeer",                   // norway
            "Known for saunas and thousands of lakes",             // finland
            "Viking heritage and royal palaces",                   // denmark
            "Tulip fields and iconic windmills",                   // netherlands
            "Alps mountains and luxury watches",                   // switzerland
            "Classical music roots and imperial architecture",     // austria
            "Comics, fries, and medieval squares",                 // belgium
            "Famous pianist heritage and dumplings",               // poland
            "Birthplace of mythology and marble temples",          // greece
            "Ocean explorers and famous fortified cities",         // portugal
            "Atlantic coast and Sahara gateway",                   // morocco
            "Mediterranean coast and vast desert lands",           // algeria
            "North African beaches and historical medinas",        // tunisia
            "Birthplace of ancient philosophers",                  // greece (duplicate country)
            "Historic empire and ancient carpets",                 // iran
            "Mesopotamian rivers and ancient learning centers",    // iraq
            "Cricket passion and snowy northern peaks",            // pakistan
            "River delta country with lush green fields",          // bangladesh
            "Tropical islands and long sandy beaches",             // philippines
            "Twin towers connected by a skybridge",                // malaysia
            "Lion statue and global financial hub",                // singapore
            "Famous for a remote island with giant heads",         // chile
            "World’s top coffee producer in the Andes",            // colombia
            "Ancient mountain city above the clouds",              // peru
    };




    Random random = new Random();
    public GameService() {
        chosenIndex = random.nextInt(randomWords.length);
        randomlychoosenWord = randomWords[chosenIndex];
        allChacterOfTheWorld = new char[randomlychoosenWord.length()];
        System.out.println("The word chosen is: " + randomlychoosenWord);
    }



    public String getHint() {
        return hints[chosenIndex];
    }

=======
            "portugal", "morocco", "algeria", "tunisia", "israel",
            "iran", "iraq", "pakistan", "bangladesh", "philippines",
            "malaysia", "singapore", "chile", "colombia", "peru"
    };

   Random random = new Random();


    public GameService() {
        randomlychoosenWord = randomWords[random.nextInt(randomWords.length)];
        System.out.println("the world chosen is  "+ randomlychoosenWord);
        allChacterOfTheWorld = new char[randomlychoosenWord.length()];
     }
>>>>>>> 19a921ec40ea79fccb669c752c11d1a3cec6d427

    @Override
    public String toString() {
        String ret = "";
        for (char c : allChacterOfTheWorld) {
            if (c == '\u0000') {
                ret = ret + "_";
            }
            else {
                ret = ret + c;
            }
            ret = ret + ' ';
        }
        return ret;
    }

        public boolean addGuess(char c) {
             boolean isGuessCorrect = false;

            for (int i =0 ; i< randomlychoosenWord.length() ;i++){

                if (randomlychoosenWord.charAt(i)== c){

                    allChacterOfTheWorld[i] = c;
                        isGuessCorrect = true;
                }
            }
            return isGuessCorrect;
        }

<<<<<<< HEAD
    public boolean isWordGuessed() {
        for (char c : allChacterOfTheWorld) {
            if (c == '\u0000') {
                return false;
            }
        }
        return true;
    }

    public String getSecretWord() {
        return randomlychoosenWord;
    }


}
=======
    }
>>>>>>> 19a921ec40ea79fccb669c752c11d1a3cec6d427
