package Decryption;

public class DecryptionClass {

    public String decryptionInfo(String text) {
        StringBuilder builderOne = new StringBuilder();
        StringBuilder builderTwo = new StringBuilder();
        StringBuilder builderThree = new StringBuilder();
        StringBuilder builderFour = new StringBuilder();
        for (int i = 0; i < 16; i++) {

            while (i>=0&&i<4){
                builderOne.append(text.charAt(i));
                i++;
            }

            while (i>=4&&i<8){
                builderTwo.append(text.charAt(i));
                i++;
            }

            while (i>=8&&i<12){
                builderThree.append(text.charAt(i));
                i++;
            }

            while (i>=12&&i<16){
                builderFour.append(text.charAt(i));
                i++;
            }
        }
        int charOne = 0;
        StringBuilder resultOne = new StringBuilder();
        //--------------------------------------------------------------------------------------------------------------
        for (int i = 0; i < 4; i++) {
            int a = builderOne.charAt(i);
            int b = builderTwo.charAt(i);
            charOne = (a + b) / 2;
            if (charOne == 58 || charOne == 59 || charOne == 60 || charOne == 61 || charOne == 62 || charOne == 63 || charOne == 64) {
                charOne = 50;
                resultOne.append(((char) charOne));
            } else {
                resultOne.append((char) charOne);
            }
        }
        //--------------------------------------------------------------------------------------------------------------
        int charTwo = 0;
        StringBuilder resultTwo = new StringBuilder();
        for (int i = 0; i < 4; i++) {
            int a = builderFour.charAt(i);
            int b = builderThree.charAt(i);
            charTwo = (a + b) / 2;
            if (charTwo == 58 || charTwo == 59 || charTwo == 60 || charTwo == 61 || charTwo == 62 || charTwo == 63 || charTwo == 64) {
                charTwo = 48;
                resultTwo.append((char) charTwo);
            } else {
                resultTwo.append((char) charTwo);
            }
        }
        StringBuilder finalResult = new StringBuilder();
        finalResult.append(resultOne);
        finalResult.append(resultTwo);
        String finalCode = finalResult.toString();
        return finalCode;
    }

    public String decryptionInfoPro(String text) {

        StringBuilder builderOne=new StringBuilder();
        StringBuilder builderTwo=new StringBuilder();
        StringBuilder builderThree=new StringBuilder();
        StringBuilder builderFour=new StringBuilder();
        for (int i = 0; i < 16; i++) {

            while (i>=0&&i<4){
                builderOne.append(text.charAt(i));
                break;
            }

            while (i>=4&&i<8){
                builderTwo.append(text.charAt(i));
                break;
            }

            while (i>=8&&i<12){
                builderThree.append(text.charAt(i));
                break;
            }

            while (i>=12&&i<16){
                builderFour.append(text.charAt(i));
                break;
            }
        }
        int charOne = 0;
        StringBuilder resultOne = new StringBuilder();
        //--------------------------------------------------------------------------------------------------------------
        for (int i = 0; i < 4; i++) {
            int a = builderThree.charAt(i);
            int b = builderTwo.charAt(i);
            charOne = (a + b) / 2;
            if (charOne == 58 || charOne == 59 || charOne == 60 || charOne == 61 || charOne == 62 || charOne == 63 || charOne == 64) {
                charOne = 86;
                resultOne.append(((char) charOne));
            } else {
                resultOne.append((char) charOne);
            }
        }
        //--------------------------------------------------------------------------------------------------------------
        int charTwo = 0;
        StringBuilder resultTwo = new StringBuilder();
        for (int i = 0; i < 4; i++) {
            int a = builderFour.charAt(i);
            int b = builderOne.charAt(i);
            charTwo = (a + b) / 2;
            if (charTwo == 58 || charTwo == 59 || charTwo == 60 || charTwo == 61 || charTwo == 62 || charTwo == 63 || charTwo == 64) {
                charTwo = 67;
                resultTwo.append((char) charTwo);
            } else {
                resultTwo.append((char) charTwo);
            }
        }
        StringBuilder finalResult = new StringBuilder();
        finalResult.append(resultOne);
        finalResult.append(resultTwo);
        String finalCode = finalResult.toString();
        return finalCode;
    }
}
