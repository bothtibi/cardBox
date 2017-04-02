package eu.cs.ubb.cardbox.controller;

import eu.cs.ubb.cardbox.entity.Card;
import eu.cs.ubb.cardbox.repository.CardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by botht on 2/4/2017.
 */
@RestController
public class CardBoxController {

    @Autowired
    private CardRepository cardRepository;

    @RequestMapping(method = RequestMethod.GET, value = "/welcome")
    public String greeting(){
        return "Hello, I am the CardBox server :)";
    }

    @RequestMapping(method = RequestMethod.GET, value = "/getAllCards")
    public List<Card> getDecks(){
        return cardRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.POST, value = "/addCard")
    public void test(@RequestBody Card card) {
        cardRepository.save(card);
    }
}
