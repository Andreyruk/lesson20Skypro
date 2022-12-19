import exceptions.WrongLoginException;
import exceptions.WrongPasswordException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EnterPassword {
    public String login;
    public String password;
    public String confirmPassword;

    private boolean validateNumber(String number) {
        if (number.matches("[a-z0-9_]{0,20}")) {
            return true;
        }
        return false;
    }

    public EnterPassword(String login, String password, String confirmPassword) {
        this.login = login;
        this.password = password;
        this.confirmPassword = confirmPassword;
    }

    public void check() {
        if (!validateNumber(this.login)) {
            throw new WrongLoginException("не неверный формат логина");
        }

        if (!validateNumber(this.password)) {
            throw new WrongPasswordException("не неверный формат пароля");
        } else {
            if (!this.password.equals(this.confirmPassword)) {
                throw new WrongPasswordException("не совпадает пароль");
            }
        }
    }

    //    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        System.out.println("Введите логин:");
//        String l = br.readLine();
//        if (!validateNumber(l)) {
//            throw new WrongLoginException("не неверный формат логина");
//        }
//        System.out.println("Введите пароль:");
//        String p = br.readLine();
//        if (!validateNumber(p)) {
//            throw new WrongPasswordException("не неверный формат пароля");
//        }
//        System.out.println("Подтвердите пароль:");
//        String cp = br.readLine();
//        if (!validateNumber(p)) {
//            throw new WrongPasswordException("не неверный формат пароля");
//        } else {
//            if (!p.equals(cp)) {
//                throw new WrongPasswordException("не совпадает пароль");
//            }
//        }
//
//
//    }
}
