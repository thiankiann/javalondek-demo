package pl.sda.javalondek4.java_demo2.optional;

import java.util.Optional;

/*
1) Zrob optionala , ktory bedzie mial w sobie :
    a)liczbe 42
    b)null-a
2) Napisz w naszej  metode generyczna, tworzaca Optional z T .
3) Rozpakuj co jest w Optionalu

 */
public class Testownia {
    public static void main(String[] args) {

  //Ad. 1
        Optional<Integer> number = Optional.of(42);

        System.out.println(number);

        Optional Null1 = Optional.ofNullable(null);

        Optional<String> poolPrint = Optional.ofNullable("Optional String");
        //System.out.println(methodOptional();
    }
//Ad. 2

    public static <T> void methodOptional(T optional){
        Optional<T> pool1 = Optional.ofNullable(optional);
// Ad.3
       // T unboxed = Optional.ofNullable(optional).orElseGet(optional);

       //unboxed = pool1.get();   // tak nie bo jak tam bedzie null -> to metoda get() wywali nam Exception

    //1*
        T unboxed ;
        if(pool1.isPresent()){
            unboxed = pool1.get();
        }else{
            unboxed = null;
        }
    //2*
        unboxed = pool1.orElse(null);



/*
1) Zrob optionala , ktory bedzie mial w sobie :
    a)liczbe 42
    b)null-a
2) Napisz w naszej  metode generyczna, tworzaca Optional z T .
3) Rozpakuj co jest w Optionalu

 */




        
    }
}

