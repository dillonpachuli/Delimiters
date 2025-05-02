import java.util.ArrayList;

public class Delimiters{
    private String openDel;

    private String closeDel;

    public Delimiters(String open, String close){
        openDel = open;
        closeDel = close;
    }

    public ArrayList<String> getDelimitersList(String[] tokens){
        ArrayList<String> delimiters = new ArrayList<String>();
        for (String token: tokens){
            if (token.equals(openDel) || token.equals(closeDel)) delimiters.add(token);
        }
        return delimiters;
    }

    public boolean isBalanced(ArrayList<String> delimiters){
        int openDelCount = 0;
        int closeDelCount = 0;
        for (int i = 0; i < delimiters.size(); i++){
            if (closeDelCount > openDelCount) return false;
            else if (delimiters.get(i).equals(openDel)) openDelCount++;
            else if (delimiters.get(i).equals(closeDel)) closeDelCount++;
        }
        return openDelCount == closeDelCount;
    }
}