package Testes;

import java.util.ArrayList;
import java.util.List;

public class Combnacao_de_String {
    private StringBuilder out = new StringBuilder();
    private String in;
    private List<String> combinations = new ArrayList<>();

    public Combnacao_de_String(final String str){
        in = str;
    }

    public Combnacao_de_String() {

    }

    public void combine() {
        combine(0);
    }

    private void combine(int start) {
        for(int i = start; i < in.length(); ++i){
            out.append(in.charAt(i));
            combinations.add(out.toString());
            if(i < in.length()) {
                combine(i + 1);
            }
            out.setLength(out.length() - 1);
        }
    }

    public List<String> getCombinations() {
        return combinations;
    }

    public void conexao(){
        final String str = "abcde";
        final Combnacao_de_String generator = new Combnacao_de_String(str);
        generator.combine();
        System.out.println(generator.getCombinations());
    }
}
