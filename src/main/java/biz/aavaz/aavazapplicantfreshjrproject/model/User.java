package biz.aavaz.aavazapplicantfreshjrproject.model;

//!!! Serialization to handle json snake case and java camel case
//!!! https://www.javadoc.io/doc/com.google.code.gson/gson/2.6.2/com/google/gson/annotations/SerializedName.html
//!!! https://sites.google.com/site/gson/gson-user-guide#TOC-JSON-Field-Naming-Support (JSON Field Naming Support)

public class User {
    
    private String firstname;
    private String lastname;
    private int age;
    private String skills;
    

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstname) {
        this.firstname = firstname;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastname) {
        this.lastname=lastname;
    }
   

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    
//     public String geSkills() {
//         return skills;
//     }

//     public void setSkills(String skills) {
//         this.skills=skills;
//     }
    

    @Override
    public String toString() {
        return "Skill [firstname=" + firstname + ", lastname=" + lastname + ", age=" +  age]";
    }

}
