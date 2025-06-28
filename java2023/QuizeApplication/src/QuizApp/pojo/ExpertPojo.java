/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuizApp.pojo;

/**
 *
 * @author Smart computer
 */
public class ExpertPojo {

    
    private int expertId;
    private String expertName;
    private String expertEmail;
    private String expertPassword;

    public ExpertPojo() {
    }
    
    
    public ExpertPojo(int expertId, String expertName, String expertEmail, String expertPassword) {
        this.expertId = expertId;
        this.expertName = expertName;
        this.expertEmail = expertEmail;
        this.expertPassword = expertPassword;
    }

    public int getExpertId() {
        return expertId;
    }

    public void setExpertId(int expertId) {
        this.expertId = expertId;
    }

    public String getExpertName() {
        return expertName;
    }

    public void setExpertName(String expertName) {
        this.expertName = expertName;
    }

    public String getExpertEmail() {
        return expertEmail;
    }

    public void setExpertEmail(String expertEmail) {
        this.expertEmail = expertEmail;
    }

    public String getExpertPassword() {
        return expertPassword;
    }

    public void setExpertPassword(String expertPassword) {
        this.expertPassword = expertPassword;
    }

    
}

