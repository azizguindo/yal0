package yal.arbre.expressions;

public class ConstanteEntiere extends Constante {
    
    public ConstanteEntiere(String texte, int n) {
        super(texte, n) ;
    }

    @Override
    public String toMIPS() { System.out.println(cste);
        StringBuilder stringBuilder = new StringBuilder("");
        stringBuilder.append("li $v0 , 1 \t# $v0 <- 1 (code du print entier)\n");
        stringBuilder.append("li $a0 ,"+cste+"\n");
        stringBuilder.append("syscall \t# afficher\n");
        return String.valueOf(stringBuilder);
    }

}
