package APCSAGuides.Lesson5;

public class Demo07 {
    public static void main(){
        for(int i = 0; i <= 10; i++){
            System.out.println(i);
        }
        int j = 0;
        while(j <= 10){
            System.out.println(j);
            j++;
        }
        int k = 0;
        while(true){ // 这个只是为了这个空里面有个东西 没有实际意义
            System.out.println(k);
            if (k >= 10){
                break;
            }
        }
    }
}
