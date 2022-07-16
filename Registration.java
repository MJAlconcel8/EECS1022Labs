package lab5;

public class Registration
{
   private String coursetitle;
   private int grademarks;
   private Instructor professorname;
   private String [] gradereports;
   private String studentinfo;
   public Registration(String coursetitle)
   {
        this.coursetitle = coursetitle;
        this.grademarks = 0;
   }
   public Registration(String coursetitle, Instructor professorname)
   {
       this.coursetitle = coursetitle;
       this.professorname = professorname;
   }
   public String getTitle()
   {
       return this.coursetitle;
   }
   public int getMarks()
   {
       return this.grademarks;
   }
   public Instructor getInstructor()
   {
       return this.professorname;
   }
   public String[] getGradeReport()
   {
       if (this.grademarks >=90 && this.grademarks <=100)
       this.gradereports = new String[]{"A+", "Exceptional"};
       else if (this.grademarks >=70 && this.grademarks <=79)
           this.gradereports = new String[]{"B", "Good"};
       else if (this.grademarks >=60 && this.grademarks <=69)
           this.gradereports = new String[]{"C", "Competent"};
       else if (this.grademarks >=50 && this.grademarks <=59)
           this.gradereports = new String[]{"D", "Passing"};
       else if (this.grademarks >=0 && this.grademarks <=49)
           this.gradereports = new String[]{"F", "Failing"};
       return this.gradereports;
   }
   public String getInformation()
   {
       if (professorname == null)
       {
           return String.format("%s has not yet been assigned an instructor",this.getTitle());
       }
       else if (this.grademarks >=80 && this.grademarks <=89)
       {
           return this.studentinfo = String.format("%s, taught by %s, is completed with raw marks %d (A ; Excellent)",this.coursetitle, this.professorname.getName(), this.grademarks);
       }
       else if (this.grademarks >=70 && this.grademarks <=79)
       {
           return this.studentinfo = String.format("%s, taught by %s, is completed with raw marks %d (B ; Good)",this.coursetitle, this.professorname.getName(), this.grademarks);
       }
       else if (this.grademarks >=60 && this.grademarks <=69)
       {
           return this.studentinfo = String.format("%s, taught by %s, is completed with raw marks %d (C ; Competent)",this.coursetitle, this.professorname.getName(), this.grademarks);
       }
       else if (this.grademarks >=50 && this.grademarks <=59)
       {
           return this.studentinfo = String.format("%s, taught by %s, is completed with raw marks %d (D ; Passing)",this.coursetitle, this.professorname.getName(), this.grademarks);
       }
       else if (this.grademarks >=0 && this.grademarks <=49)
       {
           return this.studentinfo = String.format("%s, taught by %s, is completed with raw marks %d (F ; Failing)",this.coursetitle, this.professorname.getName(), this.grademarks);
       }
       return this.studentinfo = String.format("%s, taught by %s, is completed with raw marks %d (A+ ; Exceptional)",this.coursetitle, this.professorname.getName(), this.grademarks);
   }
    public void setMarks(int grademarks)
    {
        this.grademarks = grademarks;
    }
    public void setInstructor(Instructor professorname)
    {
        this.professorname = professorname;
    }
}