public class TestBook {

    public static void main(String[] args) {

        Author author = new Author(
                "Soumya",
                "soumya@gmail.com",
                'M');

        Book book = new Book(
                "Java Programming",
                author,
                599.50,
                25);

        System.out.println("Book Name      : " + book.getName());
        System.out.println("Author Name    : " + book.getAuthor().getName());
        System.out.println("Author Email   : " + book.getAuthor().getEmail());
        System.out.println("Author Gender  : " + book.getAuthor().getGender());
        System.out.println("Book Price     : " + book.getPrice());
        System.out.println("Quantity Stock : " + book.getQtyInStock());
    }
}