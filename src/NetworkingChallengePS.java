import java.util.ArrayList;
import java.util.HashMap;

public class NetworkingChallengePS{


    // 5 points
    static ArrayList<Integer> Q1(){
        // Send an HTTP GET request to the url http://fury.cse.buffalo.edu/api/challenge with a
        // parameter "question" set to the value "1" and a parameter "data" set to the value "numbers".
        // The response will be a comma separated list of integers. Return these integers in an ArrayList.

        return null;
    }


    // 5 points
    static HashMap<String, Integer> Q2(ArrayList<String> data){
        // Send an HTTP GET request to the url http://fury.cse.buffalo.edu/api/challenge with a
        // parameter "input" set to a value from the provided ArrayList. The API will return
        // a single integer as a String in response. Return a HashMap containing each String
        // from the input ArrayList as keys with each value set to the response from the
        // server when given that String as "input".

        return null;
    }


    // 5 points
    static int Q3(ArrayList<Integer> numbers){
        // Send an HTTP POST request to the url http://fury.cse.buffalo.edu/api/challenge
        // using DEFAULT_TEXT as the content type. The content of the POST request must be:
        // "Minimum: x
        //  Maximum: y"
        // Where there is only a new line character separating the two lines, x is the min value
        // in the input ArrayList, and y max value in the ArrayList. Return the response from the
        // server as an int.


        return 0;
    }


    public static void main(String[] args){

    }

}
