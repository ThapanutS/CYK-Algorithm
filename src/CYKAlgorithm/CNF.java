package CYKAlgorithm;
/*
"Producer"
Thapanut Saripat
Trisinchai Kamjamnong
Piyabute Chairiboon
Sirapop Promrit
Kanittee Rodpuek
#Made when 25/03/2021
 */
import java.util.ArrayList;

public class CNF {

    private char startRule;
    private char ruleLeft;
    private ArrayList<String> ruleRight = null;

    public CNF(char startRule,char ruleLeft,ArrayList ruleRight){
        this.startRule = startRule;
        this.ruleLeft = ruleLeft;
        this.ruleRight = ruleRight;
    }

    public Character getStartRule(){
        return startRule;
    }

    public Character getRuleLeft(){
        return ruleLeft;
    }

    public ArrayList getRuleRight(){
        return ruleRight;
    }

}
