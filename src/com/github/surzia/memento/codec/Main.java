package com.github.surzia.memento.codec;

public class Main {

    public static void main(String[] args) {
        Article article = new Article(1, "article", "this is a article");
        ArticleMemento memento1 = article.save();
        article.setContent("first modify content");
        ArticleMemento memento2 = article.save();
        article.setContent("second modify content");
        System.out.println(article.getContent());
        article.redo(memento2);
        System.out.println(article.getContent());
        article.redo(memento1);
        System.out.println(article.getContent());
    }
}
