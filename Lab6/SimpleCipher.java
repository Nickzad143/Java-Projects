 class SimpleCipher {
    private String key;

    public SimpleCipher(String key) {
        if (key == null || key.length() != 8) {
            throw new IllegalArgumentException("Key must be 8 character string");
        }
        this.key = key;
    }

    public String encrypt(String message) {
        StringBuilder encryptedMessage = new StringBuilder();
        for (int i = 0; i < message.length(); i++) {
            char encryptedChar = (char) (message.charAt(i) + key.charAt(i % 8));
            encryptedMessage.append(encryptedChar);
        }
        return encryptedMessage.toString();
    }

    public String decrypt(String encryptedMessage) {
        StringBuilder decryptedMessage = new StringBuilder();
        for (int i = 0; i < encryptedMessage.length(); i++) {
            char decryptedChar = (char) (encryptedMessage.charAt(i) - key.charAt(i % 8));
            decryptedMessage.append(decryptedChar);
        }
        return decryptedMessage.toString();
    }

    public static void main(String[] args) {
        SimpleCipher cipher = new SimpleCipher("abcdefgh");
        String message = "Hello, World!";
        String encryptedMessage = cipher.encrypt(message);
        System.out.println("Encrypted Message: " + encryptedMessage);
        String decryptedMessage = cipher.decrypt(encryptedMessage);
        System.out.println("Decrypted Message: " + decryptedMessage);
    }
}
