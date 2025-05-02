import java.util.ArrayList;

public class Main{
    public static void main(String[] args){
        Delimiters d1 = new Delimiters("(", ")");
        String[] tokens1 = {"(", "x + y", ")", " * 5"};
        System.out.println(d1.getDelimitersList(tokens1));

        Delimiters d2 = new Delimiters("<q>", "</q>");
        String[] tokens2 = {"<q>", "yy", "</q>", "zz", "</q>"};
        System.out.println(d2.getDelimitersList(tokens2));

        Delimiters d3 = new Delimiters("<sup>", "</sup>");
        String[] a = {"<sup>", "<sup>", "</sup>", "<sup>", "</sup>", "</sup>"};
        ArrayList<String> del1 = new ArrayList<String>();
        for (String string: a) del1.add(string);
        System.out.println(d3.isBalanced(del1));

        String[] b = {"<sup>", "</sup>", "</sup>", "<sup>"};
        ArrayList<String> del2 = new ArrayList<String>();
        for (String string: b) del2.add(string);
        System.out.println(d3.isBalanced(del2));

        String[] c = {"</sup>"};
        ArrayList<String> del3 = new ArrayList<String>();
        for (String string: c) del3.add(string);
        System.out.println(d3.isBalanced(del3));

        String[] d = {"<sup>", "<sup>", "</sup>"};
        ArrayList<String> del4 = new ArrayList<String>();
        for (String string: d) del4.add(string);
        System.out.println(d3.isBalanced(del4));
    }
}
