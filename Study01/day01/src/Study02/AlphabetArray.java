package Study02;

public class AlphabetArray {
    public static void main(String[] args) {
        Alphabet[][] alphabet = new Alphabet[13][2];
        alphabet [0][0] = new Alphabet("a");
        alphabet [1][0] = new Alphabet("c");
        alphabet [2][0] = new Alphabet("e");
        alphabet [3][0] = new Alphabet("g");
        alphabet [4][0] = new Alphabet("i");
        alphabet [5][0] = new Alphabet("k");
        alphabet [6][0] = new Alphabet("m");
        alphabet [7][0] = new Alphabet("o");
        alphabet [8][0] = new Alphabet("q");
        alphabet [9][0] = new Alphabet("s");
        alphabet [10][0] = new Alphabet("u");
        alphabet [11][0] = new Alphabet("w");
        alphabet [12][0] = new Alphabet("y");
        alphabet [0][1] = new Alphabet("b");
        alphabet [1][1] = new Alphabet("d");
        alphabet [2][1] = new Alphabet("f");
        alphabet [3][1] = new Alphabet("h");
        alphabet [4][1] = new Alphabet("j");
        alphabet [5][1] = new Alphabet("l");
        alphabet [6][1] = new Alphabet("n");
        alphabet [7][1] = new Alphabet("p");
        alphabet [8][1] = new Alphabet("r");
        alphabet [9][1] = new Alphabet("t");
        alphabet [10][1] = new Alphabet("v");
        alphabet [11][1] = new Alphabet("x");
        alphabet [12][1] = new Alphabet("z");

        for(int i = 0; i < alphabet.length; i++) { // 행과 열 반복을 위해 for 문을 두번 사용
            for(int j = 0; j < alphabet[i].length; j++) {
                System.out.print(alphabet[i][j] + " "); // 하나 찍고 공백 띄운 후 나머지 하나 찍음
            }
            System.out.println(); // 한칸 아래로 줄개행
        }
    }
}
