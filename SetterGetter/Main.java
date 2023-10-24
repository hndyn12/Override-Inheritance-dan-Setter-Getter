/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SetterGetter;

/**
 *
 * @author X1
 */
public class Main {
    public static void main(String[] args) {
        User user = new User();
        user.SetUsername("Sri Handayani");
        user.Setpassword("Rahasia");
        
        System.out.println("Usernamenya = "+user.GetUsername());
        System.out.println("Passowrdnya = "+user.GetPassword());
    }
}
