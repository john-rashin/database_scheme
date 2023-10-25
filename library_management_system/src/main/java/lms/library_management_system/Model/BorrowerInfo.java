// package lms.library_management_system.Model;

// import jakarta.persistence.Entity;
// import jakarta.persistence.GeneratedValue;
// import jakarta.persistence.GenerationType;
// import jakarta.persistence.Id;
// import jakarta.persistence.Table;

// @Entity
// @Table
// public class BorrowerInfo {
    
//     @Id
//     @GeneratedValue(strategy = GenerationType.IDENTITY)
//     private Long id;
//     private String fullname;
//     private Integer idNumber;
//     private Integer phone;
//     private String email;
//     private String gradeLevel;

    
//     public BorrowerInfo() {
//     }


//     public BorrowerInfo(Long id, String fullname, Integer idNumber, Integer phone, String email, String gradeLevel) {
//         this.id = id;
//         this.fullname = fullname;
//         this.idNumber = idNumber;
//         this.phone = phone;
//         this.email = email;
//         this.gradeLevel = gradeLevel;
//     }


//     public Long getId() {
//         return id;
//     }


//     public void setId(Long id) {
//         this.id = id;
//     }


//     public String getFullname() {
//         return fullname;
//     }


//     public void setFullname(String fullname) {
//         this.fullname = fullname;
//     }


//     public Integer getIdNumber() {
//         return idNumber;
//     }


//     public void setIdNumber(Integer idNumber) {
//         this.idNumber = idNumber;
//     }


//     public Integer getPhone() {
//         return phone;
//     }


//     public void setPhone(Integer phone) {
//         this.phone = phone;
//     }


//     public String getEmail() {
//         return email;
//     }


//     public void setEmail(String email) {
//         this.email = email;
//     }


//     public String getGradeLevel() {
//         return gradeLevel;
//     }


//     public void setGradeLevel(String gradeLevel) {
//         this.gradeLevel = gradeLevel;
//     }


//     @Override
//     public String toString() {
//         return "BorrowerInfo [id=" + id + ", fullname=" + fullname + ", idNumber=" + idNumber + ", phone=" + phone
//                 + ", email=" + email + ", gradeLevel=" + gradeLevel + "]";
//     }

    
// }
