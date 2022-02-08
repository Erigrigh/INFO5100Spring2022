package com.algorithm;

public class Main {

    public static void main(String[] args) {

        System.out.println();
        AllUniqueCharacters auc = new AllUniqueCharacters();

        auc.checkUniqueCharacters("abcdefgab");
        auc.checkUniqueCharacters("abcdefg");
        auc.checkUniqueCharacters("");
        auc.checkUniqueCharacters(" ");
        auc.checkUniqueCharacters("a");
        auc.checkUniqueCharacters("aa");
        auc.checkUniqueCharacters("ab");

        AllUniqueCharacters auc1 = new AllUniqueCharacters();
        auc1.checkUniqueCharacters("1234561");
        auc1.checkUniqueCharacters("123456");
    }
}
