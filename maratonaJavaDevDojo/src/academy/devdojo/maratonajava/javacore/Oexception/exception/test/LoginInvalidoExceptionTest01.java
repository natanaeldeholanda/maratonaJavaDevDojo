package academy.devdojo.maratonajava.javacore.Oexception.exception.test;

import academy.devdojo.maratonajava.javacore.Oexception.exception.dominio.LoginInvalidoException;

import java.util.Scanner;

public class LoginInvalidoExceptionTest01 {
    public static void main(String[] args) {
        try {
            logar();
        } catch (LoginInvalidoException e) {
            e.printStackTrace();
        }
    }

    private static void logar() throws LoginInvalidoException {
        Scanner scanner = new Scanner(System.in);
        String userNameDB = "Goku";
        String passwordDB = "Super Saiadin";
        System.out.println("Usuário: ");
        String userDigitado = scanner.nextLine();
        System.out.println("Senha");
        String passwordDigitado = scanner.nextLine();

        if (!userNameDB.equals(userDigitado) || !passwordDB.equals(passwordDigitado)) {
            throw new LoginInvalidoException("Usuário ou senha inválidos");
        }
        System.out.println("Login efetuado com sucesso!");
        scanner.close();
    }
}

