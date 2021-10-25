public class Arithmetic {

    private int a;
    private int b;

    public int add(int a , int b)
    {
        return a + b;
    }

}

class Adder extends Arithmetic {
}

class Test{

    public static void main(String[] args) {
        Arithmetic d = new Arithmetic();
        System.out.println(d.add(2 , 3));
    }
}

