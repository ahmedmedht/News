package com.example.news;

public class ModelClass {
    private String author,title,descrption,url,urlImage,publishedAt;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescrption() {
        return descrption;
    }

    public void setDescrption(String descrption) {
        this.descrption = descrption;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUrlImage() {
        return urlImage;
    }

    public void setUrlImage(String urlImage) {
        this.urlImage = urlImage;
    }

    public String getPublishedAt() {
        return publishedAt;
    }

    public void setPublishedAt(String publishedAt) {
        this.publishedAt = publishedAt;
    }

    public ModelClass(String author, String title, String descrption, String url, String urlImage, String publishedAt) {
        this.author = author;
        this.title = title;
        this.descrption = descrption;
        this.url = url;
        this.urlImage = urlImage;
        this.publishedAt = publishedAt;
    }
}
