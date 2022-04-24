public class My_Test_Interface_class implements Test_Interface{
    @Override
    public String story(String str) {
        return str;
    }

    @Override
    public int nums(int i) {
        i++;
        return i;
    }
}
