package com.guessme.guesstheworld.utils;

import com.guessme.guesstheworld.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class GameUtils {
    @Autowired
    ConfigurableApplicationContext applicationContext;

    private int MAX_TRIES = 5;

    public int reduceTry(){

        MAX_TRIES = MAX_TRIES-1;
        return MAX_TRIES;
    }

    public int getTriesRemaining() {
        return MAX_TRIES;
    }

    public int getMAX_TRIES() {
        return MAX_TRIES;
    }

    public void setMAX_TRIES(int MAX_TRIES) {
        this.MAX_TRIES = MAX_TRIES;
    }
    public void resetTries() {
        this.MAX_TRIES = 5;
    }

    public GameService  reloadGame() {
        GameService gameService = applicationContext.getBean(GameService.class);
        return gameService;
    }
}
