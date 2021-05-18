public class FizzBuzz {
    private int number;

    public FizzBuzz(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public static String fizzBuzz(int number) {
        boolean isFizz = number % 3 == 0;
        boolean isBuzz = number % 5 == 0;
        if (isFizz && isBuzz) {
            return "FizzBuzz";
        }
        if (isFizz) {
            return "Fizz";
        }
        if (isBuzz) {
            return "Buzz";
        }
        return numberToText(number);
    }

    public static String numberToText(int number) {
        String numberToText = "";
        int units = number % 10;
        int tens = (number % 100) / 10;
        if (tens == 3 || units == 3) {
            return "Fizz";
        } else if (tens == 5 || units == 5) {
            return "Buzz";
        } else {
            if (number > 10) {
                switch (tens) {
                    case 1:
                        numberToText += "Muoi ";
                        break;
                    case 2:
                        numberToText += "Hai ";
                        break;
                    case 4:
                        numberToText += "Bon ";
                        break;
                    case 6:
                        numberToText += "Sau ";
                        break;
                    case 7:
                        numberToText += "Bay ";
                        break;
                    case 8:
                        numberToText += "Tam ";
                        break;
                    case 9:
                        numberToText += "Chin ";
                        break;
                    default:
                        return numberToText;
                }
            }
            switch (units) {
                case 1:
                    numberToText += "Mot";
                    break;
                case 2:
                    numberToText += "Hai";
                    break;
                case 4:
                    numberToText += "Bon";
                    break;
                case 6:
                    numberToText += "Sau";
                    break;
                case 7:
                    numberToText += "Bay";
                    break;
                case 8:
                    numberToText += "Tam";
                    break;
                case 9:
                    numberToText += "Chin";
                    break;
            }
            return numberToText;
        }
    }
}

