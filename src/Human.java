public class Human {
    public String name = "Ivan";
    public int weight=80, height=180;

    public void Say(){
        System.out.println("Hi, my name is " + name);
    }

    //Constructors
    public Human(){
    }
    public Human(String n, int h){
        name = n;
        height = h;
    }
}
