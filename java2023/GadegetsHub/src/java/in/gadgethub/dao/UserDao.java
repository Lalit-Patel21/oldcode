
package in.gadgethub.dao;

import in.gadgethub.pojo.UserPojo;


public interface UserDao {
    public boolean isRegistered(String emailId);
    public String registerUser(UserPojo user);
    public String isValidCredentials(String emailId,String password);
    public UserPojo getUserDetails(String emailId);
    public String getUserFirstName(String emailId);
    public String getUserAddr(String emailId); 
}
