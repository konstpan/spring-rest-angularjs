package org.konstpan.demos.spring_rest_angularjs;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author Panos
 */
@Service
public class GameService {
  
  public List<Game> findAllGames() {
    List<Game> games = new ArrayList<Game>();
    
    Game game;
    
    game = new Game();
    game.setId(1);
    game.setName("Order of Battle - Morning Sun");
    game.setSnippet("In summer 1937, renewed tensions between Japan and China escalate into open war: The Second Sino-Japanese war has begun.");
    games.add(game);
    
    game = new Game();
    game.setId(2);
    game.setName("Heroes of Normandie");
    game.setSnippet("Take one of the most modern, fun and engaging board games created in recent years. Match it with cutting-edge technology. Add a ridiculously well-crafted art style and a ton of extra content. This is the recipe to one of the most thrilling, charming and captivating strategy games you will ever find.");
    games.add(game);
    
    game = new Game();
    game.setId(3);
    game.setName("Battle of the Bulge");
    game.setSnippet("Battle of the Bulge is a fast-paced WW2 game where precise movement and detailed planning make the difference between a vain attempt and a brave operation.");
    games.add(game);
    
    game = new Game();
    game.setId(4);
    game.setName("Order of Battle: Pacific");
    game.setSnippet("Order of Battle: Pacific is the first title in a new series of hexagonal strategy games, designed to cover military history from ancients to modern warfare.");
    games.add(game);
    
    game = new Game();
    game.setId(5);
    game.setName("Close Combat - Gateway to Caen");
    game.setSnippet("Close Combat: Gateway to Caen is the latest release in the critically-acclaimed Close Combat series, and the final release of the current game engine. Gateway to Caen focuses on the largest, concentrated British offensive since the Normandy landings in an attempt to penetrate the German lines west of Caen and cross the Odon River to get the stalled advance moving again.");
    games.add(game);
    
    return games;
  }
}