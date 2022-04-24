public class Student extends Human{
    int course = 1;
    String university = "CZU";
    String[] exams = {"math", "english", "czeck"};

    public Student(){
    }

    public Student(int h, int w, int c){
        super.height = h;
        super.weight = w;
        this.course = c;
    }
    public void Say(){
        System.out.println("Hello, I am " + name);
    }

    void Tell(){
        super.name = "Nikita";
        System.out.println("Hello, my name is " + super.name + ". I study in " + university);
    }
    void SaySomething(){
        System.out.println("Hi i am " + super.name + ". My weight is " + super.weight + ".\n" +
                "My height is " + super.height + " I study at " + this.course + "-th course");
    }
}
