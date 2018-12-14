public class HiddenWord {

    private String word;

    public HiddenWord(String word){
        this.word = word;
    }

    public String getHint(String tester){
        String hint = "";
        String FinalHint = "";
        int testindex = 0;
        for(int i = 0; i < this.word.length(); i++) {
            if (this.word.substring(i, i + 1).toUpperCase().equals(tester.substring(i, i + 1).toUpperCase())) {
                hint = hint + tester.substring(i, i + 1);
            } else {
                hint = hint + "*";
            }
        }
        /*while(testindex < this.word.length()){
            for(int a = 0; a < this.word.length(); a++){
                if(hint.substring(a, a+1).equals("*") && this.word.substring(a,a+1).equals(tester.substring(testindex, testindex+1))){
                    FinalHint = hint.substring(0,a) + "+" + hint.substring(a+1);
                }
            }
            testindex++;
        }*/

        return hint;
    }
}
