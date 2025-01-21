package main.java.com.corason.library.model;

import lombok.Data;

@Data
public class Book {
    private String id;
    private String title;
    private String author;
    private String isbn;
}