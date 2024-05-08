public abstract class AbstractClass {

    String dogName;
    int dogAge;
    String dogColor;

    public AbstractClass() {
    }

    public AbstractClass(String dogName, int dogAge, String dogColor) {
        this.dogName = dogName;
        this.dogAge = dogAge;
        this.dogColor = dogColor;
    }

   abstract String dogBreed();

    public void print(){

        System.out.println("The name of the Dog is "+dogName+ "she is "+((dogAge==8||dogAge==18)?"an":"a")+dogAge+"year Old"+dogColor+"breed");
    }

}


class Canine extends AbstractClass {


    public Canine(String dogName, int dogAge, String dogColor) {
        super(dogName, dogAge, dogColor);
    }

    @Override
    String dogBreed() {
        return "bull";
    }
}
class bulldog extends AbstractClass{


    public bulldog(String dogName, int dogAge, String dogColor) {
        super(dogName, dogAge, dogColor);
    }

    @Override
    String dogBreed() {
        return "bull";
    }

    public static void main(String[] args) {
        AbstractClass c =new Canine("folake",8,"purple");
        AbstractClass d =new bulldog("folake",7,"purple");
        d.print();
        c.print();
    }


}
