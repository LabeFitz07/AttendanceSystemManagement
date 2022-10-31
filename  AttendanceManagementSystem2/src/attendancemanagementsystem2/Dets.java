
package attendancemanagementsystem2;


public class Dets {
    
    private int Uage;
    private String Uid, Ufname, Umname, Ulname, Ugender, Ucourse, Ustatus, Utimein, Utimeout;

    public Dets(String id, int age, String fname, String mname, String lname, String gender, String course, String status, String timein, String timeout) {
        this.Uid = id;
        this.Uage = age;
        this.Ufname = fname;
        this.Umname = mname;
        this.Ulname = lname;
        this.Ugender = gender;
        this.Ucourse = course;
        this.Ustatus = status;
        this.Utimein = timein;
        this.Utimeout = timeout;
    }

    public String getId() {
        return this.Uid;
    }

    public void setId(String id) {
        this.Uid = id;
    }

    public int getAge() {
        return this.Uage;
    }

    public void setAge(int age) {
        this.Uage = age;
    }

    public String getFname() {
        return this.Ufname;
    }

    public void setFname(String fname) {
        this.Ufname = fname;
    }

    public String getMname() {
        return this.Umname;
    }

    public void setMname(String mname) {
        this.Umname = mname;
    }

    public String getLname() {
        return this.Ulname;
    }

    public void setLname(String lname) {
        this.Ulname = lname;
    }

    public String getGender() {
        return this.Ugender;
    }

    public void setGender(String gender) {
        this.Ugender = gender;
    }

    public String getCourse() {
        return this.Ucourse;
    }

    public void setCourse(String course) {
        this.Ucourse = course;
    }

    public String getStatus() {
        return Ustatus;
    }

    public void setStatus(String status) {
        this.Ustatus = status;
    }

    public String getTimein() {
        return Utimein;
    }

    public void setTimein(String timein) {
        this.Utimein = timein;
    }

    public String getTimeout() {
        return Utimeout;
    }

    public void setTimeout(String timeout) {
        this.Utimeout = timeout;
    }  
}
    

