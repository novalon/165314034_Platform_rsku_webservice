package pojos;
// Generated Oct 26, 2018 9:05:41 AM by Hibernate Tools 4.3.1



/**
 * User generated by hbm2java
 */
public class User  implements java.io.Serializable {


     private String email;
     private String password;

    public User() {
    }

	
    public User(String email) {
        this.email = email;
    }
    public User(String email, String password) {
       this.email = email;
       this.password = password;
    }
   
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }

    public int compareTo(User user){
        return this.email.compareTo(user.email);
    }


}


