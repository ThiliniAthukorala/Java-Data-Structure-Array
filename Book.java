
public class Book {
    enum Status{
        already_read,
        reading,
        tobe_read,
    }

    private int id;
    private String title;
    private String author;
    private int rank;
    private Status status=Status.already_read;

    public Book(){

    }

    public Book( String title, String author, int rank) {
        this.title = title;
        this.author = author;
        this.rank = rank;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        switch (status){
            case already_read :
                this.status=Status.already_read;
                break;
            case reading :
                this.status=Status.reading;
                break;
            case tobe_read:
                this.status=Status.tobe_read;
                break;
        }
    }


}
