public class Runner {

    public static void main(String[] args){
        HiddenWord Special = new HiddenWord("HARPS");

        System.out.println(Special.getHint("AAAAA"));
        System.out.println(Special.getHint("HELLO"));
        System.out.println(Special.getHint("HEART"));
        System.out.println(Special.getHint("HARMS"));
        System.out.println(Special.getHint("HARPS"));
    }
}
