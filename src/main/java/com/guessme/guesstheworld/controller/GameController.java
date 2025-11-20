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
<<<<<<< HEAD

=======
>>>>>>> 19a921ec40ea79fccb669c752c11d1a3cec6d427
    @Autowired
    private GameService gameService;

    @Autowired
<<<<<<< HEAD
    private GameUtils gameUtils;

    @GetMapping("/game-home")
    public String showGameHomePage(@RequestParam(value = "guessedCharacter", required = false) String guessedCharacter,
                                   Model model) {

        String wordToDisplay = gameService.toString();
        boolean gameOver = false;

        if (guessedCharacter != null && !guessedCharacter.isEmpty()) {

            boolean isGuessCorrect = gameService.addGuess(guessedCharacter.charAt(0));
            wordToDisplay = gameService.toString();

            // Wrong guess
            if (!isGuessCorrect) {
                gameUtils.reduceTry();
            }
        }

        // Check for win
        if (gameService.isWordGuessed()) {
            gameOver = true;
            model.addAttribute("message", "Excellent! You guessed the country!");
        }

        // Check for loss
        if (gameUtils.getTriesRemaining() == 0) {
            gameOver = true;
            model.addAttribute("message", "Game Over! The country was: " + gameService.getSecretWord());
        }

        model.addAttribute("wordToDisplay", wordToDisplay);
        model.addAttribute("triesLeft", gameUtils.getTriesRemaining());
        model.addAttribute("hint", gameService.getHint());
        model.addAttribute("gameOver", gameOver);
        model.addAttribute("secretWord", gameService.getSecretWord());

        return "game-home-page";
    }

    @GetMapping("/reload")
    public String reloadGame() {
        // Create a new game instance
        gameService = gameUtils.reloadGame();
        // Reset tries
        gameUtils.resetTries();
        // Redirect back to game page
        return "redirect:/game-home";
    }
=======
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
>>>>>>> 19a921ec40ea79fccb669c752c11d1a3cec6d427

}
