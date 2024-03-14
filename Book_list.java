import java.util.Scanner;

public class Book_list {
    private String BookListName;
    public Book[] list=new Book[15];
    public  int bookCount=0;

    public Book_list(String bookListName) {
        BookListName = bookListName;
    }

    public String getBookListName() {
        return BookListName;
    }

    public void insert(String title,String author,int rank){
        if (bookCount<15){
          list[bookCount]=new Book(title,author,rank);
          list[bookCount].setId(bookCount+1);
            System.out.println("Book Added");
            bookCount++;
        }else {
            System.out.println("Book limit reached!");
        }
        System.out.println();
    }

    public void delete(int id){
        list[id-1]=list[bookCount-1];
        list[bookCount-1]=null;
        bookCount--;

        if (id>=bookCount){
            System.out.println("Book is not found");
        }
        System.out.println();
    }

    public void display(){
      for (Book book:list){
          if (book!=null){
              System.out.println("Title: "+book.getTitle()+"\n"+"Author: "+book.getAuthor()+"\n"+
                      "Status: "+book.getStatus());
          }
      }
        System.out.println();
    }

    public void displayBook(String title){
        int flag=0;
        for (int i=0;i<bookCount;i++){
            if (list[i].getTitle().equals(title)){
                flag++;
                System.out.println("book found");
                System.out.println("Title "+list[i].getTitle()+"\n"+
                        "Author"+list[i].getAuthor()+"\n"+"Status"+
                        list[i].getStatus()+"\n"+"Rank"+list[i].getRank());
            }
        }
        if (flag==0){
            System.out.println("Book not found");
        }
        System.out.println();
    }

    public Book searchBook(String title){
        int flag=0;
        for (Book book:list){
            if (book.getTitle().equals(title)){
                flag++;
                System.out.println("Search complete");
                return book;
            }
        }
        if (flag==0){
            System.out.println("Book is not found");
        }
        System.out.println();
        return null;
    }

    public void modifyBook(String title){
        for (int i=0;i<bookCount;i++){
            if (list[i].getTitle().equals(title)){
                System.out.println("book modification");
                System.out.println("1.Title 2.Author 3.Rank 4.Status");

                Scanner s=new Scanner(System.in);
                System.out.println("Choose your change");
                int option=s.nextInt();

                switch (option){
                    case 1:
                        System.out.println("Enter new Title ");
                        String newTitle=s.nextLine();
                        list[i].setTitle(newTitle);
                        System.out.println("Change is complete");
                        break;

                    case 2:
                        System.out.println("Enter new Author ");
                        String newAuthor=s.nextLine();
                        list[i].setAuthor(newAuthor);
                        System.out.println("Change is complete");
                        break;

                    case 3:
                        System.out.println("Enter new Rank ");
                        int newRank=s.nextInt();
                        list[i].setRank(newRank);
                        System.out.println("Change is complete");
                        break;

                    /*case 4:
                        System.out.println("Enter new Status ");
                        String newStatus=s.nextLine();
                        list[i].setStatus(newStatus);
                        System.out.println("Change is complete");
                        break;*/
                }
            }
        }
    }

    public void current(){
        for (int i=0;i<bookCount;i++){
            if (list[i].getStatus().equals(Book.Status.reading)){
                System.out.println(list[i].getTitle());
            }
        }
    }





}
