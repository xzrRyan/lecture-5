//git init adding .git into directory -- turning regular into git repo
public class gitfile {
    public static int countWords(String sentence){
        int spaceCount = 0;
        for (int i = 0; i < sentence.length(); i++){
            if(sentence.charAt(i) == ' '){
                spaceCount++;
            }
        }
        return spaceCount + 1;
    }
}
