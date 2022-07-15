package AT8585;
public class test1 {
    public static void main(String[] arg) {
        String[] arr = {"이영민","벌쳐","히드라"};

        Driver(arr);




    }
    public static void Driver(String[] arr) {
        for(int i = 0; i< arr.length; i++ ){
            if(arr[i] == arr[0]){
                System.out.println(arr[i]);
                System.out.println("이 드라이버는 달릴수 없습니다");
                break;
            }
        }
    }
}