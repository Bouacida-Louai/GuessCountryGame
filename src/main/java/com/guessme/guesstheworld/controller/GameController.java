package com.guessme.guesstheworld.controller;

import com.guessme.guesstheworld.service.GameService;
import com.guessme.guesstheworld.utils.GameUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GameController {
    @Autowired
    private GameService gameService;

    @Autowired
    private GameUtils gameUtils ;



    @GetMapping("/game-home")
    public String showGameHomePage(@RequestParam( value = "gusedCharacter" , required = false) String gusedCharacter, Model model) {

        String s= "hello";
//        System.out.println(s.charAt(0));
        System.out.println("the guessed word is " + gusedCharacter);

        String randomWord = gameService.toString();

    if (gusedCharacter!=null){
        boolean isGuessCorrect = gameService.addGuess(gusedCharacter.charAt(0));
             randomWord = gameService.toString();

        if (isGuessCorrect == false) {
            gameUtils.reduceTry();
        }
        }
//        System.out.println("the number of tries remaining is : " + gameUtils.getTriesRemaining());
             model.addAttribute("wodsToDisplay", randomWord);
             model.addAttribute("triesLeft",gameUtils.getTriesRemaining())   ;

            return "game-home-page";
        }
        @GetMapping("/reload")
    public  String reloadGame(Model model) {

        gameService = gameUtils.reloadGame();
        gameUtils.resetTries();
        return "redirect:/game-home";
        }

}
