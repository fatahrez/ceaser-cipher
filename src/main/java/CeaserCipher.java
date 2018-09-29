public class CeaserCipher {
    public StringBuffer doCeaserCipher (String wordForCeaserCipher, int shiftIndex){
        StringBuffer result = new StringBuffer();
        for (int i=0; i<wordForCeaserCipher.length(); i++){
            if (Character.isUpperCase(wordForCeaserCipher.charAt(i))) {
                char ch = (char)(((int)wordForCeaserCipher.charAt(i) + shiftIndex - 65)% 26 + 65);
                result.append(ch);
            }
            else {
                char ch = (char)(((int)wordForCeaserCipher.charAt(i)+ shiftIndex -97)% 26 + 97);
                result.append(ch);
            }
        }
        System.out.println(result);
        return result;
    }
}
