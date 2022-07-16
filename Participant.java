package lab5;

public class Participant
{
    String studentname;
    private Registration [] studentregistrations = new Registration[0];
    public Participant(String studentname)
    {
        this.studentname = studentname;
    }
    public Registration [] getRegistrations()
    {
        return this.studentregistrations;
    }
    public String getGPAReport()
    {
        String lettergrade = "";
        String conclusion = "";
        double numericalgradepointaverage = 0;
        int scalegradepointaverage = 0;
        if (studentregistrations.length==0)
        {
            return String.format("No GPA available yet for %s", this.studentname);
        }
        for (int i =0; i<studentregistrations.length; i++)
        {
            if (studentregistrations[i].getMarks()  >= 0 && studentregistrations[i].getMarks()  <= 49)
            {
                scalegradepointaverage = 0;
                lettergrade = "F";
            }
            if (studentregistrations[i].getMarks()  >= 50 && studentregistrations[i].getMarks()  <= 59)
            {
                scalegradepointaverage = 5;
                lettergrade = "D";
            }
            if (studentregistrations[i].getMarks()  >= 60 && studentregistrations[i].getMarks()  <= 69)
            {
                scalegradepointaverage = 6;
                lettergrade = "C";
            }
            if (studentregistrations[i].getMarks()  >= 70 && studentregistrations[i].getMarks()  <= 79)
            {
                scalegradepointaverage = 7;
                lettergrade = "B";
            }
            if (studentregistrations[i].getMarks()  >= 80 && studentregistrations[i].getMarks()  <= 89)
            {
                scalegradepointaverage = 8;
                lettergrade = "A";
            }
            if (studentregistrations[i].getMarks()  >=90)
            {
                scalegradepointaverage = 9;
                lettergrade = "A+";
            }
            if (i==studentregistrations.length-1)
            {
                conclusion += String.format("%d (%s)", scalegradepointaverage, lettergrade);
            }
            else
            {
                conclusion += String.format("%d (%s), ", scalegradepointaverage, lettergrade);
            }
            numericalgradepointaverage = numericalgradepointaverage + scalegradepointaverage;
        }
        numericalgradepointaverage = numericalgradepointaverage/studentregistrations.length;
        double exactgradepointaverage = (numericalgradepointaverage*10)/10.0;
        return String.format("%s's GPA of {%s}: %.1f", this.studentname,conclusion,exactgradepointaverage);
    }
    public int marksOf(String marksof) {
        int mark = -1;
        for (int i = 0; i < studentregistrations.length; i++)
        {
            if (marksof.equals(studentregistrations[i].getTitle()))
            {
                return studentregistrations[i].getMarks();
            }
        }
        return mark;
    }

    public void addRegistration(Registration add) {
        Registration[] newregistration =  new Registration[studentregistrations.length + 1];
        if(studentregistrations.length < 5)
        {
            for (int i = 0; i < studentregistrations.length; i++)
            {
                newregistration[i] = studentregistrations[i];
            }
            newregistration[newregistration.length - 1] = add;
            studentregistrations = newregistration;
        }
    }
    public void addRegistration(String add)
    {
        Registration things = new Registration(add);
        Registration[] additionalstudentregistration =  new Registration[studentregistrations.length + 1];
        if(studentregistrations.length < 5)
        {
            for (int i = 0; i < studentregistrations.length; i++)
            {
                additionalstudentregistration[i] = studentregistrations[i];
            }
            additionalstudentregistration[additionalstudentregistration.length - 1] = things;
            studentregistrations = additionalstudentregistration;
        }
    }

    public void updateMarks(String classname, int updatedmark)
    {

        for(int i = 0; i<studentregistrations.length; i++)
        {
            if (classname.equals(studentregistrations[i].getTitle()))
            {
                studentregistrations[i].setMarks(updatedmark);
            }
        }
    }
    public void clearRegistrations() {
        studentregistrations = new Registration[0];
    }
}


