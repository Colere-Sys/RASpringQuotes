package com.ra.quotes.SpringQuotes.datamodel;

public class Quote {

    private String source;
    private String dateOf;
    private String text;
    private String genre;
    private int id;

    public Quote(String source, String dateOf, String text, String genre) {
        this.source = source;
        this.dateOf = dateOf;
        this.text = text;
        this.genre = genre;
    }

    public String getSource() {
        return source;
    }

    public String getDateOf() {
        return dateOf;
    }

    public String getText() {
        return text;
    }

    public String getGenre() {
        return genre;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public void setDateOf(String dateOf) {
        this.dateOf = dateOf;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
