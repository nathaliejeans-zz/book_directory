/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codename1.itemdirectory;

import com.codename1.io.Externalizable;
import com.codename1.io.Util;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/**
 *
 * @author nathaliejeans
 */
public class Book implements Externalizable {
    
    private String name;
    private String author;
    private String genre;
    private int year;
    private int pages;
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getAuthor() {
        return author;
    }
    
    public void setAuthor(String author) {
        this.author = author;
    }
    
    public String getGenre() {
        return genre;
    }
    
    public void setGenre(String genre) {
        this.genre = genre;
    }
    
    public int getYear() {
        return year;
    }
    
    public void setYear(int year) {
        this.year = year;
    }
    
    public int getPages() {
        return pages;
    }
    
    public void setPages(int pages) {
        this.pages = pages;
    }
    
    @Override
    public int getVersion() {
        return 1;
    }
       
    @Override
    public void externalize(DataOutputStream out) throws IOException {
        Util.writeUTF(name, out);
        Util.writeUTF(author, out);
        Util.writeUTF(genre, out);
        out.writeInt(year);
        out.writeInt(pages);
    }
    
    @Override
    public void internalize(int version, DataInputStream in) throws IOException {
        
        name=Util.readUTF(in);
        author=Util.readUTF(in);
        genre=Util.readUTF(in);
        year=in.readInt();
        pages=in.readInt();
        
    }
    
    @Override
    public String getObjectId() {
        return "Book";
    }
}
