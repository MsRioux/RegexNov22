public class Student
{
    private String name;
    private int height;// in inches
    private int age;
    private String SSN;

    public Student(String name, int height, int age) {
        setName(name);
        this.height = height;
        this.age = age;
    }
    public Student ()
    {
        name = "";
        height = 0;
        age = 0;
    }


    public int getAge() {
        return age;
    }

    public int getHeight() {
        return height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(!name.matches("[A-Z][a-zA-Z]*"))
        {
//            System.out.println("NOPE!");
            this.name = "Reginald";
        }
        else
        {
            this.name = name;
        }
    }//adding a test comment

    public String getSSN() {
        return SSN;
    }
    //SSN format is  3 digits, dash, 2 digits, dash, 4 digits
    public void setSSN(String SSN)
    {
        if(SSN.matches("[0-9]{3}-[0-9]{2}-[0-9]{4}")) {
            this.SSN = SSN;
        }
        else {
            this.SSN = "Please Try Again";
        }
    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", height=" + height +
                ", age=" + age +
                '}';
    }
}
