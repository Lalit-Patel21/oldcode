
package in.gadgethub.pojo;


public class UserPojo {

    @Override
    public String toString() {
        return "UserPojo{" + "useremail=" + useremail + ", username=" + username + ", mobile=" + mobile + ", address=" + address + ", pincode=" + pincode + ", password=" + password + '}';
    }

    public UserPojo(String useremail, String username, String mobile, String address, int pincode, String password) {
        this.useremail = useremail;
        this.username = username;
        this.mobile = mobile;
        this.address = address;
        this.pincode = pincode;
        this.password = password;
    }

    public String getUseremail() {
        return useremail;
    }

    public void setUseremail(String useremail) {
        this.useremail = useremail;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPincode() {
        return pincode;
    }

    public void setPincode(int pincode) {
        this.pincode = pincode;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserPojo() {
    }
      private String useremail;
      private String username;
      private String mobile;
      private String address;
      private int pincode;
      private String password;
}
