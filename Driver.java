public class Driver {
    public static void main(String[] args) {
        Book_list list1= new Book_list("My BookList");

        list1.insert("Uncanny Valley"," Anna Wiener",10);
        list1.insert("Weather","Jenny offil",4);
        list1.insert("Long Bright River","Liz Moore",18);
        list1.insert("The Glass Hotel","Emily st",2);
        list1.insert("Afterlife","Julia Alverlifer",14);

        list1.modifyBook("Long Bright River");

        list1.display();
    }
}
