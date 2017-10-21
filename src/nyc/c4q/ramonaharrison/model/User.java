package nyc.c4q.ramonaharrison.model;

import org.json.simple.JSONObject;


public class User {
    private String userInput;

    //TODO @ Muhaimen and Tati- all the fields arent declared an implement. Also the piglatin logic doesnt seem to belong here and is already implemented in the Bot.java file.
    // TODO: implement private fields for each of the following user JSON keys:

    private String id;
    private String name;
    private String deleted;
    private String color;
    private String profile;
    private boolean is_admin;
    private boolean is_owner;
    private boolean is_primary_owner;
    private boolean is_restricted;
    private boolean is_ultra_restricted;
    private String has_2fa;
    private String two_factor_type;
    private boolean has_files;

    public User(JSONObject json) {

        if (json.get("id") != null) {
            this.id= (String) json.get("id");
        }

        if (json.get("name") != null) {
            this.name = (String) json.get("name");
        }

        if (json.get("deleted") != null) {
            this.deleted = (String) json.get("deleted");
        }
        if (json.get("color") != null) {
            this.color = (String) json.get("color");
        }
        if (json.get("profile") != null) {
            this.profile = (String) json.get("profile");
        }
        if (json.get("is_admin") != null) {
            this.is_admin = (boolean) json.get("is_admin");
        }
        if (json.get("is_owner") != null) {
            this.is_owner = (boolean) json.get("is_owner");
        }
        if (json.get("is_primary_owner") != null) {
            this.is_primary_owner = (boolean) json.get("is_primary_owner");
        }
        if (json.get("is_restricted") != null) {
            this.is_restricted = (boolean) json.get("is_restricted");
        }
        if (json.get("is_ultra_restricted") != null) {
            this.is_ultra_restricted = (boolean) json.get("is_ultra_restricted");
        }
        if (json.get("has_2fa") != null) {
            this.has_2fa = (String) json.get("has_2fa");
        }
        if (json.get("two_factor_type") != null) {
            this.two_factor_type= (String) json.get("two_factor_type");
        }

        if (json.get("has_files") != null) {
            this.has_files = (boolean) json.get("has_files");
        }


    
    private String pigLatin;   // "name"
   

   

    public String getUserInput() {
        return userInput;
    }

    public String getPigLAtin() {
        return pigLatin;
    }

    public String getId() {
        return id;
    }

    public void setUserInput(String userInput) {
        this.userInput = userInput;

    }

    public void setPigLAtin(String pigLAtin) {

        this.pigLatin = pigLatin;
    }

    public void translate(JSONObject json) {
        if (json.get("userInput") != null) {
            this.userInput = (String) json.get("userInput");

        }
        if (json.get("pigLatin") != null) {
            this.pigLatin = pigLatin;
        }
    }

    public String wordToPigLatin(String word) {
        String wordSubstring = word.substring(1);
        char firstChar = word.charAt(0);
        String ay = "ay";
        String nonLowerCaseResult = wordSubstring + firstChar + ay;
        return nonLowerCaseResult.toLowerCase();
    }

    public String sentenceToPigLatin(String sentence) {
        String[] wordArray = sentence.split(" ");
        for (int i = 0; i < wordArray.length; i++) {
            // v3
            String word = wordArray[i];
            String pigLatin = wordToPigLatin(word);
            wordArray[i] = pigLatin;
        }

        String pigLatinSentence = "";
        for (int i = 0; i < wordArray.length; i++) {
            String space = " ";
            pigLatinSentence += wordArray[i];

            int lastIndex = wordArray.length - 1;
            if (i != lastIndex) {
                pigLatinSentence += space;
            }
        }
        return capitlize(pigLatinSentence);

    }

    public String capitlize(String sentence) {
        String firstLetter= sentence.substring(0,1);
        String capFirstLetter=firstLetter.toUpperCase();
        String restOfSentence= sentence.substring(1);
        return capFirstLetter+restOfSentence;
    }


    // TODO add getters to access private fields
}


