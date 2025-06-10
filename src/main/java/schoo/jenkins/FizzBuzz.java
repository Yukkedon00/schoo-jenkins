package schoo.jenkins;

public class FizzBuzz {
    public String execute(int value) {
        if (value % 15 == 0) {
            return "FizzBuzz";
        } else if (value % 3 == 0) {
            return "FizzFizz";
        } else if (value % 5 == 0) {
            return "BuzzBuzz";
        } else {
            return String.valueOf(value);
        }
    }
}
