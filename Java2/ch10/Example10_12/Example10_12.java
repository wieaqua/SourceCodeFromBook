import java.io.*;

public class Example10_12 {
    public static void main(String[] args) {
        String command = "渡江总攻事件是 4 月 22 日晚上 10 点";
        EncryptAndDecrypt person = new EncryptAndDecrypt();
        String password = "Tiger";
        String secret = person.encrypt(command, password); // 加密
        File file = new File("secret.txt");
        try {
            FileOutputStream fos = new FileOutputStream(file);
            DataOutputStream outData = new DataOutputStream(fos);
            outData.writeUTF(secret);
            System.out.println("加密命令:" + secret);
        } catch (IOException e) {
        }

        try {
            FileInputStream fis = new FileInputStream(file);
            DataInputStream inData = new DataInputStream(fis);
            String str = inData.readUTF();
            String mingwen = person.decrypt(str, password); // 解密
            System.out.println("解密命令:" + mingwen);
        } catch (IOException e) {
        }
    }
}