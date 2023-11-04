package controller;

/**
 *
 * @author jcgd
 */
public class Controller {
    
    public String cypher(String input, int key){
        String alphabet = "abcdefghijklmnñopqrstuvwxyz";
        String result = "";
        if (key < 0){
            key = (alphabet.length()+key);
        }
        for (int x = 0; x < input.length();x++){
            char character = input.charAt(x);
            
            if (Character.isWhitespace(character) || Character.isDigit(character)){
               result = result+character; 
            }else if (Character.isUpperCase(character)){
               int position = (alphabet.indexOf(Character.toLowerCase(character))+key)%alphabet.length();
               result = result + Character.toUpperCase(alphabet.charAt(position));
            }else{
               int position = (alphabet.indexOf(Character.toLowerCase(character))+key)%alphabet.length();
               result = result + alphabet.charAt(position);
            }
        }
        return result;
    }
    
}
