public class CeaserCipher {


    public String doCeaserCipher (String wordForCeaserCipher, int shiftIndex){
        StringBuffer result = new StringBuffer();
        String resultString = new String();
        for (int i=0; i < wordForCeaserCipher.length(); i++){
            if (Character.isUpperCase(wordForCeaserCipher.charAt(i))) {
                char charr = (char)(((int)wordForCeaserCipher.charAt(i) + shiftIndex - 65)% 26 + 65);
                result.append(charr);
                resultString = result.toString();
            }
            else {
                char charr = (char)(((int)wordForCeaserCipher.charAt(i)+ shiftIndex -97)% 26 + 97);
                result.append(charr);
                resultString = result.toString();
            }
        }
        return resultString;
    }
    public String unDoCeaserCipher(String wordForCeaserCipher, int shiftIndex){
       return doCeaserCipher(wordForCeaserCipher, 26 - shiftIndex);
    }
}