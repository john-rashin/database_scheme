// package lms.library_management_system.Model;

// import java.util.Arrays;

// import jakarta.persistence.Entity;
// import jakarta.persistence.GeneratedValue;
// import jakarta.persistence.GenerationType;
// import jakarta.persistence.Id;
// import jakarta.persistence.Lob;
// import jakarta.persistence.Table;

// @Entity
// @Table
// public class ManageBooks {

//     @Id
//     @GeneratedValue(strategy = GenerationType.IDENTITY)
//     private Long id;
//     private String isbn;
//     private String bookTitle;
//     private String author;
//     private String publisher;
//     private String year;
//     private String category;
//     private String filename;
//     private String mimetype;
//     @Lob
//     private byte[] imageData;
//     private Integer quantity;
//     private String bookDescription;

    
//     public ManageBooks() {
//     }

//     //Contstructor
//     public ManageBooks(Long id, String isbn, String bookTitle, String author, String publisher, String year,
//             String category, String filename, String mimetype, byte[] imageData, Integer quantity,
//             String bookDescription) {
//         this.id = id;
//         this.isbn = isbn;
//         this.bookTitle = bookTitle;
//         this.author = author;
//         this.publisher = publisher;
//         this.year = year;
//         this.category = category;
//         this.filename = filename;
//         this.mimetype = mimetype;
//         this.imageData = imageData;
//         this.quantity = quantity;
//         this.bookDescription = bookDescription;
//     }

//     public Long getId() {
//         return id;
//     }

//     public void setId(Long id) {
//         this.id = id;
//     }

//     public String getIsbn() {
//         return isbn;
//     }

//     public void setIsbn(String isbn) {
//         this.isbn = isbn;
//     }

//     public String getBookTitle() {
//         return bookTitle;
//     }

//     public void setBookTitle(String bookTitle) {
//         this.bookTitle = bookTitle;
//     }

//     public String getAuthor() {
//         return author;
//     }

//     public void setAuthor(String author) {
//         this.author = author;
//     }

//     public String getPublisher() {
//         return publisher;
//     }

//     public void setPublisher(String publisher) {
//         this.publisher = publisher;
//     }

//     public String getYear() {
//         return year;
//     }

//     public void setYear(String year) {
//         this.year = year;
//     }

//     public String getCategory() {
//         return category;
//     }

//     public void setCategory(String category) {
//         this.category = category;
//     }

//     public String getFilename() {
//         return filename;
//     }

//     public void setFilename(String filename) {
//         this.filename = filename;
//     }

//     public String getMimetype() {
//         return mimetype;
//     }

//     public void setMimetype(String mimetype) {
//         this.mimetype = mimetype;
//     }

//     public byte[] getImageData() {
//         return imageData;
//     }

//     public void setImageData(byte[] imageData) {
//         this.imageData = imageData;
//     }

//     public Integer getQuantity() {
//         return quantity;
//     }

//     public void setQuantity(Integer quantity) {
//         this.quantity = quantity;
//     }

//     public String getBookDescription() {
//         return bookDescription;
//     }

//     public void setBookDescription(String bookDescription) {
//         this.bookDescription = bookDescription;
//     }

//     @Override
//     public String toString() {
//         return "BooksInfo [id=" + id + ", isbn=" + isbn + ", bookTitle=" + bookTitle + ", author=" + author
//                 + ", publisher=" + publisher + ", year=" + year + ", category=" + category + ", filename=" + filename
//                 + ", mimetype=" + mimetype + ", imageData=" + Arrays.toString(imageData) + ", quantity=" + quantity
//                 + ", bookDescription=" + bookDescription + "]";
//     }

    
    
// }
