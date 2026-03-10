// bounded types = you can create the objects of a generic class to have data of specific derived types ex.Number
public class boundedTypes
{
     public static class MyGenericClass <Thing extends Number,Thing1 extends Number>{
         //
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
    MyGenericClass<Integer,Integer> myInt = new MyGenericClass<>(1,5);
        MyGenericClass<Double,Double> myDouble = new MyGenericClass<>(3.14,9.21);
        /* cannot use these below now because Thing and Thing1 extends Number class and String and Character data types 
         are not in Number class that's how you bound the generic class..*/
        // MyGenericClass<Character,Character> myChar = new MyGenericClass<>('@','$');
        // MyGenericClass<String,Integer> myString = new MyGenericClass<>("Hello",98);
        System.out.println(myInt.getValue1());
        System.out.println(myInt.getValue2());
        System.out.println(myDouble.getValue1());
        System.out.println(myDouble.getValue2());
        // System.out.println(myChar.getValue1());
        // System.out.println(myChar.getValue2());
        // System.out.println(myString.getValue1());
        // System.out.println(myString.getValue2());
    }
}
