package model;

import java.util.ArrayList;

/**
 * Represents a book with a title, author and its copies.
 *
 * @author esther
 * @version 1.110526
 */
public class Book
{
    private String title;
    private String author;
    private ArrayList<BookCopy> bookCopies;

    /**
     * Constructor for objects of class Book
     *
     * @param title  the title of the book
     * @param author the author of the book
     */
    public Book(String title, String author)
    {
        this.title = title;
        this.author = author;
        bookCopies = new ArrayList<>();
    }

    /**
     * Returns the title of this book
     *
     * @return the title
     */
    public String getTitle()
    {
        return title;
    }

    /**
     * Returns the author of this book
     *
     * @return the author
     */
    public String getAuthor()
    {
        return author;
    }

    /**
     * Adds a copy of this book
     *
     * @param aBookCopy the BookCopy to add
     */
    public void addBookCopy(BookCopy aBookCopy)
    {
        bookCopies.add(aBookCopy);
    }
}