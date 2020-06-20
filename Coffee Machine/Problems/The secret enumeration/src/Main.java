
public class Main {
    //enum Secret {
        //STAR, CRASH, START, STARTER;
    //}
    public static void main(String[] args) {
        Secret[] array = Secret.values();
        int count = 0;
        for(int i = 0; i < array.length; i++) {
            if (array[i].toString().startsWith("STAR")) {
                count += 1;
            }
        }
        System.out.print(count);
    }
}

