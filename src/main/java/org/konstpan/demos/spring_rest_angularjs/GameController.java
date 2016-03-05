package org.konstpan.demos.spring_rest_angularjs;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Panos
 */
@RestController
public class GameController {
  
  @Autowired
  GameService gameService;
  
  @RequestMapping("/games")
  public List<Game> listGames() {
    return gameService.findAllGames();
  }
  
  @RequestMapping("/game/{id}")
  public Game findGameById(@PathVariable Integer id) {
    return gameService.findGameById(id);
  }
}