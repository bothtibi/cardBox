package eu.cs.ubb.cardbox.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by botht on 2/4/2017.
 */
@Entity
public class Card implements Serializable{

    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private String deckName;

    @Column(nullable = false)
    private String frontText;

    @Column(nullable = false)
    private String backText;

    @Column(nullable = false)
    private String path;

    public Card(){

    }

    public Card(String deckName, String frontText, String backText, String path) {
        this.deckName = deckName;
        this.frontText = frontText;
        this.backText = backText;
        this.path = path;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDeckName() {
        return deckName;
    }

    public void setDeckName(String deckName) {
        this.deckName = deckName;
    }

    public String getFrontText() {
        return frontText;
    }

    public void setFrontText(String frontText) {
        this.frontText = frontText;
    }

    public String getBackText() {
        return backText;
    }

    public void setBackText(String backText) {
        this.backText = backText;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
