package lab5;

public class Instructor
{
    private String professorname;
    private int phonenumber;
    private String emailaddress;
    private String personalinfo = String.format("Instructor %s has campus phone extension %d and contact email %s",this.professorname, this.phonenumber, this.emailaddress);
    public Instructor(String professorname, int phonenumber, String emailaddress)
    {
        this.professorname = professorname;
        this.phonenumber = phonenumber;
        this.emailaddress = emailaddress;
    }
    public String getName()
    {
        return this.professorname;
    }
    public int getPhoneExtension()
    {
        return this.phonenumber;
    }
    public String getEmail()
    {
        return this.emailaddress;
    }
    public String getInformation()
    {
        return String.format("Instructor %s has campus phone extension %d and contact email %s",this.professorname, this.phonenumber, this.emailaddress);
    }
    public void setName(String professorname)
    {
        this.professorname = professorname;
    }
    public void setPhoneExtension(int phonenumber)
    {
        this.phonenumber = phonenumber;
    }
    public void setEmail(String emailaddress)
    {
        this.emailaddress = emailaddress;
    }

}

