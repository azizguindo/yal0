package yal.arbre.expressions;

public class ConstanteEntiere extends Constante {
    
    public ConstanteEntiere(String texte, int n) {
        super(texte, n) ;
    }

    @Override
    public String toMIPS() {
        StringBuilder stringBuilder = new StringBuilder("");
        stringBuilder.append("li $v0 , 1 \n");
        stringBuilder.append("li $a0 , "+cste+"\n");
        stringBuilder.append("syscall\n");
        return String.valueOf(stringBuilder);
    }

}
