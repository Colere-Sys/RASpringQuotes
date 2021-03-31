package com.ra.quotes.SpringQuotes.datamodel;

import javax.persistence.*;

@Entity
@Table
public class Quote {
    @Id
    @SequenceGenerator(
            name = "quote_sequence",
            sequenceName = "quote_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "quote_sequence"
    )
    private long id;
    private String source;
    private String dateOf;
    private String text;
    private String genre;

    public Quote(String source, String dateOf, String text, String genre) {
        this.source = source;
        this.dateOf = dateOf;
        this.text = text;
        this.genre = genre;
    }

    public Quote() {
    }

    public long getId() {
        return id;
    }
    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDateOf() {
        return dateOf;
    }

    public void setDateOf(String dateOf) {
        this.dateOf = dateOf;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
