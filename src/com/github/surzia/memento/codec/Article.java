package com.github.surzia.memento.codec;

public class Article {

    private long id;
    private String title;
    private String content;

    public Article(long id, String title, String content) {
        this.id = id;
        this.title = title;
        this.content = content;
    }

    public ArticleMemento save() {
        return new ArticleMemento(id, title, content);
    }

    public void redo(ArticleMemento memento) {
        this.id = memento.getId();
        this.title = memento.getTitle();
        this.content = memento.getContent();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
