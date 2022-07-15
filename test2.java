package AT8585;

public class test2 {
    public static void main(String[] arg) {
        String[] arr = {"이영민","벌쳐","히드라","배틀크루저"};

        Driver(arr);




    }
    public static void Driver(String[] arr) {
        for(int i = 0; i<2; i++ ){
            if( i < 3 ){
                System.out.println( i +"번째 :" + arr[i] );


            }
        }
    }
}