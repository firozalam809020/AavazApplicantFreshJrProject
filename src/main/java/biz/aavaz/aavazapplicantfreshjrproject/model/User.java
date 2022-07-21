package biz.aavaz.aavazapplicantfreshjrproject.model;

//!!! Serialization to handle json snake case and java camel case
//!!! https://www.javadoc.io/doc/com.google.code.gson/gson/2.6.2/com/google/gson/annotations/SerializedName.html
//!!! https://sites.google.com/site/gson/gson-user-guide#TOC-JSON-Field-Naming-Support (JSON Field Naming Support)

public class User {
    private int id;
    private String name;
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "Skill [id=" + id + ", name=" + name + ", level=" + level + "]";
    }

}
