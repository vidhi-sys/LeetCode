class Main {
    public static void main(String[] args) {
        String number = "696969";
        int i = 0;
        int j = number.length() - 1;
        boolean isStrobo = true;

        while (i <= j) {
            char left = number.charAt(i);
            char right = number.charAt(j);

            if ((left == '0' && right == '0') ||
                (left == '1' && right == '1') ||
                (left == '8' && right == '8') ||
                (left == '6' && right == '9') ||
                (left == '9' && right == '6')) {
                i++;
                j--;
            } else {
                isStrobo = false;
                break;
            }
        }

        if (isStrobo) {
            System.out.println("strobogrammatic");
        } else {
            System.out.println("not strobogrammatic");
        }
    }
}
