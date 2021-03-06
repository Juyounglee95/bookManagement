package library;

public class Registered extends AbstractEvent {

    private Long id;
    private String bookName;

    public Registered(){
        super();
    }

    public Registered(BookManageSystem bookManageSystem){
        this();
        this.setId(bookManageSystem.getId());
        this.setBookName(bookManageSystem.getBookName());
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
}
