// generic classes
public class genericClasses
{
    /*public static class MyIntegerClass{
        Integer x;
        MyIntegerClass(Integer x){
            this.x=x;
        }
        public Integer getValue(){
            return x;
        }
    }
    public static class MyDoubleClass{
        Double x;
        MyDoubleClass(Double x){
            this.x=x;
        }
        public Double getValue(){
            return x;
        }
    }
    public static class MyCharacterClass{
        Character x;
        MyCharacterClass(Character x){
            this.x=x;
        }
        public Character getValue(){
            return x;
        }
    }
    public static class MyStringClass{
        String x;
        MyStringClass(String x){
            this.x=x;
        }
        public String getValue(){
            return x;
        }
    }*/
    //instead of using all of these mentioned above we can use 1 generic class
    /*public static class MyGenericClass <Thing>{
        Thing x;
        MyGenericClass(Thing x){
            this.x=x;
        }
        public Thing getValue(){
            return x;
        }
    }*/     //for one datatype
    
    
    public static class MyGenericClass <Thing,Thing1>{
        Thing x;
        Thing1 y;
        MyGenericClass(Thing x,Thing1 y){
            this.x=x;
            this.y=y;
        }
        public Thing getValue1(){
            return x;
        }
        public Thing1 getValue2(){
            return y;
        }
    }
    public static void main(String args[]){
        /*MyIntegerClass myInt = new MyIntegerClass(1);
        MyDoubleClass myDouble = new MyDoubleClass(3.14);
        MyCharacterClass myChar = new MyCharacterClass('@');
        MyStringClass myString = new MyStringClass("Hello");
        System.out.println(myInt.getValue());
        System.out.println(myDouble.getValue());
        System.out.println(myChar.getValue());
        System.out.println(myString.getValue());*/
        
        //for one value only
        /*MyGenericClass<Integer> myInt = new MyGenericClass<>(1);
        MyGenericClass<Double> myDouble = new MyGenericClass<>(3.14);
        MyGenericClass<Character> myChar = new MyGenericClass<>('@');
        MyGenericClass<String> myString = new MyGenericClass<>("Hello");
        System.out.println(myInt.getValue());
        System.out.println(myDouble.getValue());
        System.out.println(myChar.getValue());
        System.out.println(myString.getValue());*/
        
        
        //for more than one value
        MyGenericClass<Integer,Integer> myInt = new MyGenericClass<>(1,5);
        MyGenericClass<Double,Double> myDouble = new MyGenericClass<>(3.14,9.21);
        MyGenericClass<Character,Character> myChar = new MyGenericClass<>('@','$');
        MyGenericClass<String,Integer> myString = new MyGenericClass<>("Hello",98);
        System.out.println(myInt.getValue1());
        System.out.println(myDouble.getValue1());
        System.out.println(myChar.getValue1());
        System.out.println(myString.getValue1());
        System.out.println(myInt.getValue2());
        System.out.println(myDouble.getValue2());
        System.out.println(myChar.getValue2());
        System.out.println(myString.getValue2());
    }
}
