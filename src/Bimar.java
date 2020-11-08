import java.util.ArrayList;

public class Bimar {
    private String name;
    private  int date;
    private String gender;
    private String insurance;
    private String insurancePlus;
    private String job;
    private String location ;
    private String education;
    private int code;
    private ArrayList<String> doctors = new ArrayList<>();
    private Information info = new Information();

    public Bimar(int code) {

        this.code = code;
    }


    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDate() {

        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public String getGender() {

        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getInsurance() {

        return insurance;
    }

    public void setInsurance(String insurance) {
        this.insurance = insurance;
    }

    public String getInsurancePlus() {

        return insurancePlus;
    }

    public void setInsurancePlus(String insurancePlus) {
        this.insurancePlus = insurancePlus;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }


    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getEducation() {

        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public int getCode() {

        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public ArrayList<String> getDoctors() {
        return doctors;
    }

    public void setDoctors(ArrayList<String> doctors) {
        this.doctors = doctors;
    }

    public void listOfTrustedDr(){}

    public void AddDr(){}

    public void removeDe(){}




}
