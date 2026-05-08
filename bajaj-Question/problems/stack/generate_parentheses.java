import java.util.*;
class Generate_Parenthesis {
    public List<String> generateParenthesis(int n) {
        ArrayList<String> list = new ArrayList<>();
        solve(list,n,0,0,"");
        return list;
    }
    static void solve(ArrayList<String> list , int n , int o , int e , String curr){
        if(curr.length()==2*n){
            list.add(new String(curr));
            return;
        }
        if(o<n){
            solve(list,n,o+1,e,curr+"(");
        }
        if(e<o){
            solve(list,n,o,e+1,curr+")");
        }
    }
}