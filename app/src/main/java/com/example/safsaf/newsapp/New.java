package com.example.safsaf.newsapp;

/**
 * Created by Safsaf on 7/21/2017.
 */

/**
 * An {@link New} object contains information related to a single new.
 */
public class New {
    /**
     * Title of the new
     */
    private String mTitle;
    /**
     * Author of the new
     */
    private String mAuthor;
    /**
     * PublishedAt of the new
     */
    private String mPublishedAt;
    /**
     * Description of the new
     */
    private String mDescription;

    /** Website URL of the earthquake */
    private String mUrl;

    /**
     * Constructs a new {@link New} object.
     *
     * @param title       is the title of the new
     * @param author      is the Author of the new
     * @param publishedAt   is the date of the new
     * @param description is the description of the new
     * @param url is the website URL to find more details about the earthquake
     */
    public New(String title, String author, String publishedAt, String description,String url) {
        mTitle = title;
        mAuthor = author;
        mPublishedAt = publishedAt;
        mDescription = description;
        mUrl = url;
    }

    /**
     * Returns the title of the new.
     */
    public String getTitle() {
        return mTitle;
    }

    /**
     * Returns the author of the new.
     */
    public String getAuthor() {
        return mAuthor;
    }

    /**
     * Returns the publishAt of the new.
     */
    public String getPublishedAt() {
        return mPublishedAt;
    }

    /**
     * Returns the description of the new.
     */
    public String getDescription() {
        return mDescription;
    }

    /**
     * Returns the website URL to find more information about the earthquake.
     */
    public String getUrl() {
        return mUrl;
    }

}
