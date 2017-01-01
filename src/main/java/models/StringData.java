package models;

public class StringData {
    private String value;
    private String author = "anonymous";
        
    public StringData() { }

    public StringData(String value, String author) {
        this.value = value;
        this.author = author;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getValue() {
        return value;
    }

    public String getAuthor() {
        return author;
    }
}
