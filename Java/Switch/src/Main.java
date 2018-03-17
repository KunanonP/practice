public class Main {

    public static void main(String[] args) {
	char switchChar = 'E';

        switch(switchChar){
            case 'A':
                System.out.println("char was A");
                break;
            case 'B':
                System.out.println("char was B");
                break;
            case 'C':
                System.out.println("char was C");
                break;
            case 'D':
                System.out.println("char was D");
                break;
            case 'E':
                System.out.println("char was " + switchChar);
                break;
            default:
                System.out.println("char not found");
                break;
        }

    String switchString = "aLphA";
        switch(switchString.toLowerCase()){
            case "alpha":
                System.out.println("Alpha detected");
                break;
            case "Beta":
                System.out.println("Beta detected");
                break;
            default:
                System.out.println("no Alpha or Beta detected");
                break;
        }
    }
}
