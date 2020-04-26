import java.util.Optional;

public class Java8 {


        public static void lambdaMethod(){

            MathOperation subtraction =   ( a,  b) -> a - b;
            MathOperation addition =   (int a, int b) -> a + b;

            System.out.println("Addition : " + addition.operation(2, 6));
            System.out.println("Subtraction : " + subtraction.operation(10, 6));
        }

        public interface MathOperation{
            int operation(int a, int b);
        }


        public static void optional(){

            //to add else
            Optional<String> GOT = Optional.of("Game of Thrones");
            Optional<String> nothing = Optional.empty();

            System.out.println(GOT.orElse("Default Value"));
            System.out.println(nothing.orElse("Default Value"));

            //To check null value
            String[] str = new String[10];
            Optional<String> isNull = Optional.ofNullable(str[9]);
            if(isNull.isPresent()){
                String str2 = str[9].substring(2, 5);
                System.out.print("Substring is: "+ str2);
            }
            else{
                System.out.println("Cannot get the substring from an empty string");
            }

        }

}
