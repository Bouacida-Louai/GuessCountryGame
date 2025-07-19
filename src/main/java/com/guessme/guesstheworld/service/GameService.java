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

    private String[] randomWords = {
            "unitedstates", "canada", "brazil", "mexico", "argentina",
            "france", "germany", "italy", "spain", "unitedkingdom",
            "russia", "china", "india", "japan", "southkorea",
            "australia", "newzealand", "southafrica", "egypt", "nigeria",
            "turkey", "saudiarabia", "indonesia", "thailand", "vietnam",
            "sweden", "norway", "finland", "denmark", "netherlands",
            "switzerland", "austria", "belgium", "poland", "greece",
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

    }
