package lecture.codes.CollectionsAndGenerics.VarArgs;

public class VarArgs {
    static void main(String[] args) {
        System.out.println(sum(4,5));
        System.out.println(sum(4,5,6));
        System.out.println(sum(4,5,6,7,8));
        System.out.println(sum(4,5,7,6,4,7,4,6));

    }

    public static int sum(int first, int second, int...a){
        int sum = first + second;
        for(int i : a){
            sum += i;
        }
        return sum;
    }

    public static int sum(int a, int b){
        return a+b;
    }
}
