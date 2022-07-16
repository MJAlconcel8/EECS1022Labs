package lab5;

public class OnlineSchool
{
    private Participant[] studentparticpants = new Participant[0];

    public void addParticipant(Participant student)
    {
        Participant[] list = new Participant[studentparticpants.length + 1];
        if (studentparticpants.length != 100)
        {
            for (int i = 0; i < this.studentparticpants.length; i++)
                list[i] = this.studentparticpants[i];
            list[list.length - 1] = student;
            this.studentparticpants = list;
        }
    }

    public Participant[] getParticipants(String courses)
    {
        Participant[] studentparticipants = new Participant[0];
        for (int i = 0; i < studentparticpants.length; i++)
        {
            Registration[] registrations = studentparticpants[i].getRegistrations();
            for (int j = 0; j < registrations.length; j++)
            {
                if (registrations[j].getTitle().equals(courses))
                {
                    Participant[] using = new Participant[studentparticipants.length + 1];
                    for (int k = 0; k < studentparticipants.length; k++)
                        using[k] = studentparticipants[k];
                    using[using.length - 1] = studentparticpants[i];
                    studentparticipants = using;
                }
            }
        }
        return studentparticipants;
    }

}
