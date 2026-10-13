public class Test {
    public static void main(String[] args) {
        System.out.println("Hello from Jenkins!");
        int sum = 2 + 3;
        System.out.println("2 + 3 = " + sum);

        if (sum == 5) {
            System.out.println("Test passed");
        } else {
            System.out.println("Test failed");
            System.exit(1); // non-zero exit makes the Jenkins build fail
        }
    }
}