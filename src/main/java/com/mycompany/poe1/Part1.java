/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.poe1;

/**
 *
 * @author Student
 */
public class Part1 {

    public static void main(String[] args) {
          
        Login login = new Login(
        "k_1",
        "Password1!",
        "+27821234567",
        "Kgutso",
        "Khanyi"
        );
        System.out.print(login.registerUser());
        
        System.out.println(login.checkUserName());
        
        System.out.println(login.checkPasswordComplexity());
        
        System.out.println(login.checkCellPhoneNumber());
        
        System.out.println(login.loginUser("k_1", "Password1!"));
        
        System.out.println(login.returnLoginStatus());
    }
}
