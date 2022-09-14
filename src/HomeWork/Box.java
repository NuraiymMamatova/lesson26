package HomeWork;

public class Box <T>{
private T argument;

    @Override
    public String toString() {
        return "Box: " +
                "\nargument: " + argument;
    }

    static  <T> T method (T argument){
       return argument;
    }

    public Box(T argument) {
        this.argument = argument;
    }

    public T getArgument() {
        return argument;
    }

    public void setArgument(T argument) {
        this.argument = argument;
    }
}


