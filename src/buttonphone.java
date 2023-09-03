public class buttonphone extends landphone {

    public buttonphone(String name, int number){
        super(name, number);
    }

    public void sms(){
        System.out.println(name+ " can sms");
    }
}
