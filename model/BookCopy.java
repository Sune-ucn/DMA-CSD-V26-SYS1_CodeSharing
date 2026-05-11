package model;

/**
 * Represents a physical copy of a book.
 *
 * @author SuneK
 * @version 1.110526
 *
 */
public class BookCopy
{
    private int copyNumber;

    /**
     * Constructor for objects of class BookCopy
     *
     * @param copyNumber the copy number of this book copy
     */
    public BookCopy(int copyNumber)
    {
        this.copyNumber = copyNumber;
    }

    /**
     * Returns the copy number of this book copy
     *
     * @return the copy number
     */
    public int getCopyNumber()
    {
        return copyNumber;
    }
}