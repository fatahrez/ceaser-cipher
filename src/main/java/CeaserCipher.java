public class CeaserCipher {
    public boolean doCeaserCipher (String wordForCeaserCipher){
        int wordConfirm = Integer.parseInt(wordForCeaserCipher);
        Boolean test = wordForCeaserCipher.equals(wordConfirm);
//        Integer changeIntTestToString = Integer.parseInt(test);
        return test;
    }
}
