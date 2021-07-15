import java.util.Scanner;
        import java.util.StringJoiner;

class Average {
    private int data[];
    private double mean;

    public Average() {
        this.data = new int[5];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < this.data.length; i++) {
            System.out.printf("Enter the score %d: ", i + 1);
            data[i] = scanner.nextInt();
        }
        calculateMean();
        selectionSort();
    }

    public void calculateMean() {
        int sum = 0;
        for (int i : this.data)
            sum += i;
        this.mean = 1.0 * sum / this.data.length;
    }

    public String toString() {
        StringJoiner joiner = new StringJoiner(", ");
        StringBuilder builder = new StringBuilder();
        for (int i : this.data)
            joiner.add(String.valueOf(i));
        return String.format("The average of the array is %f.\nThe descending sorted array is: %s",
                this.mean, joiner.toString());
    }

    public void selectionSort() {
        for (int i = 0; i < this.data.length; i++) {
            int val = this.data[i], pos = i;
            for (int j = i; j < this.data.length; j++) {
                if (this.data[j] > val) {
                    pos = j;
                    val = this.data[j];
                }
            }
            this.data[pos] = this.data[i];
            this.data[i] = val;
        }
    }
}

public class AverageDriver {
    public static void main(String[] args) {
        Average avg = new Average();
        System.out.println(avg);
    }
}